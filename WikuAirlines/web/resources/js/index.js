$(document).ready(function(){

});


/*Barra de navegacion*/
function activo(link) {
    var links = link.parentElement.getElementsByTagName("a");
    for(var i of links){
        i.classList.remove("active");
    }
    link.classList.add("active");
}



