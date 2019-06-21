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
    <form:form class="" name="formulario" modelAttribute="crearUsuarioDTO">
        <div class="row">
            <div class="input-field col s5 m5 l5">
                <i class="material-icons prefix">account_circle</i>
                <form:input path="nombre" type="text" class="validate" name="Name"/>
                <label for="nombre">Nombre</label>
            </div>
            <div class="input-field col s5 m5 l5">
                <i class="material-icons prefix">account_circle</i>
                <form:input path="apellidos" type="text" class="validate" name="apell"/>
                <label for="apellidos">Apellidos</label>
            </div>

        </div>
        <div class="row">
            <div class="input-field col s2 m2 l2">
                <i class="material-icons prefix">perm_identity</i>
                <form:input path="nombreusuario" type="text" class="validate" name="DNI"/>
                <label for="nombreusuario">Usuario</label>
            </div>
            <div class="input-field col s4 m4 l4">
                <i class="material-icons prefix">mail</i>
                <form:input path="email" type="email" class="validate" name="Email"/>
                <label for="email">Email</label>
            </div>
            <div class="input-field col s4 m4 l4">
                <i class="material-icons prefix">mail</i>
                <form:input path="repEmail" type="email" class="validate" name="Email"/>
                <label for="repEmail">Repite el Email</label>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s4 m4 l4">
                <i class="material-icons prefix">mail</i>
                <form:input path="password" type="password" class="password-field validate" name="password"/>
                <label for="password">Contraseña</label>
            </div>
            <div class="input-field col s4 m4 l4">
                <i class="material-icons prefix">mail</i>
                <form:input path="repPassword" type="password" class="password-field validate" name="password"/>
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
            <p>¿Ya tienes una cuenta? Haz login <a href="login">aquí</a> </p>
        </div>
    </form:form>
</div>


</body>
</html>
