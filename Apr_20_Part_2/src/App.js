import logo from './logo.svg';
import './App.css';
import First from './components/first/first';
import Second from './components/second/second';
import Third from './components/third/third';
import Four from './components/four/four';
import Five from './components/five/five';
import Six from './components/six/six';

function App() {
  return (
    <div className="App">
      <p>Welcome to React from Hexaware</p>
     <First /> 
     <Second />
     <Third firstName="Sam" lastName="Arlin" company="hexaware" />
     <Four /> 
     <Five />
     <Six />
    </div>
  );
}

export default App;
