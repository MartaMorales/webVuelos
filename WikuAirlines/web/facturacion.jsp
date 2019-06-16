<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wiku Airlines - Facturacion</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="resources/css/general.css">
    <link rel="stylesheet" href="resources/css/facturacion.css">
</head>
<body>
<header>
    <%@include file="/views/layout/header.jsp" %>
</header>
<main>

    <div id="blue" class="block white">
        <nav class="pushpin-demo-nav" data-target="blue">
            <div class="nav-wrapper light-blue">
                <div class="container">
                    <h1>Pasajeros</h1>
                </div>
            </div>
        </nav>
        <form action="pasajero">
            <div class="row">
                <h1>Pasajero 1:</h1>
            </div>
            <div class="row">
                <div class="col l1 m1 s1"></div>
                <div class="col l2 m2 s10">
                    <p>
                        <label>
                            <input class="with-gap" name="group1" type="radio"/>
                            <span>Sr.</span>
                        </label>
                        <label>
                            <input class="with-gap" name="group1" type="radio"/>
                            <span>Sra.</span>
                        </label>
                    </p>
                </div>
                <div class="col l8 m8 s1"></div>
                <div class="col l1 m1"></div>
            </div>
            <div class="row">
                <div class="col l1 m1"></div>
                <div class="col l4 m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="nombre" type="text" class="validate" name="Name" required>
                        <label for="nombre">Nombre</label>
                    </div>
                </div>
                <div class="col l4 m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="apellidos" type="text" class="validate" name="apellidos" required>
                        <label for="apellidos">Apellidos</label>
                    </div>
                </div>
                <div class="col l1 m1"></div>
            </div>
            <div class="row">
                <div class="col l1 m1"></div>
                <div class="col l4 m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="dni" type="text" class="validate" name="dni" required>
                        <label for="dni">DNI</label>
                    </div>
                </div>
                <div class="col l4 m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix icons">event</i>
                        <input type="text" class="datepicker" placeholder="Fecha de Nacimiento" required>
                    </div>
                </div>
                <div class="col l1 m1"></div>
            </div>
            <div class="row">
                <div class="col l1 m1"></div>
                <div class="col l4 m4 s12">
                    <div class="input-field col s12">
                        <i class="material-icons prefix">location_city</i>
                        <select>
                            <option value="" disabled selected>Selecciona tu nacionalidad</option>
                            <option value="1">Option 1</option>
                            <option value="2">Option 2</option>
                            <option value="3">Option 3</option>
                        </select>
                        <label>Nacionalidad</label>
                    </div>
                </div>
                <div class="col l4 m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix icons">event</i>
                        <input type="text" class="validate" id="telefono">
                        <label for="telefono">Telefono</label>
                    </div>
                </div>
            </div>
        </form>
    </div>

    <div id="red" class="block white">
        <nav class="pushpin-demo-nav" data-target="red">
            <div class="nav-wrapper red">
                <div class="container">
                    <h1>Facturacion:</h1>
                </div>
            </div>
        </nav>
        <div class="row">
            <div class="col s12 ">
                <h4>Datos de facturacion</h4>
            </div>
            <form class="" name="formulario">
                <div class="row">
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="inputNome" type="text" class="validate" name="Name">
                        <label for="inputNome">Nombre</label>
                    </div>
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="inputapell" type="text" class="validate" name="apell">
                        <label for="inputapell">Apellidos</label>
                    </div>

                </div>
                <div class="row">
                    <div class="input-field col s2 m2 l2">
                        <i class="material-icons prefix">perm_identity</i>
                        <input id="inputDNI" type="text" class="validate" name="DNI">
                        <label for="inputDNI">DNI/Pasaporte</label>
                    </div>
                    <div class="input-field col s4 m4 l4">
                        <i class="material-icons prefix">mail</i>
                        <input id="inpuEmail" type="email" class="validate" name="Email">
                        <label for="inpuEmail">Email</label>
                    </div>
                    <div class="input-field col s4 m4 l4">
                        <i class="material-icons prefix">mail</i>
                        <input id="repEmail" type="email" class="validate" name="Email">
                        <label for="repEmail">Repite el Email</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">phone</i>
                        <input id="inputResidencial" type="tel" class="validate" name="Residencial">
                        <label for="inputResidencial">Telefono</label>
                    </div>
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">phone</i>
                        <input id="inputCelular" type="tel" class="validate" name="Celular">
                        <label for="inputCelular">Movil</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s4 m4 l4">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputCEP" type="text" class="validate" name="Cep">
                        <label for="inputCEP">Direccion</label>
                    </div>
                    <div class="input-field col s2 m2 l2">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputNumero" type="text" class="validate" name="Numero">
                        <label for="inputNumero">Número</label>
                    </div>
                    <div class="input-field col s2 m2 l2">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputpiso" type="text" class="validate" name="Numero">
                        <label for="inputpiso">Piso</label>
                    </div>
                    <div class="input-field col s2 m2 l2">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputPuerta" type="text" class="validate" name="Numero">
                        <label for="inputPuerta">Puerta</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col s2 m2 l2">
                        <i class="material-icons prefix">location_city</i>
                        <input id="cp" type="text" class="validate" name="Logradouro">
                        <label for="cp">Codigo postal</label>
                    </div>
                    <div class="input-field col s4 m4 l4">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputBairro" type="text" class="validate" name="Bairro">
                        <label for="inputBairro">Localidad</label>
                    </div>
                    <div class="input-field col s4 m4 l4">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputLocalidade" type="text" class="validate" name="Localidade">
                        <label for="inputLocalidade">Provincia</label>
                    </div>
                </div>
                <div class="row left-align">
                    <div class="col s5 m5 l5">
                        <button class="btn waves-effect waves-light" type="submit" name="action">
                            Submit
                            <i class="material-icons right">send</i>
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <div id="green" class="block green lighten-1">
        <nav class="pushpin-demo-nav" data-target="green">
            <div class="nav-wrapper green">
                <div class="container">
                    <h1>Su compra:</h1>
                </div>
            </div>
        </nav>
    </div>
</main>
<footer>
    <%@include file="/views/layout/footer.jsp" %>
</footer>

</body>
<script src="resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="resources/vendor/js/materialize.min.js"></script>
<script src="resources/js/facturacion.js"></script>
</html>