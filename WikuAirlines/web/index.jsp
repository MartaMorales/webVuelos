<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wiku Airlines - Index</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="resources/vendor/css/normalize.css">
    <link rel="stylesheet" href="resources/css/general.css">
    <link rel="stylesheet" href="resources/css/index.css">

</head>
<body>
<header>
    <%@include file="/views/layout/header.jsp" %>
</header>
<main>

    <section class="row">
        <div class="col l1  m1 s1"></div>
        <div class="col l10 m10 s10">
            <form class="needs-validation" novalidate>
                <div class="row">
                    <div class="col l3  m3  s3 columnLg3BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons icons prefix">flight_takeoff</i>
                            <input type="text" id="origen" class="autocomplete input-browser">
                            <label for="origen">Origen</label>
                        </div>

                    </div>
                    <div class="col l3  m3  s3 columnLg3BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons icons prefix">flight_land</i>
                            <input type="text" id="destino" class="autocomplete input-browser">
                            <label for="destino">Destino</label>
                        </div>

                    </div>
                    <div class="col l2  m2  s2 columnLg2BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons prefix icons">event</i>
                            <input type="text" class="datepicker" value="" placeholder="Ida">
                        </div>
                    </div>
                    <div class="col l2  m2  s2 columnLg2BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons prefix icons">event</i>
                            <input type="text" class="datepicker" value="" placeholder="Llegada">
                        </div>
                    </div>
                    <div class="col l2  m2  s2">
                        <a href="#">
                            <i class="material-icons icons">search</i>
                        </a>
                        <input type="button" value="Buscar" class="btn btn-primary columnLg1BuscadorIndexbot">
                    </div>
                </div>
            </form>
        </div>
        <div class="col l1  m1  s1"></div>
    </section>

    <div class="container">
        <div class="carousel carousel-slider center">
            <div class="carousel-item red white-text" id="carousel-one" href="#one!">
                <h2>First Panel</h2>
                <p class="white-text">This is your first panel</p>
                <div class="carousel-fixed-item center">
                    <a class="btn waves-effect white grey-text darken-text-2">Ver oferta</a>
                </div>
            </div>
            <div class="carousel-item amber white-text" id="carousel-two" href="#two!">
                <h2>Second Panel</h2>
                <p class="white-text">This is your second panel</p>
                <div class="carousel-fixed-item center">
                    <a class="btn waves-effect white grey-text darken-text-2">Ver oferta</a>
                </div>
            </div>
            <div class="carousel-item green white-text" id="carousel-three" href="#three!">
                <h2>Third Panel</h2>
                <p class="white-text">This is your third panel</p>
                <div class="carousel-fixed-item center">
                    <a class="btn waves-effect white grey-text darken-text-2">Ver oferta</a>
                </div>
            </div>
            <div class="carousel-item blue white-text" id="carousel-four" href="#four!">
                <h2>Fourth Panel</h2>
                <p class="white-text">This is your fourth panel</p>
                <div class="carousel-fixed-item center">
                    <a class="btn waves-effect white grey-text darken-text-2">Ver oferta</a>
                </div>
            </div>
        </div>
    </div>


</main>

<footer>
    <%@include file="/views/layout/footer.jsp" %>
</footer>
</body>
<script src="resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="resources/vendor/js/materialize.min.js"></script>
<script src="resources/js/index.js"></script>
</html>