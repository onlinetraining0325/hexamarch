import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import HomePage from './components/homepage/homepage';
import CustomerLogin from './components/customerlogin/customerlogin';
import CustomerMenu from './components/customermenu/customermenu';
import CustomerInfo from './components/customerinfo/customerinfo';
import CustomerWallet from './components/customerwallet/customerwallet';
import CustomerOrders from './components/customerorders/customerorders';
import CustomerPendingOrders from './components/customerpendingorders/customerpendingorders';

function App() {
  return (
    <div className="App">
     <BrowserRouter>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/customerLogin" element={<CustomerLogin />} />
        <Route path="/customerMenu" element={<CustomerMenu />} />
        <Route path="/customerInfo" element={<CustomerInfo />} />
        <Route path="/customerWallet" element={<CustomerWallet />} />
        <Route path="/customerOrders" element={<CustomerOrders />} />
         <Route path="/customerPendingOrders" element={<CustomerPendingOrders />} />
      </Routes>
     </BrowserRouter>
    </div>
  );
}

export default App;
