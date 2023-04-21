import React, { useState } from "react";
import arrow from '../../assets/arrow.png';
import './Produtos.css';

export default function Produtos({ items }) {
    const [position, setPosition] = useState(0);

    const moveLeft = () => {
        setPosition(position - 1);
    };

    const moveRight = () => {
        setPosition(position + 1);
    };

    const isBeginning = position === 0;
    const isEnd = position === items.length - 4;

    return (
        <>
            <section className='produtos'>
                <p>Principais escolhas</p>
                <div className='lista-produtos' style={{ transform: `translateX(-${position * 25}%)` }}>
                    {items.map((item) => (
                        <div className='produto-individual'>
                            <img src={item[0]}></img>
                            <p className='nome-produto'>{item[1]}</p>
                            <p className='preco-produto'>R$ {item[2]}</p>
                        </div>
                    ))}
                </div>
                {!isBeginning && (
                    <button className="carousel-control prev" onClick={moveLeft}>
                        <img className='leftSide' src={arrow} />
                    </button>
                )}
                {!isEnd && (
                    <button className="carousel-control next" onClick={moveRight}>
                        <img src={arrow} />
                    </button>
                )}
            </section>
        </>
    )
}