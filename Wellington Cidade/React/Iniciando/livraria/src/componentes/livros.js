import '../css/livros.css';
import arrow from '../img/arrow.png';
import React, { useState } from "react";

export default function Livros({ items }) {
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
        <div className="carousel-container">
            <div className="carousel" style={{ transform: `translateX(-${position * 25}%)` }} >
                {items.map((item) => (
                    <div key={item} className="carousel-item">
                        <img src={item[1]} />
                        <p>{item[0]}</p>
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
        </div>
    );
}