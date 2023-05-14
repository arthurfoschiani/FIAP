import { Link } from 'react-router-dom'
import './Menu.css'

export default function Menu() {

    return (
        <nav>
            <div>
                <ul>
                    <li><Link className='a' to="/">Categorias</Link></li>
                    <li><Link className='a' to="/">Autores</Link></li>
                    <li><Link className='a' to="/">Livros</Link></li>
                    <li><Link className='a' to="/">Categorias</Link></li>
                </ul>
            </div>
        </nav>
    )
}