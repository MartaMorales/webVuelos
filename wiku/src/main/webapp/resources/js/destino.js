$(document).ready(function(){
    M.AutoInit();
});

function funcionDestinoAjax(){
    var ruta = "Destino";
    var origen = $("#origen").val();
    var fechaSalida = $("#fechaSalida").val();
    var fechaLlegada = $("#fechaLlegada").val();
    var destino = $("#destino").val();
    var adultos = $("#adultos").val();
    var ninos = $("#ninos").val();

    var parametros ="?origen"+origen+"&destino="+destino+"&fechaSalida="+fechaSalida+"&fechaLlegada="+fechaLlegada;
    ruta=ruta+parametros;

    $.ajax({
        url: ruta,
        succes: function (respuesta) {
            $("#resultado").html(respuesta);
        },
        error: function () {
            $("#resultado").text("ERROR AJAX")
        }
    });
}