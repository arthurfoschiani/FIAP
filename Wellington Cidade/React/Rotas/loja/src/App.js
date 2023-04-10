import React from 'react';
import './App.css';

import { BrowserRouter, Routes, Route } from 'react-router-dom'

import Menu from './Components/Menu/Menu'
import Home from './Pages/Home/Home'
import ModaMasculina from './Pages/ModaMasculina/ModaMasculina'
import ModaFeminina from './Pages/ModaFeminina/ModaFeminina'
import ModaInfantil from './Pages/ModaInfantil/ModaInfantil'
import Sobre from './Pages/Sobre/Sobre'
import Footer from './Components/Footer/Footer'

export default function App() {
  return (
    <BrowserRouter>
      <div className="App">
        <Menu></Menu>
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/moda-masculina" element={<ModaMasculina/>} />
          <Route path="/moda-feminina" element={<ModaFeminina/>} />
          <Route path="/moda-infantil" element={<ModaInfantil/>} />
          <Route path="/sobre" element={<Sobre/>} />
          {/* <Route path="*" element={<PaginaNaoEncontrada/>} /> */}
        </Routes>
        <Footer></Footer>
      </div>
    </BrowserRouter>
  );
}
