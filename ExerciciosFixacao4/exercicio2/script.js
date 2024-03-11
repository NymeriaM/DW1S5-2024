function validarFormulario() {
    var email = document.getElementById('email').value;
    var senha = document.getElementById('senha').value;
    var confirmarSenha = document.getElementById('confirmarSenha').value;

    if (senha !== confirmarSenha) {
        alert("As senhas não coincidem.");
        return false;
    }

    if (!validarEmail(email)) {
        alert("Por favor, insira um endereço de e-mail válido.");
        return false;
    }

    return true;
}

function validarEmail(email) {
    
    var valor = /^[a-zA-Z0-9._%+-]+@(aluno\.)?ifsp\.edu\.br$/;
    if (valor.test(email)) {
        return true;
    } else {
        return false;
    }
}

