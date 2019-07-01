<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/general.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login2.css">

</head>
<body>
<header></header>
<main>
    <div class="row-login row">
        <div class="col l4 m4"></div>
        <div class="col l4 m4 s12">
            <div class="user_card">
                <div class="d-flex justify-content-center">
                    <div class="brand_logo_container">
                        <img src="${pageContext.request.contextPath}/resources/img/logos/wiku_blank.png" class="brand_logo" alt="Logo">
                    </div>
                </div>
                <div class="d-flex justify-content-center form_container">
                    <form:form  action="${pageContext.request.contextPath}/login" modelAttribute="buscarLoginDTO" method="post">
                        <div class="input-field m3">
                            <i class="material-icons icons prefix">person</i>
                            <form:input type="text" path="usuario" name="usuario" id="userormail" class="validate"/>
                            <label for="userormail">Nombre de usuario o email</label>
                        </div>
                        <div class="input-field m2">
                            <i class="material-icons icons prefix">vpn_key</i>
                            <form:input type="password" path="password" name="password" id="passlog" class="validate"/>
                            <label for="passlog">Contraseña</label>
                        </div>
                        <div class="switch">
                            <label for="recuerdame">
                                <input type="checkbox" id="recuerdame">
                                <span class="lever"></span>
                                <label id="labrec">Recuérdame</label>
                            </label>
                        </div>

                        <div class="d-flex justify-content-center m3 login_container">
                            <button class="btn waves-effect waves-light wiku-button" type="submit" name="action">Entrar
                                <i class="material-icons right">send</i>
                            </button>
                        </div>
                        <div class="m4">
                            <div class="center-align">
                                <p>¿No tienes cuenta todavía? <a href="${pageContext.request.contextPath}/usuario" class="ml-2">Crear cuenta</a></p>
                            </div>
                            <div class="center-align">
                                <a href="#">¿Has perdido tu contraseña?</a>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
        <div class="col l4 m4"></div>
    </div>
</main>

<footer>
    <%@include file="/WEB-INF/views/layout/footerlogin.jsp" %>
</footer>

</body>
<script src="${pageContext.request.contextPath}/resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/materialize.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/login2.js"></script>
</html>
