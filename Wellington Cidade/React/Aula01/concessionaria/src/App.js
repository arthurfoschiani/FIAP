import logo from './logo.svg';
import './App.css';

import Cabecalho from './components/cabecalho'
import Carros from './components/carros'
import Parceiros from './components/parceiros'

function App() {
  const titulo = "Arthur lindo"
  const texto = "Arthur é um cara sensacional, lindo e maravilhoso!"

  const modelosCarros = ['Civic', 'City', 'Fit', 'Accord', 'HRV']

  const tituloParceiro = "Parceiros"
  const links = ['link 1', 'link 2', 'link 3', 'link 4']

  return (
    <>
      <Cabecalho titulo={titulo} texto={texto}/>
      <br/>
      <Carros carros={modelosCarros}/>
      <br/>
      <Parceiros titulo={tituloParceiro} links={links}/>
    </>
  );
}

export default App;
