import axios from 'axios';
import React, {Component, useState} from 'react';

const UserSearch = () => {

  const[userResult, SetUserResult] = useState({})
  const[userId, SetUserId] = useState(0)

  const handleChange = event => {
    SetUserId(event.target.value);
  }

  const show = () => {
    let uid = parseInt(userId);

    axios.get("https://jsonplaceholder.typicode.com/users/" +uid).then(
      (response) => {
        SetUserResult(response.data)
      }
    )
  }

  return(
    <div>
      <p>User Search Page</p>
      User Id : 
      <input type="number" name='userId' 
        value={userId} onChange={handleChange} /> 
        <br/><br/>
      <input type="button" value="Show" 
        onClick={show} /> 
      <hr/>
      User Id : <b> {userResult.id}</b> <br/> 
      Name is : <b>{userResult.name}</b> <br/>
      User Name : <b>{userResult.username}</b><br/>
      Email : <b>{userResult.email}</b> <br/>
      Phone : <b>{userResult.phone}</b> <br/>
      Website : <b>{userResult.website} </b> <br/>
    </div>
  )
}

export default UserSearch;