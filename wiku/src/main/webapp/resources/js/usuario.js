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
                required: true
            },
            repemail: {
                required: true,
                emailEqualsRepemail: true
            },
            password: {
                required: true
            },
            reppassword: {
                required: true,
                passwordEqualsReppassword: true
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
    })}

$.validator.addMethod(
    "emailEqualsRepemail",
    function () {
        var email = $("#email").val();
        var repEmail = $("#repEmail").val();
        return email === repEmail;
    },
    "Los emails deben de coincidir."
);
$.validator.addMethod("passwordEqualsReppassword", function () {
        var password = $("#password").val();
        var repPassword = $("#repPassword").val();
        return password === repPassword;

    },
    "Las contraseñas deben de coincidir."
);