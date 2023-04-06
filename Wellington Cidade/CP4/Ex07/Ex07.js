// Função que determina a faixa etária com base na idade inserida em um campo de texto
function faixaEtaria() {
    // Obtém o valor da idade inserida no campo de entrada de texto
    const idade = document.querySelector("#idade").value;
    let resposta = "";

    // Verifica a idade inserida e define a resposta com base na faixa etária correspondente
    if (idade <= 12) {
        resposta = "Você é uma criança!";
    } else if (idade <= 18) {
        resposta = "Você é um adolescente!";
    } else if (idade <= 60) {
        resposta = "Você é um adulto!";
    } else {
        resposta = "Você é um idoso!";
    }
    
    // Exibe a resposta na página HTML
    document.querySelector("#resposta").textContent = resposta;
}

// Seleciona o campo de entrada de texto na página HTML
const inputIdade = document.querySelector("#idade");
// Adiciona o evento de mudança de valor ao campo de entrada de texto, para chamar a função que determina a faixa etária
inputIdade.addEventListener("change", faixaEtaria);
