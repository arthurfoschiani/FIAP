// Adicionando função de soma e divisão
function somaDivisaoFunction(a, b, c) {
    const soma = a + b;
    const divisao = soma / c;
    return divisao;
}

// Exibindo os valores da função
console.log(somaDivisaoFunction(10, 5, 3));

// Adicionando arrow function de soma e divisão
const somaDivisaoArrow = (a, b, c) => {
    const soma = a + b;
    const divisao = soma / c;
    return divisao;
}

// Exibindo os valores da função
console.log(somaDivisaoArrow(10, 5, 3));