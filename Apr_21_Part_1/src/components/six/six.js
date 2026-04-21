import React, {Component, useState} from 'react';

const Six = () => {

  const[sname,setName] = useState('')

  const handleChange = event => {
    setName(event.target.value);
  }

  return(
    <div>
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