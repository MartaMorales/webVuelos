$(document).ready(function(){
    $("header").load("/Web_Vuelos_1.0/layout/header.html");
    $("footer").load("/Web_Vuelos_1.0/layout/footer.html");
});


/*Barra de navegacion*/
function activo(link) {
    var links = link.parentElement.getElementsByTagName("a");
    for(var i of links){
        i.classList.remove("active");
    }
    link.classList.add("active");
}