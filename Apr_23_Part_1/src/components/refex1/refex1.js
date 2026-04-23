import React, {Component, useEffect, useRef, useState} from 'react';

const RefEx1 = () => {
  const[count,SetCount] = useState(0)
  const prevCountRef = useRef();

  useEffect(() => {
    prevCountRef.current = count;
  }, [count])

  return(
    <div>
       <input type="button" value="Increment" 
        onClick={() => SetCount(count+1)} /> 
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Decrement"
        onClick={() => SetCount(count-1)} /> <hr/> 
      <p>Previous Count Value : {prevCountRef.current}</p>
      <p>Actual Value : {count}</p>

      <p>Example for Reference Example 1</p>
    </div>
  )
}

export default RefEx1;