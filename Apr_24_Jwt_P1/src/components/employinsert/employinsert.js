import React, {Component, useState} from 'react';
import AuthService from '../../services/AuthService';

const EmployInsert = () => {

  const[data,setState] = useState({
    name : '',
    gender : '',
    email : '',
    password : '',
    roles : '',
     
  })

  const addEmploy = () => {
    AuthService.register(data.name,data.gender,data.email,data.password,data.roles)
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
            Name : 
        <input type="text" name="name" value={data.name} 
            onChange={handleChange} /> <br/><br/>
              Gender : 
        <input type="password" name="gender" value={data.gender} 
            onChange={handleChange} /> <br/><br/>
         Email : 
         <input type="text" name="email" value={data.email} onChange={handleChange} /> <br/><br/>
        Password :
        <input type="password" name="password" value={data.password} 
          onChange={handleChange} /> <br/><br/>
        Roles : 
        <input type="text" name="roles" value={data.roles} onChange={handleChange} /> <br/><br/>
        <input type="button" value="Add Employ" onClick={addEmploy} />
      </form>
    </div>
  )
}

export default EmployInsert;