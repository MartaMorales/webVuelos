function puntua (mano){

    var total = 0;

    for(var i=0; i<mano.length; i=i +1){

        total = total + mano^[i].valor;

    }

    return total;

}



function programa(){

    var primeraMano = [{palo:"d", valor:1}, {palo:"p", valor: 5}]

    var segundaMano = [{palo: "t" , valor: 12}, {palo:"t", valor: 1}];

    var resultado = 0;

    resultado = puntua (primeraMano);

    resultado = puntua (segundaMano);

    console.log( resultado );

}

programa();