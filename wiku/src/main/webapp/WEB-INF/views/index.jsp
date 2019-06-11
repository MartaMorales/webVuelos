<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wiku Airlines - Index</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="resources/css/general.css">
    <link rel="stylesheet" href="resources/css/index.css">

</head>
<body>
<header>
    <%@include file="/WEB-INF/views/layout/header.jsp" %>
</header>
<main>
    <%--Buscador de vuelos --%>
    <section class="row">
        <div class="col l1  m1 s1"></div>
        <div class="col l10 m10 s10">
            <form class="needs-validation" novalidate>
                <div class="row">
                    <div class="col l3  m6  s12 center columnLg3BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons icons prefix">flight_takeoff</i>
                            <input type="text" id="origen" class="autocomplete input-browser">
                            <label for="origen">Origen</label>
                        </div>

                    </div>
                    <div class="col l3  m6  s12 center columnLg3BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons icons prefix">flight_land</i>
                            <input type="text" id="destino" class="autocomplete input-browser">
                            <label for="destino">Destino</label>
                        </div>

                    </div>
                    <div class="col l2  m6  s12 center columnLg2BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons prefix icons">event</i>
                            <input id="salida" type="text" class="datepicker" value="">
                            <label for="salida">Salida</label>
                        </div>
                    </div>
                    <div class="col l2  m6  s12 center columnLg2BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons prefix icons">event</i>
                            <input id="llegada" type="text" class="datepicker" value="">
                            <label for="llegada">Llegada</label>
                        </div>
                    </div>
                    <div class="col l2  m12  s12">
                        <button id="submit-button" type="submit" class="btn btn-primary columnLg1BuscadorIndexbot waves-effect waves-light wiku-button">Buscar<i
                                class="material-icons submit-icon left">search</i>
                        </button>
                    </div>
                </div>
            </form>
        </div>
        <div class="col l1  m1  s1"></div>
    </section>
    <%--Carousel --%>
    <div class="container">
        <div class="carousel carousel-slider center">
            <div class="carousel-item red white-text" id="carousel-one">
                <img  class="carousel-title" src="resources/img/cities/KualaLumpur.jpeg" alt="fondo"/>
                <h1>Kuala Lumpur</h1>
                <div class="carousel-fixed-item center">
                    <a class="btn waves-effect white grey-text darken-text-2 wiku-boton">Ver oferta</a>
                </div>
            </div>
            <div class="carousel-item amber white-text" id="carousel-two" href="#two!">
                <img  class="carousel-title" src="resources/img/cities/Londres.jpeg" alt="fondo"/>
                <h1>Londres</h1>
                <div class="carousel-fixed-item center">
                    <a class="btn waves-effect white grey-text darken-text-2 wiku-boton">Ver oferta</a>
                </div>
            </div>
            <div class="carousel-item green white-text" id="carousel-three" href="#three!">
                <img  class="carousel-title" src="resources/img/cities/SanFrancisco.jpeg" alt="fondo"/>
                <h1>San Francisco</h1>
                <div class="carousel-fixed-item center">
                    <a class="btn waves-effect white grey-text darken-text-2 wiku-boton">Ver oferta</a>
                </div>
            </div>
            <div class="carousel-item blue white-text" id="carousel-four" href="#four!">
                <img  class="carousel-title" src="resources/img/cities/pexels-photo-236451.jpeg" alt="fondo"/>
                <h1>Brooklin</h1>
                <div class="carousel-fixed-item center">
                    <a class="btn waves-effect white grey-text darken-text-2 wiku-boton">Ver oferta</a>
                </div>
            </div>
        </div>
    </div>


</main>

<footer class="page-footer">
    <%@include file="/WEB-INF/views/layout/footer.jsp" %>
</footer>
</body>
<script src="resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="resources/vendor/js/materialize.min.js"></script>
<script src="resources/js/index.js"></script>
</html>