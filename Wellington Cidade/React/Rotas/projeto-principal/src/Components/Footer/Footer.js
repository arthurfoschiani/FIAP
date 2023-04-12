import './Footer.css';
import {FaFacebook, FaInstagram, FaLinkedin} from 'react-icons/fa';

function Footer() {
  return (
    <>
      <footer>
        <ul className='rsocial'>
          <li><FaFacebook></FaFacebook></li>
          <li><FaInstagram></FaInstagram></li>
          <li><FaLinkedin></FaLinkedin></li>
        </ul>
        Copy@2023
      </footer>
    </>
  );
}

export default Footer;