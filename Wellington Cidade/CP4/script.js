//Ex 01
// Criando o objeto escola com os atributos curso, aluno, professor, turma e período
const escola = {
    curso: "Ciência da Computação",
    aluno: ["Ana", "Pedro", "Mariana", "Lucas"],
    professor: "João",
    turma: "Turma A",
    periodo: "Noturno",
};

// Exibindo os valores do objeto escola
console.log(escola);

// Criando o método telaaluno que exibe uma mensagem na tela quando o aluno está estudando
escola.telaAluno = (aluno) => console.log(`${aluno} está estudando!`);

// Exibindo a mensagem de um aluno estudando
escola.telaAluno("Ana");

// Utilizando o método find para buscar um aluno pelo nome e exibindo na tela
const alunoEncontrado = escola.aluno.find((aluno) => aluno === "Pedro");
console.log(alunoEncontrado);

//Ex 02
const funcionarios = [
    { nome: "João", idade: 32, sexo: "M", cargo: "Programador", salario: 5000, descontos: 1000, dataAdmissao: "2005-05-15", dataDemissao: "2022-01-01" },
    { nome: "Maria", idade: 28, sexo: "F", cargo: "Designer", salario: 4000, descontos: 800, dataAdmissao: "2008-02-10", dataDemissao: null },
    { nome: "José", idade: 40, sexo: "M", cargo: "Gerente", salario: 8000, descontos: 2000, dataAdmissao: "2010-06-20", dataDemissao: null },
    { nome: "Ana", idade: 35, sexo: "F", cargo: "Analista de Sistemas", salario: 6000, descontos: 1200, dataAdmissao: "2002-11-25", dataDemissao: "2020-12-31" },
    { nome: "Paulo", idade: 45, sexo: "M", cargo: "Coordenador", salario: 7000, descontos: 1500, dataAdmissao: "2015-08-01", dataDemissao: null },
];

// Filtra funcionários que foram contratados entre 2000 e 2010
function filtrarPorDataAdmissao(funcionarios) {
    return funcionarios.filter((funcionario) => {
        const anoAdmissao = parseInt(funcionario.dataAdmissao.split("/")[0]);
        return anoAdmissao >= 2000 && anoAdmissao <= 2010;
    });
}

console.log(filtrarPorDataAdmissao(funcionarios))

// Filtra funcionários que foram demitidos depois de 2018
function filtrarPorDataDemissao(funcionarios) {
    return funcionarios.filter((funcionario) => {
        if (funcionario.dataDemissao) {
            const anoDemissao = parseInt(funcionario.dataDemissao.split("/")[0]);
            return anoDemissao > 2018;
        }
        return false;
    });
}

console.log(filtrarPorDataDemissao(funcionarios))

// Mapeia os funcionários e retorna nome, salário e desconto
function mapearFuncionarios(funcionarios) {
    return funcionarios.map((funcionario) => ({
        nome: funcionario.nome,
        salario: funcionario.salario,
        desconto: funcionario.descontos,
    }));
}

console.log(mapearFuncionarios(funcionarios))

// Reduz o array de funcionários para somar o valor total dos descontos
function somarDescontos(funcionarios) {
    return funcionarios.reduce((total, funcionario) => total + funcionario.descontos, 0);
}

console.log(somarDescontos(funcionarios))

//Ex 03

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

//Ex 4

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

//Ex 5
const calcularMedia = (...notas) => {
    const soma = notas.reduce((total, nota) => total + nota);
    const media = soma / notas.length;

    if (media >= 6) {
        return `Aprovado! Média: ${media}`;
    } else {
        return `Reprovado! Média: ${media}`;
    }
}

console.log(calcularMedia(7, 8, 5, 6, 9, 10, 4));

//Ex 6
const verificarLogin = (nomeUsuario, senha) => {
    const nomeUsuarioCadastrado = 'admin';
    const senhaCadastrada = '1234';

    if (nomeUsuario === nomeUsuarioCadastrado && senha === senhaCadastrada) {
        console.log('Login realizado com sucesso!');
    } else {
        console.log('Falha de autenticação. Verifique o nome de usuário e senha informados.');
    }
}

verificarLogin('admin', '1234'); // Login realizado com sucesso!
verificarLogin('admin', '5678'); // Falha de autenticação. Verifique o nome de usuário e senha informados.


//Ex 7
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

//Ex 8

// Exemplo 1: verificar se um número é divisível por outro
let num2 = 10;
let divisor = 5;
if (num2 % divisor === 0) {
    console.log(num2 + ' é divisível por ' + divisor);
} else {
    console.log(num2 + ' não é divisível por ' + divisor);
}

//No primeiro exemplo, o operador % é usado para verificar se um número é divisível por outro. Se o resto da divisão de num2 por divisor for igual a zero, então num2 é divisível por divisor.