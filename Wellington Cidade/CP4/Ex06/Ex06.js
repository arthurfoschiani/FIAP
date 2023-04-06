// Definição da função para verificar o login
const verificarLogin = () => {
    // Definição dos valores do nome de usuário e senha cadastrados
    const nomeUsuarioCadastrado = 'admin';
    const senhaCadastrada = '1234';

    // Obtenção dos valores inseridos nos campos de input
    const user = document.querySelector("#user").value;
    const senha = document.querySelector("#senha").value;

    // Verificação se os valores inseridos coincidem com os valores cadastrados
    if (user === nomeUsuarioCadastrado && senha === senhaCadastrada) {
        alert('Login realizado com sucesso!');
    } else {
        alert('Falha de autenticação. Verifique o nome de usuário e senha informados.');
    }
}

// Seleção do botão de login na página
const botao = document.querySelector("#button");
// Adição do evento de clique do botão para chamar a função de verificar login
botao.addEventListener("click", verificarLogin);