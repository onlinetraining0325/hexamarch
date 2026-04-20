import React, {Component, useState} from 'react';

const Four = () => {

  const [name,setName] = useState('')

  const poojitha = () => {
    setName("Hi I am Poojitha");
  }

  const sam = () => {
    setName("Hi I am Sam Arlin...");
  }

  const durga = () => {
    setName("Hi I am Durga Devi...");
  }

  const geetha = () => {
    setName("Hi I am Geetha Lekshmi...");
  }
  return(
    <div>
      <input type="button" value="Poojitha" onClick={poojitha} />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Sam" onClick={sam} />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Durga" onClick={durga} />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Geetha" onClick={geetha} />
      <hr/>
      Name is : <b>{name}</b>
    </div>
  )
}

export default Four;