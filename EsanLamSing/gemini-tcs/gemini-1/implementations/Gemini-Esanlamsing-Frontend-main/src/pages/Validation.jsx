import axios from "axios";
import React, { useState, useEffect } from "react";
import Cookies from "js-cookie";

export default function Validation() {
  const [data, setData] = useState([]);
  const [id, setId] = useState(null);
  const [displayData, setDisplayData] = useState({});

  useEffect(() => {
    const fetchData = async () => {
      const res = await axios
        .get("http://localhost:3030/sp")
        .then((response) => {
          console.log(response.data);
          setData(response.data);
        });
    };
    fetchData();
  }, []);

  const handleChange = async (e) => {
    e.preventDefault();
    if (!e.target.value) {
      return setDisplayData({});
    }

    await axios
      .get(`http://localhost:3030/sp/${e.target.value}`)
      .then((response) => {
        console.log(response.data);
        setDisplayData(response.data);
        setId(e.target.value);
      });
  };

  const handleValidation = async () => {
    if (!id) {
      return alert("Select a science plan to validate");
    }
    if (Cookies.get("role") !== "Science Observer") {
      return alert("You are not authorized to validate a science plan");
    }
    await axios
      .post(`http://localhost:3030/vsp`, null, {
        params: { id: id },
      })
      .then((response) => {
        console.log(response.data);
        alert(response.data);
      })
      .catch((error) => {
        alert(error.response.data);
      });
  };

  const handleInvalidation = async () => {
    console.log(id);
    if (!id) {
      return alert("Select a science plan to invalidate");
    }
    if (Cookies.get("role") !== "Science Observer") {
      return alert("You are not authorized to invalidate a science plan");
    }
    await axios
      .post(`http://localhost:3030/ivsp`, null, {
        params: { id: id },
      })
      .then((response) => {
        console.log(response.data);
        alert(response.data);
      })
      .catch((error) => {
        alert(error.response.data);
      });
  };

  return (
    <div className="container mx-auto px-4 py-8">
      <h1 className="text-2xl font-bold text-center py-2">Validation</h1>
      <select
        onChange={handleChange}
        className="block appearance-none w-full bg-gray-200 border border-gray-200 text-gray-700 py-3 px-4 pr-8 rounded leading-tight focus:outline-none focus:bg-white focus:border-gray-500"
      >
        <option value="">Select a plan</option>
        {data.map((item, index) => (
          <option key={index} value={item.planNo}>
            {item.planNo} - {item.starSystem} created by {item.creator}
          </option>
        ))}
      </select>

      {/* table */}
      <table className="table-auto w-full mt-4">
        <thead>
          <tr>
            <th className="px-4 py-2">Star System</th>
            <th className="px-4 py-2">Objectives</th>
            <th className="px-4 py-2">Submitter</th>
            <th className="px-4 py-2">Status</th>
            <th className="px-4 py-2">Start Date</th>
            <th className="px-4 py-2">End Date</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td className="border px-4 py-2">{displayData.starSystem}</td>
            <td className="border px-4 py-2">{displayData.objectives}</td>
            <td className="border px-4 py-2">{displayData.submitter}</td>
            <td className="border px-4 py-2">{displayData.status}</td>
            <td className="border px-4 py-2">{displayData.startDate}</td>
            <td className="border px-4 py-2">{displayData.endDate}</td>
          </tr>
        </tbody>
      </table>
      <div className="text-center space-x-2">
        <button
          className="mt-4 bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded"
          onClick={handleValidation}
        >
          Validate
        </button>
        <button
          className="mt-4 bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded"
          onClick={handleInvalidation}
        >
          Invalidate
        </button>
      </div>
    </div>
  );
}
