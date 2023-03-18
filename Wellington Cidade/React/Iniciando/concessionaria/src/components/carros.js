import React from 'react'

export default function Carros(props) {
  return (
    <>
      <ul>
        {props.carros.map(item => (
            <li>{item}</li>
        ))}
      </ul>
    </>
  );
}
