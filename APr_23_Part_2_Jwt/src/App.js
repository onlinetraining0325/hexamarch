import logo from './logo.svg';
import './App.css';
import AddUser from './components/adduser/adduser';
import Login from './components/login/login';
import ShowAdmin from './components/showadmin/showadmin';

function App() {
  return (
    <div className="App">
        <AddUser /> <hr/>
        <Login /> <hr/>
        <ShowAdmin />
    </div>
  );
}

export default App;
