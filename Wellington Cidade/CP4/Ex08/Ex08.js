// Função que verifica se um número é divisível por outro
const verificaDivisibilidade = () => {
    // Obtém os valores do número e do divisor inseridos nos campos de entrada de texto na página HTML
    const num = document.querySelector("#num").value;
    const divisor = document.querySelector("#divisor").value;

    // Verifica se o número é divisível pelo divisor inserido, e exibe o resultado em um alerta
    if (num % divisor === 0) {
        alert(num + ' é divisível por ' + divisor);
    } else {
        alert(num + ' não é divisível por ' + divisor);
    }
}

// Seleciona o botão na página HTML
const botao = document.querySelector("#button");
// Adiciona o evento de clique ao botão, para chamar a função que verifica a divisibilidade
botao.addEventListener("click", verificaDivisibilidade);
