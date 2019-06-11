$(document).ready(function(){
    M.AutoInit();
});

/*Barra de navegacion*/
function activo(link) {
    var links = link.parentElement.getElementsByTagName("a");
    // noinspection JSAnnotator
    for(var i of links){
        i.classList.remove("active");
    }
    link.classList.add("active");
}

