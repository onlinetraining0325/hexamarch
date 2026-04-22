import React, {Component} from 'react';
import { Link } from 'react-router-dom';

const Menu = () => {

  return(
    <div>
      <p>Welcome to Menu Page</p>
      <Link to="/employshow">Employ Show</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/employsearch">Employ Search</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/addemploy">Add Emplooy</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/updateemploy">Update Employ</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/deleteemploy">Delete Employ</Link>

    </div>
  )
}

export default Menu;