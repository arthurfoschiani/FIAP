import React from 'react'

export default function ListaAlunos(props){
    return (
        <div>
            <ul>
                <li>{props.alunos[0]}</li>
                <li>{props.alunos[1]}</li>
                <li>{props.alunos[2]}</li>
            </ul>
        </div>
    )
}
