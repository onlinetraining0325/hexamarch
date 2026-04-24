import axios from 'axios';
import React, {Component, useState} from 'react';

const EmployShow = () => {
  const [employs,setEmployData] = useState([])
  const showEmploy = async () => {
 

    const token = JSON.parse(localStorage.getItem("token"))
    // const token = "abc";
    alert("Token From Admin is  " +token);

    const response = await axios.get('http://localhost:1122/employ/showEmploy', {
      headers: {
          Authorization: 'Bearer ' + token
      }   
  });
  setEmployData(response.data);
  }
  return(
    <div>
      <p>Employ Show Details</p>
      <input type="button" value="Show Employ" onClick={showEmploy} /> <br/><br/>
      <table border="3" align="center">
        <tr>
          <th>Employ No</th>
          <th>Employ Name</th>
          <th>Gender</th>
          <th>Email</th>
          <th>Password</th>
          <th>Roles</th>
        </tr>
        {employs.map((item) => 
          <tr>
            <td>{item.eid}</td>
            <td>{item.name}</td>
            <td>{item.gender}</td>
            <td>{item.email}</td>
            <td>{item.password}</td>
            <td>{item.roles}</td>
          </tr>
        )}
      </table>
    </div>
  )
}

export default EmployShow;