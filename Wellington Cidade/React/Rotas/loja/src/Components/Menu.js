import {Link} from 'react-router-dom'
import '../css/Menu.css'

export default function Menu(){


    return(
        <nav>
            <ul>
                <li><Link to="/">Home</Link></li>
                <li><Link to="/moda-masculina">Moda Masculina</Link></li>
                <li><Link to="/moda-feminina">Moda Feminina</Link></li>
                <li><Link to="/moda-infantil">Moda Infantil</Link></li>
                <li><Link to="/sobre">Sobre</Link></li>
            </ul>
        </nav>
    )
}