import axios from 'axios';
import React, {Component, useEffect, useState} from 'react';
import CustomerMenu from '../customermenu/customermenu';

const CustomerWallet = () => {
  const [wallet, setWallet] = useState([]);

  useEffect(() => {
    const fetchWallet = async () => {
      try {
        const cid = localStorage.getItem("cid");
        if (!cid) {
          console.warn("Customer ID not found in localStorage.");
          return;
        }

        const response = await axios.get(
          `http://localhost:1114/showCustomerWallets/${cid}`
        );
        setWallet(response.data);
        console.log("Wallet data:", response.data);
      } catch (error) {
        console.error("Error fetching wallet details:", error);
      }
    };

    fetchWallet();
  }, []); // Runs only once when component mounts

  return (
    <div>
      <CustomerMenu />
      <h2>Customer Wallet Details</h2>

      <table border="3">
        <thead>
          <tr>
            <th>Customer Id</th>
            <th>Wallet Id</th>
            <th>Wallet Source</th>
            <th>Wallet Amount</th>
          </tr>
        </thead>
        <tbody>
          {wallet.length > 0 ? (
            wallet.map((w) => (
              <tr key={w.walId}>
                <td>{w.cusId}</td>
                <td>{w.walId}</td>
                <td>{w.walSource}</td>
                <td>{w.walAmount}</td>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="4">
                No wallet information found.
              </td>
            </tr>
          )}
        </tbody>
      </table>
    </div>
  );
};


export default CustomerWallet;