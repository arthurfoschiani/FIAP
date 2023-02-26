//Fazendo o floar label
const formControls = document.querySelectorAll('.form-control');

formControls.forEach(control => {
    control.addEventListener('focus', () => {
        control.parentElement.querySelector('label').classList.add('active');
    });

    control.addEventListener('blur', () => {
        if (control.value.trim() === '') {
            control.parentElement.querySelector('label').classList.remove('active');
        }
    });
});

//Fazendo o usuário conseguir ver a senha
const botaoOlho = document.getElementById("botao-olho");
const iconeOlho = document.getElementById("icone-olho");
const senha = document.getElementById("senha");

botaoOlho.addEventListener("click", function () {
  if (senha.type === "password") {
    senha.type = "text";
    iconeOlho.classList.remove("fa-eye");
    iconeOlho.classList.add("fa-eye-slash");
  } else {
    senha.type = "password";
    iconeOlho.classList.add("fa-eye");
    iconeOlho.classList.remove("fa-eye-slash");
  }
});

//Fazendo login
document.getElementById("Entrar").addEventListener("click", function (event) {
    event.preventDefault();
    logar();
});

function logar() {
    let usuario = document.getElementById("email");
    let senha = document.getElementById("senha");

    if (usuario.value == "" && senha.value == "") {
        alert("Por favor, informe seu e-mail e senha.");
        usuario.focus()
        return
    } else if (usuario.value == "") {
        alert("Por favor, informe seu e-mail.")
        usuario.focus()
        return
    } else if (senha.value == "") {
        alert("Por favor, informe sua senha.")
        senha.focus()
        return
    } else if (!usuario.value.includes("@") || !usuario.value.includes(".")) {
        alert("Digite um e-mail válido.")
        senha.focus()
        return
    } else if (senha.value !== "12345") {
        alert("Senha incorreta.")
        senha.value = ""
        senha.focus()
        return
    } else {
        usuario.value = ""
        senha.value = ""
        window.location.href = "./calculo.html";
    }
}
