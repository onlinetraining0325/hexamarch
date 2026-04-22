import axios from 'axios';
import React, {Component, useState} from 'react';
import Menu from '../menu/menu';

const EmploySearch = () => {

  const[employResult, SetEmployResult] = useState({})
  const[empno,SetEmpno] = useState(0)

  const handleChange = event => {
    SetEmpno(event.target.value);
  }

  const search = () => {
    let eid = parseInt(empno);

    axios.get("http://localhost:1113/searchemploy/"+eid).then(
       (response) => {
        SetEmployResult(response.data);
       }
    )
  }

  return(
    <div>
      <Menu /> <hr/>
      <p>Employ Search Page</p>
      Employ No : 
      <input type="number" name='empno' value={empno} onChange={handleChange} />
      <br/><br/>
      <input type="button" value="Search" onClick={search} /> <hr/>
      Employ No : <b>{employResult.empno}</b> <br/>
      Employ Name : <b>{employResult.name}</b> <br/>
      Gender : <b>{employResult.gender}</b> <br/>
      Department : <b>{employResult.dept}</b> <br/>
      Designation : <b>{employResult.desig}</b> <br/>
      Basic : <b>{employResult.basic}</b> <br/>
      
    </div>
  )
}

export default EmploySearch;