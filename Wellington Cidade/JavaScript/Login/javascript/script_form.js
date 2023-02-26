document.getElementById("enviar").addEventListener("click", function (event) {
    event.preventDefault();
    pegarDados();
});

function pegarDados() {
    let nome = document.getElementById("nome");
    let telefone = document.getElementById("telefone");
    let email = document.getElementById("email");
    let mensagem = document.getElementById("mensagem");
    
    if (nome.value === "" || telefone.value === "" || email.value === "" || mensagem.value === "") {
        alert("Preencha todos os campos!");
    } else {
        alert(nome.value + " entraremos em contato pelo " + telefone.value + " e " + email.value + " obrigado pela preferência!")
    }
}