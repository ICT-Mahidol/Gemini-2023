import React, { useEffect, useState } from "react";
import axios from "axios";

export default function Register() {
  const [isSuccess, setIsSuccess] = useState(false);

  useEffect(() => {
    const autoCreateUser = async (email, password, role) => {
      await axios
        .post("http://localhost:3030/users/register", null, {
          params: {
            email: email,
            password: password,
            role: role,
          },
        })
        .then((res) => {
          setIsSuccess(true);
          console.log(res.data);
        })
        .catch((err) => {
          console.log(err);
        });
    };
    autoCreateUser("test@gmail.com", "password", "Astronomer");
    autoCreateUser("test1@gmail.com", "password", "Science Observer");
    autoCreateUser("test2@gmail.com", "password", "Visitor");
  }, []);

  return (
    <div className="container mx-auto px-4 py-4">
      <h1>Auto Register</h1>
      {isSuccess && (
        <>
          <p>Email: test@gmail.com password: password role: Astronomer</p>
          <p>
            Email: test1@gmail.com password: password role: Science Observer
          </p>
          <p>Email: test2@gmail.com password: password role: Visitor</p>
        </>
      )}
    </div>
  );
}
