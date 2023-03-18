import React from 'react'

export default function Parceiros(props) {
  return (
    <>
        <h2>{props.titulo}</h2>
        <ul>
        {props.links.map(item => (
            <li>{item}</li>
        ))}
        </ul>
    </>
  );
}
