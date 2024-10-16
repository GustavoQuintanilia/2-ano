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