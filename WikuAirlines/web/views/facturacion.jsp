<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wiku Airlines - Destinos</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="../resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="../resources/vendor/css/normalize.css">
    <link rel="stylesheet" href="../resources/css/general.css">
    <link rel="stylesheet" href="../resources/css/facturacion.css">
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
                <div class="col l9 m9 s1"></div>
                <div class="col l10 m10"></div>
            </div>
            <div class="row">
                <div class="col l1 m1"></div>
                <div class="col 4l m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="nombre" type="text" class="validate" name="Name">
                        <label for="nombre">Nombre</label>
                    </div>
                </div>
                <div class="col 4l m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="apellidos" type="text" class="validate" name="apellidos">
                        <label for="apellidos">Apellidos</label>
                    </div>
                </div>
                <div class="col l1 m1"></div>
            </div>
            <div class="row">
                <div class="col l1 m1"></div>
                <div class="col 4l m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="dni" type="text" class="validate" name="dni">
                        <label for="dni">DNI</label>
                    </div>
                </div>
                <div class="col 4l m4 s12">
                    <div class="input-field">
                        <i class="material-icons prefix icons">event</i>
                        <input type="text" class="datepicker validate" value="" placeholder="Fecha de Nacimiento">
                    </div>
                </div>
                <div class="col l1 m1"></div>
            </div>
            <div class="row">
                <div class="col l1 m1"></div>
                <div class="col 4l m4 s12">
                    <div class="input-field col s12">
                        <i class="material-icons prefix">account_circle</i>
                            <select class="validate">
                                <option value="" disabled selected>Escoge tu nacionalidad</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>Nacionalidad</label>
                        </div>
                    </div>
                </div>
                <div class="col 4l m4 s12">
                    <div class="input-field">

                        <i class="material-icons prefix icons">event</i>
                        <input type="text" class="validate" id="telefono">
                        <label for="telefono">Telefono</label>

                    </div>
                </div>
                <div class="col l1 m1"></div>
            </div>
        </form>
    </div>


    <div id="red" class="block red lighten-1">
        <nav class="pushpin-demo-nav" data-target="red">
            <div class="nav-wrapper red">
                <div class="container">
                    <a href="#" class="brand-logo">Red</a>
                    <ul id="nav-mobile" class="right hide-on-med-and-down">
                        <li><a href="#!">Red Link 1</a></li>
                        <li><a href="#!">Red Link 2</a></li>
                        <li><a href="#!">Red Link 3</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>

    <div id="green" class="block green lighten-1">
        <nav class="pushpin-demo-nav" data-target="green">
            <div class="nav-wrapper green">
                <div class="container">
                    <a href="#" class="brand-logo">Green</a>
                    <ul id="nav-mobile" class="right hide-on-med-and-down">
                        <li><a href="#!">Green Link 1</a></li>
                        <li><a href="#!">Green Link 2</a></li>
                        <li><a href="#!">Green Link 3</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="row">
            <div class="col s12 ">
                <h4>Cadastrar Cliente</h4>
            </div>
            <form class="" name="formulario">
                <div class="row">
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="inputNome" type="text" class="validate" name="Name">
                        <label for="inputNome">Nombre</label>
                    </div>
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">perm_identity</i>
                        <input id="inputCPF" type="text" class="validate" name="CPF">
                        <label for="inputCPF">CPF</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">mail</i>
                        <input id="inpuEmail" type="email" class="validate" name="Email">
                        <label for="inpuEmail">Email</label>
                    </div>
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">phone</i>
                        <input id="inputResidencial" type="tel" class="validate" name="Residencial">
                        <label for="inputResidencial">Residêncial</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">phone</i>
                        <input id="inputCelular" type="tel" class="validate" name="Celular">
                        <label for="inputCelular">Celular</label>
                    </div>

                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">phone</i>
                        <input id="inputComercial" type="tel" class="validate" name="Comercial">
                        <label for="inputComercial">Comercial</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputCEP" type="text" class="validate" name="Cep">
                        <label for="inputCEP">CEP</label>
                    </div>
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputNumero" type="text" class="validate" name="Numero">
                        <label for="inputNumero">Número</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputLogradouro" type="text" class="validate" name="Logradouro">
                        <label for="inputLogradouro">Logradouro</label>
                    </div>
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputBairro" type="text" class="validate" name="Bairro">
                        <label for="inputBairro">Bairro</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputLocalidade" type="text" class="validate" name="Localidade">
                        <label for="inputLocalidade">Localidade</label>
                    </div>
                    <div class="input-field col s5 m5 l5">
                        <i class="material-icons prefix">location_city</i>
                        <input id="inputEstado" type="text" class="validate" name="Estado">
                        <label for="inputEstado">Estado</label>
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
    </div>


</main>
<footer>
    <%@include file="/views/layout/footer.jsp" %>
</footer>

</body>
<script src="../resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="../resources/vendor/js/materialize.min.js"></script>
<script src="../resources/js/facturacion.js"></script>
</html>