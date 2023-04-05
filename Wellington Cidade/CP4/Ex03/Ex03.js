function somaDivisaoFunction(a, b, c) {
    const soma = a + b;
    const divisao = soma / c;
    return divisao;
}

console.log(somaDivisaoFunction(10, 5, 3));

const somaDivisaoArrow = (a, b, c) => {
    const soma = a + b;
    const divisao = soma / c;
    return divisao;
}

console.log(somaDivisaoArrow(10, 5, 3));