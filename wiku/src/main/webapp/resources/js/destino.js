$(document).ready(function(){
    $('.nav_wiku li').removeClass('active');
    $('#destiny-option').addClass('active');

    M.AutoInit();
    $('.sidenav').sidenav();

    ciudadesAutocomplete();

    $('.datepicker').datepicker({
        autoClose: true,
        format: 'dd/mm/yyyy',
        defaultDate: new Date(),
        firstDay: 1,
        minDate: new Date(),
        i18n: {
            months: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"],
            monthsShort: ["Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Set", "Oct", "Nov", "Dic"],
            weekdays: ["Domingo","Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"],
            weekdaysShort: ["Dom","Lun", "Mar", "Mie", "Jue", "Vie", "Sab"],
            weekdaysAbbrev: ["D","L", "M", "M", "J", "V", "S"]
        }
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
    $("#destinos-form").validate({
        rules: {
            origen: {
                required: true,
                origenNotEqualsDestino: true
            },
            destino: {
                required: true,
                origenNotEqualsDestino: true

            },
            fechaIda: {
                required: true,
                salidaGreaterThanLlegada: true
            },
            fechaVuelta: {
                required: true,
                llegadaGreaterThanSalida: true
            }
        },
        errorElement : 'div',
        errorPlacement: function(error, element) {
            var placement = $(element).data('error');
            if (placement) {
                $(placement).append(error)
            } else {
                error.insertAfter(element);
            }
        }
    });

    $.validator.addMethod(
        "salidaGreaterThanLlegada",
        function() {
            var salida = Date.parseExact($("#fechaSalida").val(), 'dd/mm/yyyy');
            var llegada = Date.parseExact($("#fechaLlegada").val(), 'dd/mm/yyyy');
            return llegada > salida;
        },
        "La fecha de ida no puede ser mayor que la de vuelta."
    );

    $.validator.addMethod(
        "origenNotEqualsDestino",
        function() {
            var origen = $("#origen").val();
            var destino = $("#destino").val();
            return origen !== destino;
        },
        "El origen y el destino no pueden ser el mismo."
    );
}


function submitToBuy(){
    const form = $('#destinos-form');
    form.prop('action', '/wikuairlines/facturacion/formulario-reserva/');
    form.submit();
}

