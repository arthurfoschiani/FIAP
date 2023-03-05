import '../css/home.css'
import React from "react";

export default function Home(props) {
  return (
    <>
      <nav>
        <ul>
            <li>{ props.nav.titulo }</li>
            <li>{ props.nav.tema }</li>
        </ul>
      </nav>
    </>
  );
}