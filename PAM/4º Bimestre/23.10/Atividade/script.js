tabuada1();

//tabuada1
function tabuada1(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab1 = 1, result = 0;
        result = tab1 * tab;
        resultadoFinal += ""+tab1+ " x " +tab+ " = " +result+"\n";
       
    }
 
    return resultadoFinal;
    
}

//tabuada2
function tabuada2(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab2 = 2, result = 0;
        result = tab2 * tab;
        resultadoFinal += ""+tab2+ " x " +tab+ " = " +result+"\n";
       
    }

    return resultadoFinal;
    
}
    console.log("");

//tabuada3

function tabuada3(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab3 = 3, result = 0;
        result = tab3 * tab;
        resultadoFinal += ""+tab3+ " x " +tab+ " = " +result+"\n";
        
    }

    return resultadoFinal;
    
}
    console.log("");

//tabuada4
function tabuada4(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab4 = 4, result = 0;
        result = tab4 * tab;
        resultadoFinal += ""+tab4+ " x " +tab+ " = " +result+"\n";
        
    }

    return resultadoFinal;
    
}
    console.log("");
    
//tabuada5
function tabuada5(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab5 = 5, result = 0;
        result = tab5 * tab;
        resultadoFinal += ""+tab5+ " x " +tab+ " = " +result+"\n";
        
    }

    return resultadoFinal;
    
}
    console.log("");

//tabuada6
function tabuada6(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab6 = 6, result = 0;
        result = tab6 * tab;
        resultadoFinal += ""+tab6+ " x " +tab+ " = " +result+"\n";
        
    }
    
    return resultadoFinal;
    
}
    console.log("");

//tabuada7
function tabuada7(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab7 = 7, result = 0;
        result = tab7 * tab;
        resultadoFinal += ""+tab7+ " x " +tab+ " = " +result+"\n";
        
    }
        
    return resultadoFinal;
    
}
    console.log("");

//tabuada8
function tabuada8(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab8 = 8, result = 0;
        result = tab8 * tab;
        resultadoFinal += ""+tab8+ " x " +tab+ " = " +result+"\n";
        
    }
            
    return resultadoFinal;
    
}
    console.log("");

//tabuada9
function tabuada9(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab9 = 9, result = 0;
        result = tab9 * tab;
        resultadoFinal += ""+tab9+ " x " +tab+ " = " +result+"\n";
        
    }
                
    return resultadoFinal;
    
}
    console.log("");

//tabuada10
function tabuada10(){
    var resultadoFinal ="";

    var tab = 0;
    for(; tab <= 10; tab++){
        var tab10 = 10, result = 0;
        result = tab10 * tab;
        resultadoFinal += ""+tab10+ " x " +tab+ " = " +result+"\n";
    
    }
    
    return resultadoFinal;
    
}

//Apresentação das tabuadas
function mostrarTabuada(){
    //5 Primeiras Tabuadas
    document.getElementById('tabuada1').innerText = tabuada1();
    document.getElementById('tabuada2').innerText = tabuada2();
    document.getElementById('tabuada3').innerText = tabuada3();
    document.getElementById('tabuada4').innerText = tabuada4();
    document.getElementById('tabuada5').innerText = tabuada5();

    //5 Últimas Tabuadas
    document.getElementById('tabuada6').innerText = tabuada6();
    document.getElementById('tabuada7').innerText = tabuada7();
    document.getElementById('tabuada8').innerText = tabuada8();
    document.getElementById('tabuada9').innerText = tabuada9();
    document.getElementById('tabuada10').innerText = tabuada10();

    //Mexendo com o "display" da <div class="resposta" id="resultado" style="display: none;">
    document.getElementById('resultado').style.display = 'block';
}
