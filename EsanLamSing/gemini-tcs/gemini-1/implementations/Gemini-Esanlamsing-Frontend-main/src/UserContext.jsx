import { createContext, useState } from "react";

export const UserContext = createContext({});

export function UserProvider({ children }) {
  const [userInfo, setUserInfo] = useState({});
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <UserContext.Provider
      value={{ userInfo, setUserInfo, isLoggedIn, setIsLoggedIn }}
    >
      {children}
    </UserContext.Provider>
  );
}
