import React, { useState, useEffect } from "react";
import axios from "axios";
import CustomerMenu from "../customermenu/customermenu";

const CustomerInfo = () => {
  const [customer, setCustomer] = useState({});

  useEffect(() => {
    const fetchCustomer = async () => {
      try {
        const user = localStorage.getItem("cuser");
        if (!user) {
          console.warn("No customer found in localStorage.");
          return;
        }

        const response = await axios.get(
          `http://localhost:1114/searchByCustomerUserName/${user}`
        );

        setCustomer(response.data);
        localStorage.setItem("cid", response.data.cusId);
        console.log(response.data);
      } catch (error) {
        console.error("Error fetching customer info:", error);
      }
    };

    fetchCustomer();
  }, []); // Empty dependency array = runs once on mount

  return (
    <div>
      <CustomerMenu />
      <h2>Customer Information</h2>

      <div>
        <p>
          <strong>Customer Id:</strong> {customer.cusId}
        </p>
        <p>
          <strong>Customer Name:</strong> {customer.cusName}
        </p>
        <p>
          <strong>Phone Number:</strong> {customer.cusPhnNo}
        </p>
        <p>
          <strong>Username:</strong> {customer.cusUsername}
        </p>
        <p>
          <strong>Password:</strong> {customer.cusPassword}
        </p>
        <p>
          <strong>Email:</strong> {customer.cusEmail}
        </p>
      </div>
    </div>
  );
};


export default CustomerInfo;