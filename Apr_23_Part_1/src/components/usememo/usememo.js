import React, {Component, useMemo, useState} from 'react';

const UseMemo = () => {

  const[number,SetNumber] = useState(0)

  const squareNumber = (n) => {
    return Math.pow(n,2);
  }

  const result = useMemo(() => squareNumber(number),[number])

  return(
    <div>
        <h1>Memory Example</h1>
        Enter a Number : 
        <input type="number" name="number" value={number} 
        onChange={ (e) => SetNumber(e.target.value)} /> <br/><br/>
        <p>Result is : <b>{result}</b></p>
    </div>
  )

}

export default UseMemo;