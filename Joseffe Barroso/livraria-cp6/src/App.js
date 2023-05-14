import React from 'react';
import './App.css';

import { BrowserRouter, Routes, Route } from 'react-router-dom'

import Menu from './Components/Menu/Menu'
import PaginaNaoEncontrada from './Pages/PaginaNaoEncontrada/PaginaNaoEncontrada'
import Categorias from './Pages/Categorias/Categorias'

export default function App() {
  return (
    <>
      <BrowserRouter>
        <div className="App">
          <Menu></Menu>
          <Routes>
            <Route path="/" element={<Categorias></Categorias>} />
            <Route path="*" element={<PaginaNaoEncontrada></PaginaNaoEncontrada>} />
          </Routes>
        </div>
      </BrowserRouter>
    </>
  );
}