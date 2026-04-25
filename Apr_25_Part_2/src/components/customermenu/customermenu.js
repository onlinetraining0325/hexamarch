import React, {Component} from 'react';
import { Link } from 'react-router-dom';


const CustomerMenu = () => {

  return(
    <div>
      <p>Welcome to Customer Menu</p>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerInfo">Customer Info</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerWallet">Customer Wallet</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerOrders">Customer Orders</Link>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <Link to="/customerPendingOrders">Customer Pending Orders</Link>
    </div>
  )
}

export default CustomerMenu;