import logo from './logo.svg';
import './App.css';
import EmployShow from './components/employshow/employshow';
import EmploySearch from './components/employsearch/employsearch';
import EmployInsert from './components/employinsert/employinsert';
import EmployUpdate from './components/employupdate/employupdate';
import EmployDelete from './components/employdelete/employdelete';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Menu from './components/menu/menu';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
        <Route path="/" element={<Menu />} />
          <Route path="/employshow" element={<EmployShow />} />
          <Route path="/employsearch" element={<EmploySearch />} />
          <Route path="/addemploy" element={<EmployInsert />} />
          <Route path="/updateemploy" element={<EmployUpdate />} />
          <Route path="/deleteemploy" element={<EmployDelete />} />
        </Routes>
      </BrowserRouter>
      {/* <EmployShow /> <hr/>
      <EmploySearch /> <hr/>
      <EmployInsert /> <hr/>
      <EmployUpdate /> <hr/>
      <EmployDelete /> */}
    </div>
  );
}

export default App;
