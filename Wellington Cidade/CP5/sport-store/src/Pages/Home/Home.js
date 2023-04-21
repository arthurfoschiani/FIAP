import { Link } from 'react-router-dom'
import './Home.css';
import Sobre from '../Sobre/Sobre';
import React, { useState, useEffect } from 'react';

export default function Home() {

  const [segundos, setSegundos] = useState(30);
  const [minutos, setMinutos] = useState(25);
  const [horas, setHoras] = useState(5);

  useEffect(() => {
    // converte horas, minutos e segundos para segundos totais
    let segundosTotais = horas * 3600 + minutos * 60 + segundos;

    const intervalId = setInterval(() => {
      segundosTotais -= 1;

      // converte segundos totais de volta para horas, minutos e segundos
      setHoras(Math.floor(segundosTotais / 3600));
      setMinutos(Math.floor(segundosTotais % 3600 / 60));
      setSegundos(segundosTotais % 60);

      if (segundosTotais === 0) {
        clearInterval(intervalId);
      }
    }, 1000);

    return () => {
      clearInterval(intervalId);
    };
  }, []);

  return (
    <>
      <section className='banner-home'>
        <div className='infos-banner'>
          <h2>Confira as ofertas relâmpago!</h2>
          <Link to="/produtos"><button>Ver coleção</button></Link>
          <p>{horas.toString().padStart(2, '0')}:{minutos.toString().padStart(2, '0')}:{segundos.toString().padStart(2, '0')}</p>
        </div>
      </section>
      <Sobre></Sobre>
    </>
  )
}