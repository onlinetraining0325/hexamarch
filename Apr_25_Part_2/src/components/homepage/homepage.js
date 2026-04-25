import React, {Component} from 'react';
import { Link } from 'react-router-dom';

const HomePage = () => {
  return(
    <div>
      <p>Welcome to Home Page</p>
      <Link to="/customerLogin">Customer Login</Link>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/vendorLogin">Vendor Login</Link>

    </div>
  )
}

export default HomePage;