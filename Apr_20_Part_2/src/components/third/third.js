import React, {Component} from 'react';

const Third = (props) => {

  return(
    <div>
      <p>First Name : <b>{props.firstName}</b></p>
      <p>Last Name : <b>{props.lastName}</b></p>
      <p>Company : <b>{props.company}</b></p>
    </div>
  )
}

export default Third;