import React, {Component, useMemo, useState} from 'react';

const Memo3 = () => {

  const[days,setDays] = useState(0)
  const daySal = 8000;

  const payment = (days) => {
    return daySal * days;
  }

  const takehome = (days) => {
    return payment(days) - (payment(days)/10);
  }

  const actualAmount = useMemo(() => payment(days), [days]);
  const takeHome = useMemo(() => takehome(days), [days]);

  return(
    <div>
      <p>This is Memo 3</p>
      <label>Enter No.of Working Days </label>
      <input type="number" value={days} 
        onChange={ (e) => setDays(e.target.value)} /> 
        <br/><br/>
      <p>Actual Amount :<b> {actualAmount}</b> </p>
      <p>Take Home : <b> {takeHome}</b></p>
    </div>
  )
}

export default Memo3;