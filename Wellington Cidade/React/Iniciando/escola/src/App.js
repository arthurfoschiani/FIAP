import './App.css';
import escola from './img/escola.jpg';
import Lista from './componente/ListaAlunos'

export default function App() {
  const aluno = ' alicia'
  const curso = ' ADS'
  const alunos = [' joao', ' jose', ' maria']
  const valor = 1 + 3
  return (
    <div>
      <h1>ESCOLA</h1>
      <img src={escola} width="300px" height="200px" className="App-logo" alt="imagem escola"></img>
      <br/>
      <p> Aluno: <b>{aluno}</b></p>
      <p> Curso: <b>{curso}</b></p>
      <p>Valor: <b>{valor}</b></p>
      <button onclick="clique()">Botão</button>
      <select>
        <option value="valor1">João</option>
        <option value="valor2">Jose</option>
        <option value="valor3">Maria</option>
      </select>

      <Lista alunos = {alunos} />
    </div>
  );
}