import axios from 'axios';
import React, {Component, useState} from 'react';
import { useNavigate } from 'react-router-dom';

const CustomerLogin = () => {

  const [userName, setUserName] = useState("");
  const [passWord, setPassWord] = useState("");
  const [error, setError] = useState("");
  const navigate = useNavigate();


  const handleLogin = async () => {
    try {
      let uname = userName.trim();
      let pwd = passWord.trim();
      alert(uname);
      alert(pwd);
      const response = await axios.get(
        "http://localhost:1114/customerLogin/"+uname+"/"+pwd
       
      );
  
      alert(response.data);

      if (response.data == "1") {
        // alert("Entered");
        localStorage.setItem("cuser", userName);
        navigate("/customerMenu");
      } else {
        setError("Invalid username or password.");
      }

  
    } catch (err) {
      console.error(err);
    }
  };


  return(
    <div>
      <p>Welcome to Customer Login</p>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          handleLogin();
        }}
      >
        <div>
          <label>Username:</label>
          <input
            type="text"
            value={userName}
            onChange={(e) => setUserName(e.target.value)}
            placeholder="Enter username"
          />
        </div>

        <div>
          <label>Password:</label>
          <input
            type="password"
            value={passWord}
            onChange={(e) => setPassWord(e.target.value)}
            placeholder="Enter password"
          />
        </div>

        <button type="submit">
          Login
        </button>

        {error && <p>{error}</p>}
      </form>

    </div>
  )

}

export default CustomerLogin;