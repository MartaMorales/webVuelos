$(document).ready(function () {
    $('.sidenav').sidenav();
    validateForm();
});

function validateForm() {
    $("#usuario-form").validate({
        rules: {
            nombre: {
                required: true
            },
            apellido1: {
                required: true
            },
            apellido2: {
                required: true
            },
            usuario: {
                required: true
            },
            email: {
                required: true,
                email:true
            },
            repEmail: {
                required: true,
                equalTo: "#email"
            },
            password: {
                required: true
            },
            repPassword: {
                required: true,
                equalTo: "#password"
            }
        },
        messages: {
            nombre: {
                required: "Introduce tu nombre"
            },
            apellido1: {
                required: "Introduce tu primer apellido"
            },
            usuario: {
                required: "Introduce un nombre de usuario"
            },
            email: {
                required: "Introduce tu email"
            },
            repEmail: {
                required: "Los emails tienen que coincidir"
            },
            password: {
                required: "Introduce tu contraseña",
                minlength: "La contraseña tiene que tener al menos 6 caracteres"
            },
            repPassword: {
                required: "Las contraseñas tienen que coincidir"
            }
        },
        errorElement: 'div',
        errorPlacement: function (error, element) {
            var placement = $(element).data('error');
            if (placement) {
                $(placement).append(error)
            } else {
                error.insertAfter(element);
            }
        }
    });
}