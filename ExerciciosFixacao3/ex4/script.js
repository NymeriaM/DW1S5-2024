let km, tempo, velocidadeMedia, distanciaTotal, combustivel;

km = 12; 
tempo = 2.5; 
velocidadeMedia = 95;


distanciaTotal = tempo * velocidadeMedia;


combustivel = distanciaTotal / km;


document.write(`<p>Distância total percorrida: ${distanciaTotal.toFixed(2)} Km</p>`);
document.write(`<p>Quantidade de combustível gasta: ${combustivel.toFixed(2)} litros</p>`);