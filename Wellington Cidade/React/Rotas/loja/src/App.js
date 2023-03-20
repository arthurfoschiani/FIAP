import React from 'react';

import { BrowserRouter, Routes, Route } from 'react-router-dom'

import Menu from './Components/Menu'
import Home from './Components/Home'
import ModaMasculina from './Components/ModaMasculina'
import ModaFeminina from './Components/ModaFeminina'
import ModaInfantil from './Components/ModaInfantil'
import Sobre from './Components/Sobre'
import Footer from './Components/Footer'

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
        </Routes>
        <Footer></Footer>
      </div>
    </BrowserRouter>
  );
}
