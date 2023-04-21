import React from 'react';
import './App.css';

import { BrowserRouter, Routes, Route } from 'react-router-dom'

import Menu from './Components/Menu/Menu'
import Home from './Pages/Home/Home'
import ModaInfantil from './Pages/'
import Sobre from './Pages/Sobre/Sobre'
import Footer from './Components/Footer/Footer'

export default function App() {
  return (
    <BrowserRouter>
      <div className="App">
        <Menu></Menu>
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/moda-infantil" element={<ModaInfantil/>} />
          <Route path="/sobre" element={<Sobre/>} />
          {/* <Route path="*" element={<PaginaNaoEncontrada/>} /> */}
        </Routes>
        <Footer></Footer>
      </div>
    </BrowserRouter>
  );
}
