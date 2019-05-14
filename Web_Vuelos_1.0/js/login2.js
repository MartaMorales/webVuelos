$(document).ready(function(){
    $("footer").load("/Web_Vuelos_1.0/layout/footerlogin.html")
});

/*Barra de navegacion*/
function activo(link) {
    var links = link.parentElement.getElementsByTagName("a");
    for(var i of links){
        i.classList.remove("active");
    }
    link.classList.add("active");
}

