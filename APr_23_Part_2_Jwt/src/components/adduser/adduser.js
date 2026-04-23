import React, {Component, useState} from 'react';
import AuthService from '../../services/AuthService';

const AddUser = () => {

  const[data,setState] = useState({
    username : '',
    email : '',
    password : '',
    roles : ''
  })

  const addUser = () => {
    AuthService.register(data.username,data.email,data.password,data.roles)
        .then(response => {
            alert(response.data);
        })
  }
  const handleChange = event => {
    setState({
      ...data,[event.target.name]:event.target.value
    })   
  }

  return(
    <div>
       <form>
            User Name : 
        <input type="text" name="username" value={data.username} 
            onChange={handleChange} /> <br/><br/>
        Password :
        <input type="password" name="password" value={data.password} 
          onChange={handleChange} /> <br/><br/>
        Email : 
        <input type="text" name="email" value={data.email} onChange={handleChange} /> <br/><br/>
        Roles : 
        <input type="text" name="roles" value={data.roles} onChange={handleChange} /> <br/><br/>
        <input type="button" value="Add User" onClick={addUser} />
      </form>
    </div>
  )
}

export default AddUser;