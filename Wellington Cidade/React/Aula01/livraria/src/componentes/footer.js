import '../css/footer.css'
import React from "react";

export default function Footer(props) {
  return (
    <>
      <footer>
        <ul>
            <li>{props.nome}</li>
        </ul>
      </footer>
    </>
  );
}