<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wiku Airlines - Usuario</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/general.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/usuario.css">

</head>
<body>
<div class="row">
    <div class="col s12 ">
        <h4>Crear Usuario</h4>
    </div>
    <div class="row">
        <div class="col "
        <form:form id="usuario-form" name="formulario" modelAttribute="crearUsuarioDTO">
            <div class="row">
                <div class="input-field col s4 m4 l4">
                    <i class="material-icons prefix">account_circle</i>
                    <form:input path="nombre" id="nombre" type="text" class="validate" name="Name"/>
                    <label for="nombre">Nombre</label>
                </div>
                <div class="input-field col s4 m4 l4">
                    <i class="material-icons prefix">account_circle</i>
                    <form:input path="apellido1" id="apellido1" type="text" class="validate" name="apell"/>
                    <label for="apellido1">Primer Apellido</label>
                </div>
                <div class="input-field col s4 m4 l4">
                    <i class="material-icons prefix">account_circle</i>
                    <form:input path="apellido2" id="apellido2" type="text" class="validate" name="apell"/>
                    <label for="apellido2">Segundo Apellido</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s2 m2 l2">
                    <i class="material-icons prefix">perm_identity</i>
                    <form:input path="nombreusuario" id="usuario" type="text" class="validate" name="usuario"/>
                    <label for="nombreusuario">Usuario</label>
                </div>
                <div class="input-field col s4 m4 l4">
                    <i class="material-icons prefix">mail</i>
                    <form:input path="email" id="email" type="email" class="validate" name="Email"/>
                    <label for="email">Email</label>
                </div>
                <div class="input-field col s4 m4 l4">
                    <i class="material-icons prefix">mail</i>
                    <form:input path="repEmail" id="repEmail" type="email" class="validate" name="Email"/>
                    <label for="repEmail">Repite el Email</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s4 m4 l4">
                    <i class="material-icons prefix">mail</i>
                    <form:input path="password" id="password" type="password" class="password-field validate"
                                name="password"/>
                    <label for="password">Contraseña</label>
                </div>
                <div class="input-field col s4 m4 l4">
                    <i class="material-icons prefix">mail</i>
                    <form:input path="repPassword" id="repPassword" type="password" class="password-field validate"
                                name="password"/>
                    <label for="repPassword">Repite la contraseña</label>
                </div>
            </div>
            <div class="row left-align">
                <div class="col s5 m5 l5">
                    <button class="btn waves-effect waves-light" type="submit" name="action">
                        Submit
                        <i class="material-icons right">send</i>
                    </button>
                </div>
                <p>¿Ya tienes una cuenta? Haz login <a href="login">aquí</a></p>
            </div>
        </form:form>
    </div>
</div>

</body>
<script src="${pageContext.request.contextPath}/resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/materialize.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/usuario.js"></script>
</html>
