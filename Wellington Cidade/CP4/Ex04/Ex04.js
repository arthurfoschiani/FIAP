let contadorFunction = 0;

function contarCliquesFunction() {
    contadorFunction++;
    console.log(`Total de cliques da função: ${contadorFunction}`);
}

// Adicionando um event listener ao botão para chamar a função contarCliques() ao ser clicado
const botaoFunction = document.querySelector("#botaoFunction");
botaoFunction.addEventListener("click", contarCliquesFunction);

let contadorArrow = 0;

const contarCliquesArrow = () => {
    contadorArrow++;
    console.log(`Total de cliques da arrow function: ${contadorArrow}`);
}

// Adicionando um event listener ao botão para chamar a função contarCliques() ao ser clicado
const botaoArrow = document.querySelector("#botaoArrow");
botaoArrow.addEventListener("click", contarCliquesArrow);