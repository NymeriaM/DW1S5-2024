let anoNasc, anoAtual, dias, anos, meses, semanas;

anoNasc = 2008;
anoAtual = 2024;
anos = anoAtual - anoNasc;
meses = anos * 12;
dias = meses * 30;
semanas = meses*4;

document.write('Anos = ' + anos + "<br>"); 
document.write('Meses =  ' + meses + "<br>");
document.write('Semanas = ' + semanas + "<br>");
document.write('Dias = ' + dias);
