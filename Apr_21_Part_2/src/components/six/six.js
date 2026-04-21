import React, {Component, useState} from 'react';
import Menu from '../menu/menu';

const Six = () => {

  const[sname,setName] = useState('')

  const handleChange = event => {
    setName(event.target.value);
  }

  return(
    <div>
      <Menu /> <hr/>
      <form>
        <label>Enter Your Name  </label>
        <input type="text" name='sname' value={sname} onChange={handleChange} />
        <br/>
        <p>Student Name is : <b>{sname}</b></p>
      </form>
    </div>
  )
}
export default Six;