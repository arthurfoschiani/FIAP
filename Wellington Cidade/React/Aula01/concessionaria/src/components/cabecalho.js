import React from 'react'

export default function Cabecalho(props) {
  return (
    <>
      <h1>{props.titulo}</h1>
      <p>{props.texto}</p>
    </>
  );
}
