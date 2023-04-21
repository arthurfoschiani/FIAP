import React from 'react';
import './App.css';

import { BrowserRouter, Routes, Route } from 'react-router-dom'

import Menu from './Components/Menu/Menu'
import Home from './Pages/Home/Home'
import PaginaNaoEncontrada from './Pages/PaginaNaoEncontrada/PaginaNaoEncontrada'
import Produtos from './Components/Produtos/Produtos'
import Footer from './Components/Footer/Footer'

export default function App() {
  const produtos = [
    [
      'https://imgnike-a.akamaihd.net/768x768/0224057T.jpg',
      'Tênis Air Jordan 11 Retro Masculino',
      '698,98'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/0235047T.jpg',
      'Shorts Nike JDI Fade Masculino',
      '329,29'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/0113987T.jpg',
      'Óculos de Natação Nike Legacy Unissex',
      '139,90'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/01575651.jpg',
      'Meia Nike Multiplier (2 Pares) Unissex',
      '129,99'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/02225451.jpg',
      'Boné Nike Trail Running AW84 Unissex',
      '169,99'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/024842P1.jpg',
      'Shorts Nike Liverpool DNA+ Masculino',
      '399,99'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/0231590L.jpg',
      'Regata Nike Los Angeles Lakers Icon Edition 2022/23 Masculina',
      '649,99'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/02284651.jpg',
      'Bola Nike Skills',
      '89,99'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/009501IE.jpg',
      'Luvas de Goleiro Nike Unissex',
      '219,99'
    ],
    [
      'https://imgnike-a.akamaihd.net/768x768/01562951.jpg',
      'Caneleira Nike J Guard Unissex',
      '79,99'
    ],
  ]

  return (
    <BrowserRouter>
      <div className="App">
        <Menu anchor="/#sobre"></Menu>
        <Routes>
          <Route path="/" element={<Home produtos={produtos}></Home>} />
          <Route path="/produtos" element={<Produtos items={produtos}></Produtos>} />
          <Route path="*" element={<PaginaNaoEncontrada></PaginaNaoEncontrada>} />
        </Routes>
        <Footer></Footer>
      </div>
    </BrowserRouter>
  );
}