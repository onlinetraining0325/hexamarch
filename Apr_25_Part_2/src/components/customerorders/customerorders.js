import axios from 'axios';
import React, {Component, useEffect, useState} from 'react';
import { Link } from 'react-router-dom';
import CustomerMenu from '../customermenu/customermenu';

const CustomerOrders = () => {
  const [orders, setOrders] = useState([]);

  useEffect(() => {
    const fetchOrders = async () => {
      try {
        const cid = localStorage.getItem("cid");
        if (!cid) {
          console.warn("No customer ID found in localStorage.");
          return;
        }

        const response = await axios.get(
          `http://localhost:1114/showCustomerOrders/${cid}`
        );
        setOrders(response.data);
        console.log(response.data);
      } catch (error) {
        console.error("Error fetching customer orders:", error);
      }
    };

    fetchOrders();
  }, []); // Runs once on component mount

  return (
    <div>
      <CustomerMenu />
      <h2>Customer Orders</h2>

      <table align="center" border="3">
        <thead>
          <tr>
            <th>Order Id</th>
            <th>Customer Id</th>
            <th>Menu Id</th>
            <th>Vendor Id</th>
            <th>Wallet Source</th>
            <th>Order Quantity</th>
            <th>Bill Amount</th>
            <th>Order Status</th>
            <th>Order Comments</th>
          </tr>
        </thead>
        <tbody>
          {orders.length > 0 ? (
            orders.map((order) => (
              <tr key={order.ordId}>
                <td>{order.ordId}</td>
                <td>{order.cusId}</td>
                <td>{order.menId}</td>
                <td>{order.venId}</td>
                <td>{order.walSource}</td>
                <td>{order.ordQuantity}</td>
                <td>{order.ordBillamount}</td>
                <td>{order.ordStatus}</td>
                <td>{order.ordComments}</td>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="9">
                No orders found.
              </td>
            </tr>
          )}
        </tbody>
      </table>
    </div>
  );
};

export default CustomerOrders;