import logo from './logo.svg';
import './App.css';
import UserShow from './components/usershow/usershow';
import UserSearch from './components/usersearch/usersearch';

function App() {
  return (
    <div className="App">
      <UserShow /> <hr/>
      <UserSearch />
    </div>
  );
}

export default App;
