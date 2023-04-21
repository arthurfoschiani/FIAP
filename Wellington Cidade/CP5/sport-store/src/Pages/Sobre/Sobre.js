import React, { useState } from "react";
import './Sobre.css';

export default function Sobre() {

    return (
        <>
            <section className="sobre-nos" id="sobre">
                <div className="text first-one">
                    <h3>Bem-vindo ao mundo da Nike!</h3>
                    <p>Desde 1964, a Nike tem sido uma das marcas mais inovadoras e revolucionárias do mundo do esporte. Com sede em Beaverton, Oregon, a Nike é líder mundial em design, desenvolvimento e comercialização de calçados, vestuário, equipamentos e acessórios esportivos autênticos.</p>
                </div>
                <div className="text second-one">
                    <p>Acreditamos que, por meio do esporte, podemos mudar a vida das pessoas. Inspiramos atletas em todo o mundo a alcançarem seus objetivos, e estamos comprometidos em oferecer os produtos mais avançados para ajudá-los a atingir seu potencial máximo.</p>
                    <h3>Just do it!</h3>
                </div>
                <div className="text">
                    <iframe width="560" height="315" src="https://www.youtube-nocookie.com/embed/g7031Ty6hqw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
                </div>
            </section>
        </>
    )
}