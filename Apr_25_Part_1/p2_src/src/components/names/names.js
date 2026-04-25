import React, {Component} from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { sam,kirupa,sajeetha } from '../../actions/actions';
const Names = () => {

  // Access the Sname value from the Redux Store 
  const sname = useSelector((state) => state.sname)

  const dispatch = useDispatch();

  return(
    <div>
      <p>Student Name is : <b>{sname}</b></p>
      <input type="button" value="Sam" onClick={() => dispatch(sam())} />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Kirupa" onClick={() => dispatch(kirupa())} />
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="button" value="Sajeetha" onClick={() =>dispatch(sajeetha())} />
      <p>This is My First Redux Example</p>
    </div>
  )
}

export default Names;