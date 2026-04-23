import React, {Component, useEffect, useRef, useState} from 'react';

const RefEx2 = () => {

  const [inputValue,setInputValue] = useState("");
  const count = useRef(0);

  useEffect(() => {
    count.current = count.current + 1;
   })

  return(
    <div>
    <input type="text" value={inputValue}
             onChange={ (e) => setInputValue(e.target.value)} />
   <hr/>
    Render Count as How Many Times we changed TextBox 
             value : <b> {count.current}</b>
 </div>

  )
}

export default RefEx2;