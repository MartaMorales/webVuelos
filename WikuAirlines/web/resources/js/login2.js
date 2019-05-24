$(document).ready(function(){
    M.AutoInit();
    $('.sidenav').sidenav();

});

/*Barra de navegacion*/
function activo(link) {
    var links = link.parentElement.getElementsByTagName("a");
    for(var i of links){
        i.classList.remove("active");
    }
    link.classList.add("active");
}

