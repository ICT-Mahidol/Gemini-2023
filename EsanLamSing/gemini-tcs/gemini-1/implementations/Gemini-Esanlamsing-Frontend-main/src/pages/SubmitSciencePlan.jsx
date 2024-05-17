import React, { useEffect, useState } from "react";
import axios from "axios";
import Cookies from "js-cookie";

export default function SubmitSciencePlan() {
  const [data, setData] = useState([]);
  const [id, setId] = useState(null);
  const [modalText, setModalText] = useState("");
  const [showModal, setShowModal] = useState(false);
  const [status, setStatus] = useState("");
  const [loading, setLoading] = useState(false);
  const [testing, setTesting] = useState(false);

  useEffect(() => {
    const fetchData = async () => {
      const res = await axios
        .get("http://localhost:3030/sp")
        .then((response) => {
          // console.log(response.data);
          setData(response.data);
        });
    };
    fetchData();
  }, []);

  useEffect(() => {
    if (!id) {
      return;
    }
    handleStatus();
  }, [id]);

  const handleStatus = async () => {
    await axios.get(`http://localhost:3030/sp/${id}`).then((response) => {
      console.log(response.data);
      setStatus(response.data.status);
    });
  };

  // const handleTest = async (e) => {
  //   e.preventDefault();
  //   if (!id) {
  //     alert("Select a science plan to submit");
  //     return;
  //   }
  //   if (Cookies.get("role") !== "Astronomer") {
  //     alert("You are not authorized to test a science plan");
  //     return;
  //   }
  //   handleStatus();
  //   setTesting(() => true);
  //   await axios
  //     .post(`http://localhost:3030/tsp`, null, {
  //       params: { id: id },
  //     })
  //     .then((response) => {
  //       console.log(response.data);
  //       setModalText(() => response.data);
  //       handleStatus();
  //       setShowModal(true);
  //     })
  //     .catch((err) => {
  //       setModalText(() => err.response.data);
  //       setShowModal(true);
  //     })
  //     .finally(() => {
  //       setTesting(() => false);
  //     });
  // };
  const handleTest = async (e) => {
    e.preventDefault();
  
    // Check if the id is present before proceeding
    if (!id) {
      alert("Select a science plan to test");
      return;
    }
  
    handleStatus();  // Assume this manages some UI status elements
  
    try {
      // Fetch the science plan details
      const response = await axios.get(`http://localhost:3030/sp/${id}`);
      console.log(response.data)
      const { userId } = response.data;
      // console.log(typeof userId);
      // console.log(typeof Cookies.get("userID"));
      // Compare fetched plan number with user's id stored in cookies
      if (Cookies.get("userID") === userId.toString()) {
        setTesting(true);  // Set testing state to true
  
        // Post request to initiate testing on the plan
        const testResponse = await axios.post(`http://localhost:3030/tsp`, null, { params: { id: id } });
        console.log(testResponse.data);
        setModalText(() => testResponse.data);  // Update modal text with response
        setShowModal(true);  // Show modal with results
      } else {
        // If the plan number does not match, alert the user or handle appropriately
        alert("User ID does not match the plan number.");
      }
    } catch (err) {
      // Handle errors from any of the async operations
      console.error(err);
      setModalText(() => err.response?.data || "An error occurred");
      setShowModal(true);
    } finally {
      // Finally block to reset testing status, regardless of outcome
      setTesting(false);
      handleStatus();
    }
  };

  const handleSubmit = async () => {
    if (!id) {
      alert("Select a science plan to submit");
      return;
    }
    if (Cookies.get("role") !== "Astronomer") {
      alert("You are not authorized to submit a science plan");
      return;
    }
    await axios
      .post("http://localhost:3030/ssp", null, {
        params: { id: id },
      })
      .then((reponse) => {
        setModalText(() => reponse.data);
        handleStatus();
        setShowModal(true);
      })
      .catch((err) => {
        setModalText(() => err.response.data);
        setShowModal(true);
      });
  };

  const handleCloseModal = () => {
    setShowModal(false);
  };

  return (
    <div className="container mx-auto px-4 py-8 max-w-md shadow-lg bg-white rounded-lg">
      <h1 className="text-center text-2xl font-bold text-gray-700 mb-6">
        Select Science Plan to Submit
      </h1>
      <form>
        <div className="mb-4">
          <label className="block text-gray-700 text-sm font-bold mb-2">
            Science Plan
          </label>
          <select
            onChange={(e) => setId(e.target.value)}
            className="block appearance-none w-full bg-gray-200 border border-gray-200 text-gray-700 py-3 px-4 pr-8 rounded leading-tight focus:outline-none focus:bg-white focus:border-gray-500"
          >
            <option value="">Select a plan</option>
            {data.map((item, index) => (
              <option key={index} value={item.planNo}>
                {item.planNo} - {item.starSystem} created by {item.creator}
              </option>
            ))}
          </select>
        </div>
        <div className="mb-4">
          Plan Status: {id == 0 ? "You did not select any plan" : status}
        </div>
        <div className="flex space-x-4 mb-4">
          <button
            type="button"
            onClick={handleTest}
            disabled={
              id == null ||
              status === "TESTED" ||
              status === "SUBMITTED" ||
              status === "VALIDATED" ||
              testing === true
                ? true
                : false
            }
            className={`${
              id == null ||
              status === "TESTED" ||
              status === "SUBMITTED" ||
              status === "VALIDATED"
                ? "bg-slate-700"
                : "bg-blue-500 hover:bg-blue-700"
            } flex-1  text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline`}
          >
            Test
          </button>
          <button
            type="button"
            onClick={handleSubmit}
            disabled={
              id == null ||
              status === "SAVED" ||
              status === "SUBMITTED" ||
              status === "VALIDATED"
                ? true
                : false
            }
            className={`${
              id == null ||
              status === "SAVED" ||
              status === "SUBMITTED" ||
              status === "VALIDATED"
                ? "bg-slate-700"
                : "bg-green-500 hover:bg-green-700"
            } flex-1  text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline`}
          >
            Submit
          </button>
        </div>
        <div className="text-center space-x-2">
          <h1 className="text-2xl font-bold text-center py-2">
            {testing ? "Testing.." : null}
          </h1>
        </div>
        {showModal && (
          <div className="fixed inset-0 bg-gray-600 bg-opacity-50 overflow-y-auto h-full w-full px-4">
            <div className="relative top-20 mx-auto p-5 border w-96 shadow-lg rounded-md bg-white">
              <div className="mt-3 text-center">
                {/* Conditionally render icons and backgrounds based on testStatus and submitStatus */}
                <div
                  className="mx-auto flex items-center justify-center h-12 w-12 rounded-full"
                  style={{
                    backgroundColor:
                      status === "TESTED" || status === "SUBMITTED"
                        ? "bg-green-100"
                        : "bg-red-100",
                  }}
                >
                  {status === "TESTED" || status === "SUBMITTED" ? (
                    <svg
                      className="h-6 w-6 text-green-600"
                      fill="none"
                      viewBox="0 0 24 24"
                      stroke="currentColor"
                    >
                      <path
                        strokeLinecap="round"
                        strokeLinejoin="round"
                        strokeWidth={2}
                        d="M9 12l2 2 4-4"
                      />
                    </svg>
                  ) : (
                    <svg
                      className="h-6 w-6 text-red-600"
                      fill="none"
                      viewBox="0 0 24 24"
                      stroke="currentColor"
                    >
                      <path
                        strokeLinecap="round"
                        strokeLinejoin="round"
                        strokeWidth={2}
                        d="M6 18L18 6M6 6l12 12"
                      />
                    </svg>
                  )}
                </div>
                {/* Title of Modal */}
                <h3 className="text-lg leading-6 font-medium text-gray-900">
                  {status === "TESTED" || status === "SUBMITTED"
                    ? "Success"
                    : "Error"}
                </h3>
                <div className="mt-2 px-7 py-3">
                  <p className="text-sm text-gray-500">
                    {modalText || "Operation failed. Please try again."}
                  </p>
                  {/* <p className="text-sm text-gray-500 mt-2">{testData}</p> */}
                </div>
                <div className="items-center px-4 py-3">
                  <button
                    onClick={handleCloseModal}
                    className="px-4 py-2 bg-green-500 text-white text-base font-medium rounded-md w-full shadow-sm hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-green-300"
                  >
                    Close
                  </button>
                </div>
              </div>
            </div>
          </div>
        )}
      </form>
    </div>
  );
}
