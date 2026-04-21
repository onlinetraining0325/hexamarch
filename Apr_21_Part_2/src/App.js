import logo from './logo.svg';
import './App.css';
import First from './components/first/first';
import Second from './components/second/second';
import Third from './components/third/third';
import Four from './components/four/four';
import Five from './components/five/five';
import Six from './components/six/six';
import Seven from './components/seven/seven';
import Eight from './components/eight/eight';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Menu from './components/menu/menu';
import Login from './components/login/login';

function App() {
  return (
    <div className="App">
      <p>Welcome to React from Hexaware</p>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/menu" element={<Menu />} />
          <Route path="/first" element={<First />} />
          <Route path="/second" element={<Second />} />
          <Route path="/third" element={<Third firstName="Prasanna" lastName="Pappu" company="hexaware" />} />
          <Route path="/four" element={<Four />} />
          <Route path="/five" element={<Five />} />
          <Route path="/six" element={<Six />} />
          <Route path="/seven" element={<Seven />} />
          <Route path="/eight" element={<Eight />} />
          
        </Routes>
      </BrowserRouter>
     {/* <First /> 
     <Second />
     <Third firstName="Sam" lastName="Arlin" company="hexaware" />
     <Four /> 
     <Five />
     <Six />
     <Seven />
     <Eight /> */}
    </div>
  );
}

export default App;
