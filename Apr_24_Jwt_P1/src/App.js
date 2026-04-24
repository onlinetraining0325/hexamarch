import logo from './logo.svg';
import './App.css';
import EmployInsert from './components/employinsert/employinsert';
import GenerateToken from './components/generatetoken/generatetoken';
import EmployShow from './components/employshow/employshow';

function App() {
  return (
    <div className="App">
      <EmployInsert /> <hr/>
      <GenerateToken /> <hr/>
      <EmployShow />
    </div>
  );
}

export default App;
