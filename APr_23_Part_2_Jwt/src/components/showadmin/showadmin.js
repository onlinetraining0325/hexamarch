import axios from 'axios';
import React, {Component, useState} from 'react';

const ShowAdmin = () => {

  const [message, setMessage] = useState('');
  const show = async () => {
    const token = JSON.parse(localStorage.getItem("token"))
    // const token = "abc";
    alert("Token From Admin is  " +token);

    const response = await axios.get('http://localhost:1155/auth/admin/adminProfile', {
      headers: {
          Authorization: 'Bearer ' + token
      }
   
  });
  // alert(response.data);
  setMessage(response.data);
     }
  return(   
    <div>
        <input type="button" value="Show Protected" onClick={show} /> <br/><br/>
        {message}
    </div>
  )
}

export default ShowAdmin