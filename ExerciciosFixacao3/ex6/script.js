function converterTempo() {
    let segundos, horas, minutos, segundosRestantes;
    
    segundos = parseInt(document.getElementById('segundos').value);

    
    if (segundos >= 0) {
        
        horas = Math.floor(segundos / 3600);
        minutos = Math.floor((segundos % 3600) / 60);
        segundosRestantes = segundos % 60;

        
        document.getElementById('resultado').innerText = `Tempo convertido: ${horas} hora(s), ${minutos} minuto(s) e ${segundosRestantes} segundo(s)`;
    } else {
        alert('Por favor, insira um valor positivo de segundos.');
    }
}