// Arrow function para calcular a média
const calcularMedia = (...notas) => {
    const soma = notas.reduce((total, nota) => total + nota);
    const media = soma / notas.length;

    if (media >= 6) {
        return `Aprovado! Média: ${media}`;
    } else {
        return `Reprovado! Média: ${media}`;
    }
}

// Colocando as notas e chamando a função
console.log(calcularMedia(7, 8, 5, 6, 9, 10, 4));
console.log(calcularMedia(9, 9, 9, 6, 4, 5, 8));
console.log(calcularMedia(2, 3, 5, 6, 1, 4, 7));
console.log(calcularMedia(10, 10, 10, 8, 8, 6, 2));
console.log(calcularMedia(3, 4, 6, 7, 8, 2, 5));