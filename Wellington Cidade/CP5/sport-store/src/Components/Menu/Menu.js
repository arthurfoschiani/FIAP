import { Link, NavLink } from 'react-router-dom'
import './Menu.css'
import LogoNike from '../../assets/logo_nike.png'

export default function Menu(props) {

    return (
        <nav>
            <div>
                <Link className='a' to="/"><img src={LogoNike} /></Link>
                <ul>
                    <li><Link className='a' to="/produtos">Produtos</Link></li>
                    <li><a className='a' href={props.anchor}>Sobre nós</a></li>
                </ul>
            </div>
        </nav>
    )
}