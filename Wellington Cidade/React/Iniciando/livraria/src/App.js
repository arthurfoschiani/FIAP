import './App.css';

import Home from './componentes/home';
import Livros from './componentes/livros';
import Footer from './componentes/footer';

export default function App() {
  const cabecalho = {
    titulo: 'MyLibrary.com',
    tema: 'books'
  }

  const books1 = [
    [
      'Tartarugas Ninja: O Último Ronin',
      'https://m.media-amazon.com/images/I/51MxAoGgyGL._SX318_BO1,204,203,200_.jpg'
    ],
    [
      'O lado feio do amor',
      'https://m.media-amazon.com/images/I/51RT++oGS6L._SY344_BO1,204,203,200_.jpg'
    ],
    [
      'Pessoas normais',
      'https://m.media-amazon.com/images/I/4128BOZ-OhL._SY344_BO1,204,203,200_QL70_ML2_.jpg'
    ],
    [
      '#umdiasemreclamar: Descubra por que a gratidão pode mudar a sua vida',
      'https://m.media-amazon.com/images/I/41+LUvzc6WL._SY344_BO1,204,203,200_.jpg'
    ],
    [
      'A psicologia financeira: lições atemporais sobre fortuna, ganância e felicidade',
      'https://m.media-amazon.com/images/I/41htlT5B29S._SY344_BO1,204,203,200_QL70_ML2_.jpg'
    ],
    [
      'Vade Mecum Saraiva - Tradicional - 35ª edição 2023',
      'https://m.media-amazon.com/images/I/51kT1SyuhgL._SY344_BO1,204,203,200_QL70_ML2_.jpg'
    ],
    [
      'O homem mais rico da Babilônia',
      'https://m.media-amazon.com/images/I/51cB4wSNxQL._SY344_BO1,204,203,200_QL70_ML2_.jpg'
    ],
    [
      'A revolução dos bichos: Um conto de fadas',
      'https://m.media-amazon.com/images/I/61owA5ey3iL._SY344_BO1,204,203,200_QL70_ML2_.jpg'
    ],
  ]
  
  const books2 = [
    [
      'O Investidor Inteligente (Edição De Luxo Exclusiva Amazon) - O Guia Clássico Para Ganhar Dinheiro Na Bolsa',
      'https://m.media-amazon.com/images/I/51tMQCnWMWL._SY344_BO1,204,203,200_QL70_ML2_.jpg'
    ],
    [
      'Como Mentir Com Estatística',
      'https://m.media-amazon.com/images/I/51sfWq2+vNL._SY344_BO1,204,203,200_.jpg'
    ],
    [
      'As menores histórias de amor do mundo: e outros absurdos',
      'https://m.media-amazon.com/images/I/41VkE8SSGvL._SY346_.jpg'
    ],
    [
      'Um verão italiano',
      'https://m.media-amazon.com/images/I/51wrfCtbYNL.jpg'
    ],
    [
      'Cidade de poeira e dor',
      'https://m.media-amazon.com/images/I/513Pvvb+6gL.jpg'
    ],
    [
      'Corrente de espinhos',
      'https://m.media-amazon.com/images/I/51pyWWnwtWL.jpg'
    ],
    [
      'Dor fantasma',
      'https://m.media-amazon.com/images/I/31oH2ItV+9L.jpg'
    ],
    [
      'Checklist: Como fazer as coisas bem-feitas',
      'https://m.media-amazon.com/images/I/41kU5691nGL.jpg'
    ],
    [
      'Oi, sumido',
      'https://m.media-amazon.com/images/I/41NNSIr5IgL.jpg'
    ],
  ]
  
  const nome = 'Arthur Foschiani';

  return (
    <>
      <Home nav={cabecalho}></Home>
      <Livros items={books1}></Livros>
      <Livros items={books2}></Livros>
      <Footer nome={nome}></Footer>
    </>
  );
}
