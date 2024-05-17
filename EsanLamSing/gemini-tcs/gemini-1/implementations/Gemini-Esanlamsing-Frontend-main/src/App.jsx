import { useState, useEffect, useContext } from "react";
import "./App.css";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import Cookies from "js-cookie";

export default function App() {
  const [data, setData] = useState([]);
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  useEffect(() => {
    // if (Cookies.get("isLoggedIn") !== "true") {
    //   navigate("/login");
    // }
    console.log(Cookies.get("isLoggedIn"));
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

  useEffect(() => {
    const checkLogin = async () => {
      if (Cookies.get("isLoggedIn") === "true") {
        setIsLoggedIn(true);
      }
    };
    checkLogin();
  }, []);

  return (
    <div className="container mx-auto p-4 my-3">
      <h1 className="text-2xl font-semibold text-center">All Science Plans</h1>
      {isLoggedIn ? (
        <div className="overflow-x-auto">
          <table className="mx-auto table-auto border-collapse border border-gray-400 mt-4">
            <thead>
              <tr>
                <th className="px-4 py-2 bg-gray-100">Plan No</th>
                <th className="px-4 py-2 bg-gray-100">Star System</th>
                <th className="px-4 py-2 bg-gray-100">Status</th>
                <th className="px-4 py-2 bg-gray-100">Telescope Location</th>
                <th className="px-4 py-2 bg-gray-100">Creator</th>
                <th className="px-4 py-2 bg-gray-200">Objectives</th>
                <th className="px-4 py-2 bg-gray-200">Start Date - End Date</th>
              </tr>
            </thead>
            <tbody>
              {data.map((item, index) => (
                <tr key={index}>
                  <td className="border px-4 py-2">{item.planNo}</td>
                  <td className="border px-4 py-2">{item.starSystem}</td>
                  <td className="border px-4 py-2">{item.status}</td>
                  <td className="border px-4 py-2">{item.telescopeLocation}</td>
                  <td className="border px-4 py-2">{item.creator}</td>
                  <td className="border px-4 py-2">{item.objectives}</td>
                  <td className="border px-4 py-2">
                    {item.startDate} - {item.endDate}
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      ) : (
        <div>Not Logged In</div>
      )}
    </div>
  );
}
