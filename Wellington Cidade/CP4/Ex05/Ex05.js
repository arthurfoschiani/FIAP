const calcularMedia = (...notas) => {
    const soma = notas.reduce((total, nota) => total + nota);
    const media = soma / notas.length;

    if (media >= 6) {
        return `Aprovado! Média: ${media}`;
    } else {
        return `Reprovado! Média: ${media}`;
    }
}

console.log(calcularMedia(7, 8, 5, 6, 9, 10, 4));