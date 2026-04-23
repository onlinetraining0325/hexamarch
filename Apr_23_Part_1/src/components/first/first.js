import React, {Component,useContext} from 'react';
import { UserContext } from '../../context/UserContext';

const First = () => {
  const user = useContext(UserContext)
  return(
    <div>
      <p>First Component</p>
      <p>User Name : <b>{user.userName}</b></p>
      <p>Companuy : <b>{user.company}</b></p>
      <p>Topic : <b>{user.topic}</b></p>
    </div>
  )
}

export default First;