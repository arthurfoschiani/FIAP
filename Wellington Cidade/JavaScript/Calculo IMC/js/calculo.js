document.getElementById("peso").focus();
var modal = document.getElementById("MeuModal");

function formatarAltura(input) {
    let altura = input.value.replace(/\D/g, '');

    altura = altura.replace(",", "")
    if (altura.length >= 4) {
        altura = altura.substring(0, altura.length - 1);
        altura = altura.substring(0, altura.length - 2) + ',' + altura.substring(altura.length - 2);
    } else if (altura.length == 3) {
        altura = altura.substring(0, altura.length - 2) + ',' + altura.substring(altura.length - 2);
    }

    input.value = altura;
}


// function verificaBox() {
//     var boxResultado = document.getElementById("box-resultado");
//     var resultado = document.getElementById("resultado");

//     if (resultado.textContent == "Nada") {
//         boxResultado.className = "hide";
//     } else {
//         boxResultado.className = "";
//     }
// }

function calcularIMC() {
    // verificaBox();

    var peso = document.getElementById("peso");
    var altura = document.getElementById("altura");
    valorAltura = parseFloat(altura.value.replace(",", "."));

    if (peso.value == "" && altura.value == "") {
        alert("Digite um peso e uma altura válidos.")
        peso.focus()
        return
    } else if (peso.value == "" || peso.value < 40 || peso.value > 200) {
        alert("Digite um peso válido.")
        peso.focus()
        return
    } else if (altura.value == "" || valorAltura < 1 || valorAltura > 2.5) {
        alert("Digite uma altura válida.")
        altura.focus()
        return
    }

    var imc = peso.value / (valorAltura * valorAltura);

    var resultado = document.getElementById("resultado");
    resultado.innerHTML = "Seu IMC é: " + imc.toFixed(2);

    if (imc < 18.5) {
        resultado.innerHTML += "<br> Você está abaixo do peso ideal.";
    } else if (imc >= 18.5 && imc < 25) {
        resultado.innerHTML += "<br> Seu peso está dentro da faixa ideal.";
    } else if (imc >= 25 && imc < 30) {
        resultado.innerHTML += "<br> Você está acima do peso ideal.";
    } else {
        resultado.innerHTML += "<br> Você está obeso.";
    }

    modal.style.display = "block";
}

window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
