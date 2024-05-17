import React, { useState, useRef, useEffect, useContext } from "react";
import { UserContext } from "../UserContext";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import { Link } from "react-router-dom";
import Cookies from "js-cookie";

export default function Navbar(props) {
  const navigate = useNavigate();
  const { userInfo, setUserInfo, isLoggedIn, setIsLoggedIn } =
    useContext(UserContext);

  const [isToggle, setIsToggle] = useState(false);

  useEffect(() => {
    const checkLogin = async () => {
      if (Cookies.get("isLoggedIn") === "true") {
        setIsLoggedIn(true);
      }
    };
    checkLogin();
  });

  const handleLogout = async () => {
    setIsLoggedIn(false);
    Cookies.remove("isLoggedIn");
    Cookies.remove("email");
    Cookies.remove("role");
    setUserInfo(null);
    navigate("/login");
  };

  const handleToggle = () => {
    setIsToggle(!isToggle);
  };

  return (
    <div className="bg-gray-700 text-white">
      <div className="container mx-auto p-4">
        <div className="flex items-center justify-between">
          <div className="text-white text-2xl font-medium">
            <Link to="/">Gemini System</Link>
          </div>
          {/* Button */}
          <div className="md:hidden">
            <button onClick={handleToggle} className="focus:outline-none">
              <svg
                className="w-6 h-6"
                fill="none"
                stroke="currentColor"
                viewBox="0 0 24 24"
                xmlns="http://www.w3.org/2000/svg"
              >
                <path
                  strokeLinecap="round"
                  strokeLinejoin="round"
                  strokeWidth="2"
                  d="M4 6h16M4 12h16M4 18h16"
                ></path>
              </svg>
            </button>
          </div>
          {/* PC Screen */}
          <ul className="hidden md:flex space-x-4">
            <li>
              <Link to="/">Home</Link>
            </li>

            {isLoggedIn ? (
              <>
                <li>
                  <Link to="/special">Install New config</Link>
                </li>
                <li>
                  <Link to="/validation">Validate</Link>
                </li>
                <li>
                  <Link to="/submit">Submit Science Plan</Link>
                </li>
                <li>
                  <button onClick={handleLogout}>Logout</button>
                </li>
              </>
            ) : (
              <>
                <li>
                  <Link to="/register">Register</Link>
                </li>
                <li>
                  <Link to="/login">Login</Link>
                </li>
              </>
            )}
          </ul>
        </div>
        {/* Mobile Screen */}
        <div>
          {isToggle && (
            <ul
              className={`mt-4 flex-col md:hidden space-y-4 transform transition-all duration-500 ${
                isToggle
                  ? "opacity-100 translate-y-0"
                  : "opacity-0 -translate-y-4 pointer-events-none"
              }`}
            >
              <li>
                <Link to="/">Home</Link>
              </li>
              {isLoggedIn ? (
                <>
                  <li>
                    <Link to="/special">Install New config</Link>
                  </li>
                  <li>
                    <Link to="/validation">Validate</Link>
                  </li>
                  <li>
                    <Link to="/submit">Submit Science Plan</Link>
                  </li>
                  <li>
                    <Link to="/register">Register</Link>
                  </li>
                  <li>
                    <button onClick={handleLogout}>Logout</button>
                  </li>
                </>
              ) : (
                <>
                  <li>
                    <Link to="/register">Register</Link>
                  </li>
                  <li>
                    <Link to="/login">Login</Link>
                  </li>
                </>
              )}
            </ul>
          )}
        </div>
      </div>
    </div>
  );
}
