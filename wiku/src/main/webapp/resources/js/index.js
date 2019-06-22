$(document).ready(function(){
    M.AutoInit();
    $('.carousel.carousel-slider').carousel({
        fullWidth: true,
        indicators: true
    });
    $('.sidenav').sidenav();

    ciudadesAutocomplete();

    $('.datepicker').datepicker({
        autoClose: true,
        format: 'dd/mm/yyyy',
        defaultDate: new Date(),
        firstDay: 1,
        minDate: new Date()
    });

    validateForm();
});

function ciudadesAutocomplete() {
    let ciudades;
    $.ajax({
        type: "GET",
        url: "/wikuairlines/home/autocompletar",
        success: function (result) {
            ciudades = result;
            $('#origen.autocomplete').autocomplete({
                data:  ciudades
            });
            $('#destino.autocomplete').autocomplete({
                data:  ciudades
            });
        }
    });
}

function validateForm(){
    $.validator.addMethod(
        "salidaGreaterThanLlegada",
        function() {
            var salida = Date.parse($("#salida"));
            var llegada = Date.parse($("#llegada"));
                return salida > llegada;
        },
        "La fecha de salida no puede ser mayor que la de llegada."
    );

    $("#index-form").validate({
        rules: {
            origen: {
                required: true
            },
            destino: {
                required: true
            },
            fechaSalida: {
                required: true,
                salidaGreaterThanLlegada: false
            },
            fechaLlegada: {
                required: true,
                salidaGreaterThanLlegada: true
            }
        }
    });
}
