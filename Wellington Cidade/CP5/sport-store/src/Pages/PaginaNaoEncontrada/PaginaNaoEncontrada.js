import React from "react";
import { Link } from 'react-router-dom'
import './PaginaNaoEncontrada.css';

export default function PaginaNaoEncontrada() {

    return (
        <>
            <section className="not-found">
                <h2>OOPS...</h2>
                <p>A página que você estava buscando não foi encontrada.</p>
                <Link to="/"><button>Voltar a página inicial</button></Link>
            </section>
        </>
    )
}