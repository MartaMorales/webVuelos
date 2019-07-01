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
<header>
    <%@include file="/views/layout/header.jsp" %>
</header>

<main>

<div id="resultado" class="row">
<c:if test="${not empty vuelosIda}">
    <div class="col l6 m12 s12">
    <h3>Aquí tienes los siguientes vuelos a <span class="span-tittle">${buscarDestinoDTO.destino}</span>
    desde <span class="span-tittle">${buscarDestinoDTO.origen}</span></h3>
    <div class="container vuelos-container">
    <c:forEach items="${vuelosIda}" var="vuelo">
        <div class='row target'>
            <div class='col l1'></div>
            <div class='col l8 border'>
                <div class="row">
                    <div class="col l1"></div>
                    <div class="col l10 vuelo-tittle">
                        <h5>Vuelo de ida desde: <span class="span-tittle">${vuelo.aeropuertoSalida.nombre}</span></h5>
                        <h5>a: <span class="span-tittle">${vuelo.aeropuertoLlegada.nombre}</span>
                        </h5>
                    </div>
                    <div class="col l1"></div>
                </div>
                <div class="row">
                    <div class="col l1"></div>
                    <div class='col l1'>
                        <i class='material-icons icons prefix'>flight_takeoff</i>
                    </div>
                    <div class='col l5'>
                        <p>Vuelo directo</p>
                    </div>
                    <div class='col l4'>
                        <p>${vuelo.horaSalida}</p>
                    </div>
                    <div class="col l1"></div>
                </div>
                <div class="row">
                    <div class="col l1">
                        <label>
                            <form:radiobutton class="with-gap" path="vueloIda" value="${vuelo.id}"/>
                            <span> </span>
                        </label>
                    </div>
                    <div class="col l10"></div>
                </div>
                <div class="row">
                    <div class="col l1"></div>
                    <div class='col l1'>
                        <i class='material-icons icons prefix'>flight_land</i>
                    </div>
                    <div class='col l5'>
                        <p>Duración: ${vuelo.duracion}</p>
                    </div>
                    <div class='col l4'>
                        <p>${vuelo.horaLlegada}</p>
                    </div>
                    <div class="col l1"></div>
                </div>
            </div>
            <div class="col l2">
                <h5>Precio:
                    <span class="span-tittle"><c:out value="${vuelo.precio}"/> <i class="material-icons">euro_symbol</i></span>
                </h5>
            </div>
            <div class="col l1"></div>
        </div>
    </c:forEach>
    </div>
    </div>
    </c:if>
</div>




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
                                        <span class="span-tittle"><c:out value="${vuelo.precio}"/> <i class="material-icons">euro_symbol</i></span>
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




























        </main>

        <footer>
        <%@include file="/views/layout/footer.jsp" %>
        </footer>

        </body>
        <script src="resources/vendor/js/jquery-3.4.1.min.js"></script>
        <script src="resources/vendor/js/materialize.min.js"></script>
        <script src="resources/js/destino.js"></script>
        </html>
