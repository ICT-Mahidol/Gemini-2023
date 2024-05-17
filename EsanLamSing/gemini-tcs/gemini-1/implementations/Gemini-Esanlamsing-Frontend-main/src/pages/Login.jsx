import React, { useState, useContext } from "react";
import { UserContext } from "../UserContext";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import Cookies from "js-cookie";
export default function Login() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const navigate = useNavigate();
  const { userInfo, setUserInfo, isLoggedIn, setIsLoggedIn } =
    useContext(UserContext);

  const handleSubmit = async (e) => {
    e.preventDefault();
    const user = { email, password };
    await axios
      .post("http://localhost:3030/users/login", null, {
        params: { email: email, password: password },
      })
      .then((response) => {
        // console.log(response.data);
        const { userID, email, role } = response.data;
        Cookies.set("userID", userID);
        Cookies.set("email", email);
        Cookies.set("role", role);
        setIsLoggedIn(true);
        Cookies.set("isLoggedIn", true);
        navigate("/");
      })
      .catch((err) => {
        setError(err.response.data.message);
      });

      // await axios.get("http://localhost:3030/autosp", {
      //   params: { email: email }
      // }).then(response => {
      //   console.log("Science plans generated:", response.data);
      //   navigate("/");
      // }).catch(err => {
      //   console.error("Error generating science plans:", err.response.data);
      //   setError("Failed to auto-generate science plans: " + err.response.data.message);
      // });
  };

  return (
    <div className="container mx-auto">
      <form
        onSubmit={handleSubmit}
        className="flex flex-col items-center justify-center my-52 space-y-4"
      >
        <h1 className="text-xl font-semibold">Login</h1>
        <label htmlFor="email">
          Email
          <input
            type="email"
            placeholder="test@example.com"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            className="mt-1 block w-72 rounded-md border-gray-300 shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
            required
          />
        </label>
        <label htmlFor="password">
          Password
          <input
            type="password"
            placeholder="Enter Your Password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            className="mt-1 block w-72 rounded-md border-gray-300 shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
            required
          />
        </label>
        <button
          type="submit"
          className="bg-blue-500 text-white p-2 m-2 rounded-md w-72"
        >
          Login
        </button>
        {error ? (
          <div role="alert" className="alert alert-error w-72">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              className="stroke-current shrink-0 h-6 w-6"
              fill="none"
              viewBox="0 0 24 24"
            >
              <path
                strokeLinecap="round"
                strokeLinejoin="round"
                strokeWidth="2"
                d="M10 14l2-2m0 0l2-2m-2 2l-2-2m2 2l2 2m7-2a9 9 0 11-18 0 9 9 0 0118 0z"
              />
            </svg>
            <span>{error}</span>
          </div>
        ) : null}
      </form>
    </div>
  );
}
