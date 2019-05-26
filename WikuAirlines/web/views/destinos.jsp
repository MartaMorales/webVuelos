<%--
  Created by IntelliJ IDEA.
  User: Marta
  Date: 26/05/2019
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
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
    <link rel="stylesheet" href="../resources/css/destino.css">


</head>
<body>
<header><%@include file="/views/layout/header.jsp" %></header>

<main>

    <div id="booking" class="section">
        <img class="image-background" src="../resources/img/cities/paris.jpeg" alt="paris, imagen de fondo">
        <div class="section-center">
            <div class="container">
                <div class="row">
                    <div class="booking-form">
                        <form>
                            <div class="row no-margin">
                                <div class="col s6">
                                    <div class="form-group input-field">
                                        <i class="material-icons icons prefix">flight_takeoff</i>
                                        <input type="text" id="origen" class="autocomplete input-browser">
                                        <label for="origen">Origen</label>
                                    </div>

                                    <div class="form-group input-field">
                                        <i class="material-icons prefix icons">event</i>
                                        <input type="text" class="datepicker" value="" placeholder="Salida">
                                    </div>
                                </div>
                                <div class="col s6">
                                    <div class="form-group input-field">
                                        <i class="material-icons icons prefix">flight_land</i>
                                        <input type="text" id="destino" class="autocomplete input-browser">
                                        <label for="origen">Destino</label>
                                    </div>
                                    <div class="form-group input-field">
                                        <i class="material-icons prefix icons">event</i>
                                        <input type="text" class="datepicker" value="" placeholder="Salida">
                                    </div>
                                </div>
                            </div>
                            <div class="row no-margin">
                                <div class="col s6">
                                    <div class="form-group input-field">
                                        <span class="form-label">Adultos (18+)</span>
                                        <select class="form-control">
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                            <option>6</option>
                                            <option>7</option>
                                            <option>8</option>
                                            <option>9</option>
                                            <option>10</option>

                                        </select>
                                        <span class="select-arrow"></span>
                                    </div>
                                </div>
                                <div class="col s6">
                                    <div class="form-group input-field">
                                        <span class="form-label">Niños (0-17)</span>
                                        <select class="form-control">
                                            <option>0</option>
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                            <option>6</option>
                                            <option>7</option>
                                            <option>8</option>
                                            <option>9</option>
                                            <option>10</option>
                                        </select>
                                        <span class="select-arrow"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="col l2">
                                <button class="wiku-button btn waves-effect waves-light boton">Buscar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <h3>Aquí tienes los siguientes vuelos a......</h3>

    <div class="row target">
        <div class="col l1"></div>
        <div class="col l10 border">
            <div class="row">
                <div class="col l10">
                    <div class="row">
                        <div class="col l1"></div>
                        <div class="col l1">
                            <i class="material-icons icons prefix">flight_takeoff</i>
                        </div>
                        <div class="col l3">
                            <p>21:20-22:35</p>
                        </div>
                        <div class="col l3">
                            <p>directo</p>
                        </div>
                        <div class="col l3">
                            <p>1h 15m</p>
                        </div>
                        <div class="col l1"></div>
                    </div>
                    <div class="row">
                        <div class="col l1"></div>
                        <div class="col l1">
                            <i class="material-icons icons prefix">flight_land</i>
                        </div>
                        <div class="col l3">
                            <p>21:20-22:35</p>
                        </div>
                        <div class="col l3">
                            <p>directo</p>
                        </div>
                        <div class="col l3">
                            <p>1h 15m</p>
                        </div>
                        <div class="col l1"></div>
                    </div>
                </div>
                <div class="col l2 boton"><input type="button" value="Seleccionar" class="wiku-button btn waves-effect waves-light boton"></div>
            </div>
        </div>
        <div class="col l1"></div>
    </div>

    <div class="row target">
        <div class="col l1"></div>
        <div class="col l10 border">
            <div class="row">
                <div class="col l10">
                    <div class="row">
                        <div class="col l1"></div>
                        <div class="col l1">
                            <i class="material-icons icons prefix">flight_takeoff</i>
                        </div>
                        <div class="col l3">
                            <p>21:20-22:35</p>
                        </div>
                        <div class="col l3">
                            <p>directo</p>
                        </div>
                        <div class="col l3">
                            <p>1h 15m</p>
                        </div>
                        <div class="col l1"></div>
                    </div>
                    <div class="row">
                        <div class="col l1"></div>
                        <div class="col l1">
                            <i class="material-icons icons prefix">flight_land</i>
                        </div>
                        <div class="col l3">
                            <p>21:20-22:35</p>
                        </div>
                        <div class="col l3">
                            <p>directo</p>
                        </div>
                        <div class="col l3">
                            <p>1h 15m</p>
                        </div>
                        <div class="col l1"></div>
                    </div>
                </div>
                <div class="col l2 boton"><input type="button" value="Seleccionar" class="wiku-button btn waves-effect waves-light boton"></div>
            </div>
        </div>
        <div class="col l1"></div>
    </div>
</main>

<footer><%@include file="/views/layout/footer.jsp" %></footer>

</body>
<script src="../resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="../resources/vendor/js/materialize.min.js"></script>
<script src="../resources/js/index.js"></script>
</html>
