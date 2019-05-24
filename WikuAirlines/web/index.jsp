<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Wiku Airlines - Index</title>
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
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
    <div class="col-lg-1 col-md-1 col-sm-1"></div>
    <div class="col-lg-10 col-md-10 col-sm-10">
      <form class="needs-validation" novalidate>
        <div class="row">
          <div class="col-lg-3 col-md-3 col-sm-3 columnLg3BuscadorIndex">
            <div class="input-group-append">
              <img class="iconosbuscador" src="resources/img/Icons/origen.png" alt="iconoorigen">
            </div>
            <input type="text" name="" class="form-control input_user" value=""
                   placeholder="Origen">
          </div>
          <div class="col-lg-3 col-md-3 col-sm-3 columnLg3BuscadorIndex">
            <div class="input-group-append">
              <img class="iconosbuscador" src="resources/img/Icons/destino.png" alt="iconodestino">
            </div>
            <input type="text" name="" class="form-control input_user" value=""
                   placeholder="Destino">
          </div>

          <div class="col-lg-2 col-md-2 col-sm-2 columnLg2BuscadorIndex">
            <div class="input-group-append">
              <img class="iconosbuscador" src="resources/img/Icons/calendariosalida.png" alt="calendariosalida">
            </div>
            <input type="date" name="" class="form-control input_user date" value=""
                   placeholder="Ida">
          </div>
          <div class="col-lg-2 col-md-2 col-sm-2 columnLg2BuscadorIndex">
            <div class="input-group-append">
              <img class="iconosbuscador" src="resources/img/Icons/calendariollegada.png"
                   alt="calendariollegada">
            </div>
            <input type="date" name="" class="form-control input_user date" value=""
                   placeholder="Llegada">
          </div>
          <div class="col-lg-2 col-md-2 col-sm-2">
            <a href="#">
              <img src="resources/img/Icons/lupa.png" class="iconosbuscador" alt="lupa">
            </a>
            <input type="button" value="Buscar" class="btn btn-primary columnLg1BuscadorIndexbot">
          </div>
        </div>
      </form>
    </div>
    <div class="col-lg-1 col-md-1 col-sm-1"></div>
  </section>

  <section>
    <div class="row carrusel">
      <div class="col-lg-12 col-md-12 col-sm-12">
        <div class="carousel-wrapper">
          <div class="carousel" data-flickity>
            <div class="carousel-cell">
              <h3>PARIS</h3>
              <input type="button" name="button" class="btn btn-primary boton" value="Ir">
              <img class="imgCarousel" src="resources/img/imagenes%20ciudades/anthony-delanoix-17551-unsplash.jpg"
                   alt="imgParis"/>
              <div class="row oferta">
                <p class="coment">Vuelos a Paris desde <br/>100€</p>
              </div>
            </div>
            <div class="carousel-cell">
              <h3>LONDRES</h3>
              <input type="button" name="button" class="btn btn-primary boton" value="Ir">
              <img class="imgCarousel" src="resources/img/imagenes%20ciudades/Londres.jpeg" alt="londres"/>
              <div class="row oferta">
                <p class="coment">Vuelos a Londres desde<br/>100€</p>
              </div>
            </div>
            <div class="carousel-cell">
              <h3>KUALA LUMPUR</h3>
              <input type="button" name="button" class="btn btn-primary boton" value="Ir">
              <img class="imgCarousel" src="resources/img/imagenes%20ciudades/KualaLumpur.jpeg"/>
              <div class="row oferta">
                <p class="coment">Vuelos a Kuala Lumpur desde <br/>100€</p>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </section>

</main>

<footer>
  <%@include file="/views/layout/footer.jsp" %>
</footer>
</body>
<script src="resources/vendor/js/materialize.min.js"></script>
<script src="resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="resources/js/index.js"></script>
</html>