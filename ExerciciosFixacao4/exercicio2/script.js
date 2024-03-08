function validarSenha() {
    var email = document.getElementById('email').value;
    var senha = document.getElementById('senha').value;
    var confirmarSenha = document.getElementById('confirmarSenha').value;

    if (senha !== confirmarSenha) {
        alert("As senhas não coincidem.");
        return false;
    }
    if (!validarEmail()) {
        alert("Por favor, insira um endereço de e-mail válido.");
        return false;
    }

    return true;
}

function validarEmail() {
    var campoEmail = document.getElementById('email');

    if (!campoEmail.validity.valid) {
        alert("Email inválido!");
        return false;
    }

    return true;
}
