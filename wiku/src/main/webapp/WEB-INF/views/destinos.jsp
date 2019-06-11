<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wiku Airlines - Destinos</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="resources/css/general.css">
    <link rel="stylesheet" href="resources/css/destino.css">


</head>
<body>
<header><%@include file="/WEB-INF/views/layout/header.jsp" %></header>

<main>

    <div id="booking" class="section">
        <img class="image-background" src="resources/img/cities/paris.jpeg" alt="paris, imagen de fondo">
        <div class="section-center">
            <div class="container">
                <div class="row">
                    <div class="booking-form">
                        <form>
                            <div class="row no-margin">
                                <div class="col s6">
                                    <div class="input-field">
                                        <i class="material-icons icons prefix">flight_takeoff</i>
                                        <input type="text" id="origen" class="validate" required>
                                        <label for="origen">Origen</label>
                                    </div>

                                    <div class="input-field">
                                        <i class="material-icons prefix icons">event</i>
                                        <input type="text" class="datepicker" id="fechaSalida" value="" placeholder="Salida" required>
                                    </div>
                                </div>
                                <div class="col s6">
                                    <div class="form-group input-field">
                                        <i class="material-icons icons prefix">flight_land</i>
                                        <input type="text" id="destino" class="validate" required>
                                        <label for="origen">Destino</label>
                                    </div>
                                    <div class="form-group input-field">
                                        <i class="material-icons prefix icons">event</i>
                                        <input type="text" class="datepicker" value="" id="fechaLlegada" placeholder="Llegada" required>
                                    </div>
                                </div>
                            </div>
                            <div class="row no-margin">
                                <div class="col s6">
                                    <div class="form-group input-field">
                                        <span class="form-label">Adultos (18+)</span>
                                        <select id="adultos" class="form-control" required>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                            <option value="8">8</option>
                                            <option value="9">9</option>
                                            <option value="10">10</option>
                                        </select>
                                        <span class="select-arrow"></span>
                                    </div>
                                </div>
                                <div class="col s6">
                                    <div class="form-group input-field">
                                        <span class="form-label">Niños (0-17)</span>
                                        <select id="ninos" class="form-control">
                                            <option value="0">0</option>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>
                                            <option value="6">6</option>
                                            <option value="7">7</option>
                                            <option value="8">8</option>
                                            <option value="9">9</option>
                                            <option value="10">10</option>
                                        </select>
                                        <span class="select-arrow"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="col l2">
                                <button class="wiku-button btn waves-effect waves-light boton" id="buscar" onclick="funcionDestinoAjax();">Buscar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
<div id="resultado"></div>


</main>

<footer><%@include file="/WEB-INF/views/layout/footer.jsp" %></footer>

</body>
<script src="resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="resources/vendor/js/materialize.min.js"></script>
<script src="resources/js/destino.js"></script>
</html>
