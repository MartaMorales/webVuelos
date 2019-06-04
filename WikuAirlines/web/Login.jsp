<%--
  Created by IntelliJ IDEA.
  User: Javier Y Marta
  Date: 30/05/2019
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wiku Airlines - Login</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="resources/vendor/css/normalize.css">
    <link rel="stylesheet" href="resources/css/general.css">
    <link rel="stylesheet" href="resources/css/login2.css">

</head>
<body>
<header></header>
<main>
    <div class="container h100">
        <div class="d-flex justify-content-center h100">
            <div class="user_card">
                <div class="d-flex justify-content-center">
                    <div class="brand_logo_container">
                        <img src="resources/img/logos/wiku_blank.png" class="brand_logo" alt="Logo">
                    </div>
                </div>
                <div class="d-flex justify-content-center form_container">
                    <form method="post" action="Login">
                        <div class="input-group m3">
                            <i class="material-icons icons prefix">person</i>
                            <input type="text" name="usuario" class="form-control input_user login input-field"
                                   placeholder="Nombre de usuario o email">
                        </div>
                        <div class="input-group m2">
                            <i class="material-icons icons prefix">vpn_key</i>
                            <input type="password" name="password" class="form-control input_pass login"
                                   placeholder="Contraseña">
                        </div>
                        <div class="form-group">
                            <input type="checkbox" id="customControlInline">
                            <label for="customControlInline">Recuérdame</label>
                        </div>

                        <div class="d-flex justify-content-center m3 login_container">
                            <button type="submit" name="button" class="btn login_btn">Entrar</button>
                        </div>
                        <div class="m4">
                            <div class="d-flex justify-content-center links">
                                ¿No tienes cuenta todavía?<a href="#" class="ml-2">Crear cuenta</a>
                            </div>
                            <div class="d-flex justify-content-center links">
                                <a href="#">¿Has perdido tu contraseña?</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</main>

<footer>
    <%@include file="/views/layout/footerlogin.jsp" %>
</footer>

</body>
<script src="resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="resources/vendor/js/materialize.min.js"></script>
<script src="resources/js/login2.js"></script>
</html>
