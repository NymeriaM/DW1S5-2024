function calcularSegundos() {
    let horas, minutos, segundos;

    horas = parseInt(document.getElementById('horas').value);
    minutos = parseInt(document.getElementById('minutos').value);
    segundos = parseInt(document.getElementById('segundos').value);

    // Verificar se todos os valores são positivos
    if (horas >= 0 && minutos >= 0 && segundos >= 0) {
        // Calcular o tempo total em segundos
        const tempoTotalSegundos = horas * 3600 + minutos * 60 + segundos;
        document.getElementById('resultado').innerText = `Tempo total em segundos: ${tempoTotalSegundos}`;
    } else {
        alert('Por favor, insira valores positivos para horas, minutos e segundos.');
    }
}