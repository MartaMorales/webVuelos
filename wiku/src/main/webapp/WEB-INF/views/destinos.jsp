<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wiku Airlines - Destinos</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/destino.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/general.css">


</head>
<body>
<header>
    <%@include file="/WEB-INF/views/layout/header.jsp" %>
</header>

<main>
    <form:form id="destinos-form" action="${pageContext.request.contextPath}/destinos/buscar"
               modelAttribute="buscarDestinoDTO" method="POST">
        <div id="booking" class="section">
            <img class="image-background" src="${pageContext.request.contextPath}/resources/img/cities/paris.jpeg"
                 alt="paris, imagen de fondo">
            <div class="section-center">
                <div class="container">
                    <div class="row">
                        <div class="booking-form">

                            <div class="row no-margin">
                                <div class="col s6">
                                    <div class="input-field">
                                        <i class="material-icons icons prefix">flight_takeoff</i>
                                        <form:input type="text" path="origen" id="origen"
                                                    cssClass="booking-input validate"/>
                                        <label for="origen">Origen</label>
                                    </div>

                                    <div class="input-field">
                                        <i class="material-icons prefix icons">event</i>
                                        <form:input type="text" path="fechaIda" cssClass="booking-input datepicker"
                                                    id="fechaSalida"
                                                    value="" placeholder="Salida"/>
                                    </div>
                                </div>
                                <div class="col s6">
                                    <div class="form-group input-field">
                                        <i class="material-icons icons prefix">flight_land</i>
                                        <form:input type="text" id="destino" path="destino"
                                                    cssClass=" booking-input validate"/>
                                        <label for="origen">Destino</label>
                                    </div>
                                    <div class="form-group input-field">
                                        <i class="material-icons prefix icons">event</i>
                                        <form:input type="text" cssClass="booking-input datepicker" path="fechaVuelta"
                                                    id="fechaLlegada"
                                                    placeholder="Llegada"/>
                                    </div>
                                </div>
                            </div>
                            <div class="row no-margin">
                                <div class="col s6 left-select">
                                    <div class="form-group input-field">
                                        <span class="form-label">Adultos (18+)</span>
                                        <form:select path="adultos" id="adultos" class="booking-input form-control">
                                            <option class="booking-input" value="1">1</option>
                                            <option class="booking-input" value="2">2</option>
                                            <option class="booking-input" value="3">3</option>
                                            <option class="booking-input" value="4">4</option>
                                            <option class="booking-input" value="5">5</option>
                                            <option class="booking-input" value="6">6</option>
                                            <option class="booking-input" value="7">7</option>
                                            <option class="booking-input" value="8">8</option>
                                            <option class="booking-input" value="9">9</option>
                                            <option class="booking-input" value="10">10</option>
                                        </form:select>
                                        <span class="select-arrow"></span>
                                    </div>
                                </div>
                                <div class="col s6 right-select">
                                    <div class="form-group input-field">
                                        <span class="form-label">Niños (0-17)</span>
                                        <form:select id="ninos" path="ninos" class="booking-input form-control">
                                            <option class="booking-input" value="0">0</option>
                                            <option class="booking-input" value="1">1</option>
                                            <option class="booking-input" value="2">2</option>
                                            <option class="booking-input" value="3">3</option>
                                            <option class="booking-input" value="4">4</option>
                                            <option class="booking-input" value="5">5</option>
                                            <option class="booking-input" value="6">6</option>
                                            <option class="booking-input" value="7">7</option>
                                            <option class="booking-input" value="8">8</option>
                                            <option class="booking-input" value="9">9</option>
                                            <option class="booking-input" value="10">10</option>
                                        </form:select>
                                        <span class="select-arrow"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="col l2">
                                <button type="submit" class="wiku-button btn waves-effect waves-light boton"
                                        id="buscar">Buscar
                                </button>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <c:if test="${empty vuelosIda}">
            <div class="container">
                <h3>¡Busca vuelos a precios muy ecónomicos con Wiku!</h3>
                <p>Atrévete a buscar las mejores ciudades y lánzate a encontrar los mejores vuelos cualquier destino que
                    puedas imaginar.
                    Disponemos de una gran variedad de horarios y aviones en los que podrás viajar como nunca antes lo
                    has hecho. Tan solo
                    tienes que introducir la ciudad de la que vas a partir, la ciudad que deseas visitar y las fechas de
                    tu inesperado
                    y maravilloso viaje.<br/><br/>
                    Si lo que buscas son ofertas únicas sin importar el destino y deseando vivir aventuras e ir a lo
                    loco en nuestra
                    <a href="${pageContext.request.contextPath}/home">página de bienvenida</a> tenemos un apartado con
                    los mejores descuentos. </p></div>
        </c:if>
        <div id="resultado" class="row">
        <c:if test="${not empty vuelosIda}">
            <div class="col l6 m12 s12">
                <h3>Aquí tienes los siguientes vuelos a <span class="span-tittle">${buscarDestinoDTO.destino}</span>
                    desde <span class="span-tittle">${buscarDestinoDTO.origen}</span></h3>
                <div class="container vuelos-container">
                    <c:forEach items="${vuelosIda}" var="vuelo">
                    <div class='row target'>
                        <div class='col l1'></div>
                        <div class='col l10 border'>
                            <div class="row">
                                <div class="col l1"></div>
                                <div class="col l10 vuelo-tittle">
                                    <h5>Vuelo de ida desde: <span
                                            class="span-tittle">${vuelo.aeropuertoSalida.nombre}</span></h5>
                                    <h5>a: <span class="span-tittle">${vuelo.aeropuertoLlegada.nombre}</span>
                                    </h5>
                                </div>
                                <div class="col l1"></div>
                            </div>
                            <div class='row'>
                                <div class='col l1'>
                                    <label>
                                        <form:radiobutton class="with-gap" path="vueloIda" value="${vuelo.id}"/>
                                        <span> </span>
                                    </label>
                                </div>
                                <div class='col l1'>
                                    <i class='material-icons icons prefix'>flight_takeoff</i>
                                </div>
                                <div class='col l3'>
                                    <p>${vuelo.horaSalida}-${vuelo.horaLlegada}</p>
                                </div>
                                <div class='col l3'>
                                    <p>directo</p>
                                </div>
                                <div class='col l3'>
                                    <p>Duración: ${vuelo.duracion} </p>
                                </div>
                                <div class='col l1'></div>
                            </div>
                            <div class="row">
                                <div class="col l1"></div>
                                <div class="col l10">
                                    <h5>Precio:
                                        <c:if test="${vuelo.precio eq vuelo.oferta.precio}">
                                            <span class="span-tittle"><c:out value="${vuelo.oferta.precio}"/></span>
                                        </c:if>
                                        <c:if test="${vuelo.precio ne vuelo.oferta.precio}">
                                            <span class="span-tittle"><c:out value="${vuelo.precio}"/></span>
                                        </c:if>
                                    </h5>
                                </div>
                                <div class="col l1"></div>
                            </div>
                        </div>
                        <div class='col l1'></div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </c:if>
        <c:if test="${not empty vuelosVuelta}">
            <div class="col l6 m12 s12">
                <h3>Aquí tienes los siguientes vuelos a <span class="span-tittle">${buscarDestinoDTO.origen}</span>
                    desde <span class="span-tittle">${buscarDestinoDTO.destino}</span></h3>
                <div class="container vuelos-container">
                    <c:forEach items="${vuelosVuelta}" var="vuelo">
                        <div class='row target'>
                            <div class='col l1'></div>
                            <div class='col l10 border'>
                                <div class="row">
                                    <div class="col l1"></div>
                                    <div class="col l10 vuelo-tittle">
                                        <h5>Vuelo de ida desde: <span
                                                class="span-tittle">${vuelo.aeropuertoSalida.nombre}</span></h5>
                                        <h5>a: <span class="span-tittle">${vuelo.aeropuertoLlegada.nombre}</span>
                                        </h5>
                                    </div>
                                    <div class="col l1"></div>
                                </div>
                                <div class='row'>
                                    <div class='col l1'>
                                        <label>
                                            <form:radiobutton class="with-gap" path="vueloVuelta"
                                                              value="${vuelo.id}"/>
                                            <span> </span>
                                        </label>
                                    </div>
                                    <div class='col l1'>
                                        <i class='material-icons icons prefix'>flight_land</i>
                                    </div>
                                    <div class='col l3'>
                                        <p>${vuelo.horaSalida}-${vuelo.horaLlegada}</p>
                                    </div>
                                    <div class='col l3'>
                                        <p>directo</p>
                                    </div>
                                    <div class='col l3'>
                                        <p>Duración: ${vuelo.duracion} </p>
                                    </div>
                                    <div class='col l1'></div>
                                </div>
                                <div class="row">
                                    <div class="col l1"></div>
                                    <div class="col l10">
                                        <h5>Precio:
                                            <c:if test="${vuelo.precio eq vuelo.oferta.precio}">
                                                <span class="span-tittle"><c:out value="${vuelo.oferta.precio}"/></span>
                                            </c:if>
                                            <c:if test="${vuelo.precio ne vuelo.oferta.precio}">
                                                <span class="span-tittle"><c:out value="${vuelo.precio}"/></span>
                                            </c:if>
                                        </h5>
                                    </div>
                                    <div class="col l1"></div>
                                </div>
                            </div>
                            <div class='col l1'></div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </c:if>
        </div>
        <div class="container row">
            <button onclick="submitToBuy()" class="comprar-button btn waves-effect waves-light wiku-button">Comprar
            </button>
        </div>
    </form:form>
</main>
<footer class="page-footer">
    <%@include file="/WEB-INF/views/layout/footer.jsp" %>
</footer>
</body>
<script src="${pageContext.request.contextPath}/resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/materialize.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/destino.js"></script>
</html>
