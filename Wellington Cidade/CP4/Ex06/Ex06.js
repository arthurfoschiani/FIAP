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
