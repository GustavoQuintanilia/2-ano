console.log('Digite um número de 3 a 10:');


function iniciar() {
    alert('Abra o console do navegador (F12 ou Ctrl + Shift + I) e digite um número de 3 a 10.');
    mostrarPrompt();
}

function mostrarPrompt() {
    let num = prompt('Digite um número de 3 a 10 para selecionar uma forma geométrica:');
    formasG(parseInt(num)); 
}


function formasG(a) {
    switch (a) {
        case 3:
            console.log('Triângulo');
            console.log('Como calcular a Área: A = b * h / 2');
            console.log('Como calcular o Perímetro: P = a + b + c');
            break;
        case 4:
            console.log('Quadrado');
            console.log('Como calcular a Área: A = L²');
            console.log('Como calcular o Perímetro: P = L * 4');
            break;
        case 5:
            console.log('Pentágono');
            console.log('Como calcular a Área: A = 3L² √3 / 2');
            console.log('Como calcular o Perímetro: P = 5 * L');
            break;
        case 6:
            console.log('Hexágono');
            console.log('Como calcular a Área: A = (3√3 / 2) * L²');
            console.log('Como calcular o Perímetro: P = 6 * L');
            break;
        case 7:
            console.log('Heptágono');
            console.log('Como calcular a Área: A = (7 / 4) * L² * cot(π / 7)');
            console.log('Como calcular o Perímetro: P = 7 * L');
            break;
        case 8:
            console.log('Octágono');
            console.log('Como calcular a Área: A = 2 * (1 + √2) * L²');
            console.log('Como calcular o Perímetro: P = 8 * L');
            break;
        case 9:
            console.log('Eneágono');
            console.log('Como calcular a Área: A = (9 / 4) * L² * cot(π / 9)');
            console.log('Como calcular o Perímetro: P = 9 * L');
            break;
        case 10:
            console.log('Decágono');
            console.log('Como calcular a Área: A = (5 / 2) * L² * √(5 + 2√5)');
            console.log('Como calcular o Perímetro: P = 10 * L');
            break;
        default:
            console.log('Forma Geométrica não implementada');
            return; 
    }

    let escolha = prompt('Deseja calcular a área ou o perímetro? (Digite "A" para área ou "P" para perímetro)').toLowerCase();

    if (escolha === 'a') {
        calcularArea(a);
    } else if (escolha === 'p') {
        calcularPerimetro(a);
    } else {
        console.log('Opção inválida');
    }
}

function calcularArea(forma) {
    let lado, base, altura, apotema;
    switch (forma) {
        case 3:
            base = parseFloat(prompt('Digite o valor da base:'));
            altura = parseFloat(prompt('Digite o valor da altura:'));
            let areaTri = (base * altura) / 2;
            console.log(`A área do triângulo é ${areaTri}`);
            break;
        case 4:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let areaQuad = lado * lado;
            console.log(`A área do quadrado é ${areaQuad}`);
            break;
        case 5:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            apotema = parseFloat(prompt('Digite o valor do apótema:'));
            let areaPent = (5 * lado * apotema) / 2;
            console.log(`A área do pentágono é ${areaPent}`);
            break;
        case 6:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let areaHex = ((3 * Math.sqrt(3)) / 2) * lado * lado;
            console.log(`A área do hexágono é ${areaHex}`);
            break;
        case 7:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            apotema = parseFloat(prompt('Digite o valor do apótema:'));
            let areaHept = (7 * lado * apotema) / 2;
            console.log(`A área do heptágono é ${areaHept}`);
            break;
        case 8:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            apotema = parseFloat(prompt('Digite o valor do apótema:'));
            let areaOct = (8 * lado * apotema) / 2;
            console.log(`A área do octógono é ${areaOct}`);
            break;
        case 9:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            apotema = parseFloat(prompt('Digite o valor do apótema:'));
            let areaEne = (9 * lado * apotema) / 2;
            console.log(`A área do eneágono é ${areaEne}`);
            break;
        case 10:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            apotema = parseFloat(prompt('Digite o valor do apótema:'));
            let areaDec = (5 * lado * apotema);
            console.log(`A área do decágono é ${areaDec}`);
            break;
        default:
            console.log('Cálculo de área não implementado para esta forma');
    }
}

function calcularPerimetro(forma) {
    let lado, a, b, c;
    switch (forma) {
        case 3:
            a = parseFloat(prompt('Digite o valor do lado A:'));
            b = parseFloat(prompt('Digite o valor do lado B:'));
            c = parseFloat(prompt('Digite o valor do lado C:'));
            let perimetroTri = a + b + c;
            console.log(`O perímetro do triângulo é ${perimetroTri}`);
            break;
        case 4:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let perimetroQuad = lado * 4;
            console.log(`O perímetro do quadrado é ${perimetroQuad}`);
            break;
        case 5:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let perimetroPent = lado * 5;
            console.log(`O perímetro do pentágono é ${perimetroPent}`);
            break;
        case 6:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let perimetroHex = lado * 6;
            console.log(`O perímetro do hexágono é ${perimetroHex}`);
            break;
        case 7:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let perimetroHept = lado * 7;
            console.log(`O perímetro do heptágono é ${perimetroHept}`);
            break;
        case 8:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let perimetroOct = lado * 8;
            console.log(`O perímetro do octógono é ${perimetroOct}`);
            break;
        case 9:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let perimetroEne = lado * 9;
            console.log(`O perímetro do eneágono é ${perimetroEne}`);
            break;
        case 10:
            lado = parseFloat(prompt('Digite o valor do lado:'));
            let perimetroDec = lado * 10;
            console.log(`O perímetro do decágono é ${perimetroDec}`);
            break;
        default:
            console.log('Cálculo de perímetro não implementado para esta forma');
    }
}