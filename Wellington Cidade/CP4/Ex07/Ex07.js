function faixaEtaria(idade) {
    idade = document.querySelector("#idade").value;

    if (idade <= 12) {
        console.log("Você é uma criança!");
    } else if (idade <= 18) {
        console.log("Você é um adolescente!");
    } else if (idade <= 60) {
        console.log("Você é um adulto!");
    } else {
        console.log("Você é um idoso!");
    }
}

const botaoIdade = document.querySelector("#botaoIdade");
botaoIdade.addEventListener("click", faixaEtaria);