console.log('Digite um número de 3 a 10:');

function iniciar() {
    alert('Abra o console do navegador (F12 ou Ctrl + Shift + I) e digite um número de 3 a 10.');
    mostrarPrompt();
}

function mostrarPrompt() {
    let num = prompt('Digite um número de 3 a 10 para selecionar uma forma geométrica:');
    const formaS = parseInt(num);
    formasGPagina(formaS);
}

function formasGPagina(a) {
    let forma, area, perimetro, imagemUrl;
    
    switch (a) {
        case 3:
            forma = 'Triângulo';
            area = 'A = b * h / 2';
            perimetro = 'P = a + b + c';
            imagemUrl = 'img/img-3.png';
            break;
        case 4:
            forma = 'Quadrado';
            area = 'A = L²';
            perimetro = 'P = L * 4';
            imagemUrl = 'img/img-4.png';
            break;
        case 5:
            forma = 'Pentágono';
            area = 'A = 3L² √3 / 2';
            perimetro = 'P = 5 * L';
            imagemUrl = 'img/img-5.png';
            break;
        case 6:
            forma = 'Hexágono';
            area = 'A = (3√3 / 2) * L²';
            perimetro = 'P = 6 * L';
            imagemUrl = 'img/img-6.png';
            break;
        case 7:
            forma = 'Heptágono';
            area = 'A = (7 / 4) * L² * cot(π / 7)';
            perimetro = 'P = 7 * L';
            imagemUrl = 'img/img-7.png'; 
            break;
        case 8:
            forma = 'Octágono';
            area = 'A = 2 * (1 + √2) * L²';
            perimetro = 'P = 8 * L';
            imagemUrl = 'img/img-8.png'; 
            break;
        case 9:
            forma = 'Eneágono';
            area = 'A = (9 / 4) * L² * cot(π / 9)';
            perimetro = 'P = 9 * L';
            imagemUrl = 'img/img-9.png'; 
            break;
        case 10:
            forma = 'Decágono';
            area = 'A = (5 / 2) * L² * √(5 + 2√5)';
            perimetro = 'P = 10 * L';
            imagemUrl = 'img/img-10.png';
            break;
        default:
            console.log('Forma Geométrica não implementada');
            return; 
    }
    mostrarForma(forma, area, perimetro, imagemUrl);
}

function mostrarForma(forma, area, perimetro, imagemUrl) {
    document.getElementById('formaNome').innerText = forma;
    document.getElementById('areaCalculo').innerText = `Como calcular a Área: ${area}`;
    document.getElementById('perimetroCalculo').innerText = `Como calcular o Perímetro: ${perimetro}`;
    document.getElementById('formaImagem').src = imagemUrl;
    document.getElementById('resultado').style.display = 'block';
    
    // Adiciona um atraso antes de perguntar se deseja repetir
    setTimeout(repeticao, 1000);  // Atraso de 1 segundo (1000 ms)
}

function repeticao() {
    let r = confirm("Deseja repetir?");
    if (r) {
        mostrarPrompt();
    }
}
