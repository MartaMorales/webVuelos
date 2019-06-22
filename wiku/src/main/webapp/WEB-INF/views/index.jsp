<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wiku Airlines - Index</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/general.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index.css">

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
            <form:form id="index-form" action="${pageContext.request.contextPath}/destinos/buscar" cssClass="needs-validation" novalidate="novalidate" modelAttribute="buscarDestinoDTO" method="POST" >
                <div class="row">
                    <div class="col l3  m6  s12 center columnLg3BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons icons prefix">flight_takeoff</i>
                            <form:input type="text" path="origen" id="origen" cssClass="autocomplete input-browser .right-alert"/>
                            <label for="origen">Origen</label>
                        </div>

                    </div>
                    <div class="col l3  m6  s12 center columnLg3BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons icons prefix">flight_land</i>
                            <form:input type="text" path="destino" id="destino" cssClass="autocomplete input-browser right-alert"/>
                            <label for="destino">Destino</label>
                        </div>

                    </div>
                    <div class="col l2  m6  s12 center columnLg2BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons prefix icons">event</i>
                            <form:input id="salida" path="fechaSalida" type="text" class="datepicker .right-alert" value=""/>
                            <label for="salida">Salida</label>
                        </div>
                    </div>
                    <div class="col l2  m6  s12 center columnLg2BuscadorIndex">
                        <div class="input-field">
                            <i class="material-icons prefix icons">event</i>
                            <form:input id="llegada" path="fechaLLegada" type="text" class="datepicker .right-alert" value=""/>
                            <label for="llegada">Llegada</label>
                        </div>
                    </div>
                    <div class="col l2  m12  s12">
                        <button id="submit-button" type="submit" class="btn btn-primary columnLg1BuscadorIndexbot waves-effect waves-light wiku-button">Buscar<i
                                class="material-icons submit-icon left">search</i>
                        </button>
                    </div>
                </div>
            </form:form>
        </div>
        <div class="col l1  m1  s1"></div>
    </section>
    <%--Carousel --%>

    <div class="container">
        <div class="carousel carousel-slider center">
            <c:forEach items="${ofertas}" var="oferta">
                <div class="carousel-item red white-text carousel-wiku-item" style='background-image: url("${oferta.imgUrl}")'>
                    <img  class="carousel-title" src="${oferta.imgUrl}" alt="fondo"/>
                    <h1><c:out value="${oferta.vuelo.aeropuertoLlegada.ciudad.nombre}"/></h1>
                    <div class="carousel-fixed-item center">
                        <a class="btn waves-effect white grey-text darken-text-2 wiku-boton modal-trigger" href="#modal${oferta.id}">Ver oferta</a>
                    </div>
                </div>

                <!-- Modal Structure -->
                <div id="modal${oferta.id}" class="modal">
                    <div class="modal-content">
                        <h4>${oferta.vuelo.aeropuertoLlegada.ciudad.nombre}</h4>
                        <p>${oferta.descripcion}</p>
                        <p>Precio: ${oferta.precio} €.</p>
                    </div>
                    <div class="modal-footer">
                        <a href="${pageContext.request.contextPath}/destinos/buscar/${oferta.vuelo.id}/" class="modal-close waves-effect waves-green btn-flat">Ver vuelo</a>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

</main>

<footer class="page-footer">
    <%@include file="/WEB-INF/views/layout/footer.jsp" %>
</footer>
</body>
<script src="${pageContext.request.contextPath}/resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/materialize.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/index.js"></script>
</html>
