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