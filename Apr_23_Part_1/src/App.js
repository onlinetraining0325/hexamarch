import logo from './logo.svg';
import './App.css';
import First from './components/first/first';
import Second from './components/second/second';
import ColorTheme from './components/colortheme/colortheme';
import FontTheme from './components/fonttheme/fonttheme';
import UseMemo from './components/usememo/usememo';
import Memo2 from './components/memo2/memo2';
import Memo3 from './components/memo3/memo3';
import RefEx1 from './components/refex1/refex1';
import RefEx2 from './components/refex2/refex2';

function App() {
  return (
    <div className="App">
     <First /> <hr/>
     <Second /> <hr/>
     <ColorTheme /> <hr/>
     <FontTheme /> <hr/>
     <UseMemo /> <hr/>
     <Memo2 /> <hr/>
     <Memo3 /> <hr/>
     <RefEx1 /> <hr/>
     <RefEx2 />
    </div>
  );
}

export default App;
