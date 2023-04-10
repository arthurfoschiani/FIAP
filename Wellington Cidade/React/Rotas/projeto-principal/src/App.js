import {BrowserRouter, Route, Routes} from 'react-router-dom'
import './App.css';

import Menu from './Components/Menu/Menu';
import Footer from './Components/Footer/Footer';

import Contato from './Pages/Contato/Contato';
import Empresa from './Pages/Empresa/Empresa';
import Home from './Pages/Home/Home';

function App() {
  return (
    <>
      <BrowserRouter>
        <Menu></Menu>
        <Routes>
          <Route path='/' element={Home}></Route>
          <Route path='/Empresa' element={Empresa}></Route>
          <Route path='/Contato' element={Contato}></Route>
        </Routes>
        <Footer></Footer>
      </BrowserRouter>
    </>
  );
}

export default App;
