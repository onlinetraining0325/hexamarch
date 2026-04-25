import React, {Component} from 'react';
import { increment,decrement,power,cube } from '../../actions/CounterActions';
import { useDispatch, useSelector } from 'react-redux';

const CounterComponent = () => {

  const count = useSelector( (state) => state.count)

  const dispatch = useDispatch();

  return (
    <div>
      Result is : <b>{count}</b> <hr/>
      <input type="button" value="Increment" 
        onClick={() => dispatch(increment())} /> 
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Decrement" 
       onClick={() => dispatch(decrement())} /> 
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Power" 
       onClick={() => dispatch(power())} />
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Cube" 
      onClick={() => dispatch(cube())} />

    </div>
  )
}

export default CounterComponent;