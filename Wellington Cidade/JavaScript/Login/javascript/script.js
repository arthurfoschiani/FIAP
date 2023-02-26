document.getElementById("Entrar").addEventListener("click", function (event) {
    event.preventDefault();
    logar();
});

function logar() {
    let usuario = document.getElementById("email");
    let senha = document.getElementById("senha");

    if (usuario.value === "" || senha.value === "" || senha.value !== "12345") {
        alert("Usuario ou senha inválido");
    } else {
        window.location.href = "./formulario.html";
    }
}