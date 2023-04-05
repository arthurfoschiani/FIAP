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