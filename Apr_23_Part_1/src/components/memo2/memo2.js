import React, {Component, useMemo, useState} from 'react';

const Memo2 = () => {

  const [name,SetName] = useState("Welcome to React Programming...")
  
  const lowerCase = (name) => {
    return name.toLowerCase();
  }

  const upperCase = (name) => {
    return name.toUpperCase();
  }

  const result1 = useMemo( () => lowerCase(name), [name]);
  const result2 = useMemo( () => upperCase(name), [name]);

  return(
    <div>
      <p>This is Memo Example 2</p>
      <p>Enter Your Name 
        <input type="text" name="name" value={name} 
            onChange={(e) => SetName(e.target.value)} />
      </p> <hr/> 
      <p>{result1}</p>
      <p>{result2}</p>
      </div>
  )
}

export default Memo2