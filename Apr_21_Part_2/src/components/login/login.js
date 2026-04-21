import React, {Component, useState} from 'react';
import { useNavigate } from 'react-router-dom';

const Login = () => {

  const navigate = useNavigate();

  const[error,setError] = useState('')

  const [data, setData] = useState({
      userName : '',
      passCode : ''
  })

  const handleChange = event => {
    setData({
        ...data,[event.target.name] : event.target.value  
    })
}

const handleSubmit = () => {
  let user =data.userName;
  let pwd = data.passCode;

  if (user=="Hexaware" && pwd == "Hexaware") {
    // alert("Correct Credentials...");
    navigate("/menu");
  } else {
    setError("Invalid Credentials...");
    // alert("Invalid Credentials...");
  }
}


  return(
    <div>
    <form>
       <label>
          User Name : </label>
         <input type="text" name="userName" onChange={handleChange}
                  value={data.userName} /> <br/><br/>
         <label>Password</label> 
         <input type="password" name="passCode" onChange={handleChange}
               value={data.passCode} /> <br/><br/>
        <input type="button" value="Login" onClick={handleSubmit} />
        <p>{error}</p>
  </form>
</div>

  )
}

export default Login;