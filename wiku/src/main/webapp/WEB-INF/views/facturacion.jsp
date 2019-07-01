<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wiku Airlines - Facturacion</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/general.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/facturacion.css">
</head>
<body>
<header>
    <%@include file="/WEB-INF/views/layout/header.jsp" %>
</header>
<main>
    <form:form action="${pageContext.request.contextPath}/facturacion" modelAttribute="datosFacturacionDTO" method="post">
        <div class="container row">
            <div class="col s12 m9 l10">
                <div id="pasajeros" class="section scrollspy">
                    <h1>Datos de Pasajeros</h1>
                    <h3>Adultos:</h3>
                    <c:set var="pasajeroIndex" value="0"/>
                    <c:forEach begin="1" end="${datosFacturacionDTO.buscarDestinoDTO.adultos}" var="i">
                        <div class="row">
                            <h5>${tipoPasajeros[0].texto} ${i}:</h5>
                        </div>
                        <div class="row">
                            <div class="col l1 m1 s1"></div>
                            <div class="col l2 m2 s2">
                                <p>
                                    <label>
                                        <form:radiobutton path="pasajeroList[${pasajeroIndex}].genero" class="with-gap" value="${generos[0]}"/>
                                        <span>${generos[0].texto}</span>
                                    </label>
                                    <label>
                                        <form:radiobutton path="pasajeroList[${pasajeroIndex}].genero" class="with-gap" value="${generos[1]}"/>
                                        <span>${generos[1].texto}</span>
                                    </label>
                                </p>
                            </div>
                            <div class="col l4 m4 s12">
                                <div class="input-field">
                                    <i class="material-icons prefix">account_circle</i>
                                    <form:input path="pasajeroList[${pasajeroIndex}].nombre" id="nombre${pasajeroIndex}" type="text" class="validate" />
                                    <label for="nombre${pasajeroIndex}">Nombre</label>
                                </div>
                            </div>
                            <div class="col l4 m4 s12">
                                <div class="input-field">
                                    <i class="material-icons prefix">account_circle</i>
                                    <form:input path="pasajeroList[${pasajeroIndex}].apellido1" id="apellido1${pasajeroIndex}" type="text" class="validate" />
                                    <label for="apellido1${pasajeroIndex}">Primer apellido</label>
                                </div>
                            </div>
                            <div class="col l1 m1"></div>
                        </div>
                        <div class="row">
                            <div class="col l1 m1"></div>
                            <div class="col l4 m4 s12">
                                <div class="input-field">
                                    <i class="material-icons prefix">account_circle</i>
                                    <form:input path="pasajeroList[${pasajeroIndex}].apellido2" id="apellido2${pasajeroIndex}" type="text" class="validate" />
                                    <label for="apellido2${pasajeroIndex}">Segundo apellido</label>
                                </div>
                            </div>
                            <div class="col l4 m4 s12">
                                <div class="input-field">
                                    <i class="material-icons prefix">account_circle</i>
                                    <form:input path="pasajeroList[${pasajeroIndex}].dni" id="dni${pasajeroIndex}" type="text" class="validate" />
                                    <label for="dni${pasajeroIndex}">DNI</label>
                                </div>
                            </div>
                            <div class="col l2 m2 s12">
                                <div class="input-field">
                                    <i class="material-icons prefix icons">event</i>
                                    <form:input path="pasajeroList[${pasajeroIndex}].fechaNacimiento" type="text" class="datepicker" placeholder="Nacimiento" />
                                </div>
                            </div>
                            <div class="col l1 m1"></div>
                        </div>
                        <div class="row">
                            <div class="col l1 m1"></div>
                            <div class="col l4 m4 s12">
                                <div class="input-field col s12">
                                    <i class="material-icons prefix">location_city</i>
                                    <form:select id="nacionalidad${pasajeroIndex}" path="pasajeroList[${pasajeroIndex}].pais.id">
                                        <form:options items="${paises}" itemLabel="nombre" itemValue="id"/>
                                    </form:select>
                                    <label for="nacionalidad${pasajeroIndex}">Nacionalidad</label>
                                </div>
                            </div>
                            <div class="col l4 m4 s12">
                                <div class="input-field">
                                    <i class="material-icons prefix icons">event</i>
                                    <form:input path="pasajeroList[${pasajeroIndex}].telefono" type="text" class="validate" id="telefono${pasajeroIndex}"/>
                                    <label for="telefono${pasajeroIndex}">Telefono</label>
                                </div>
                            </div>
                        </div>
                        <form:hidden path="pasajeroList[${pasajeroIndex}].tipo" value="${tipoPasajeros[0]}"/>
                        <c:set var="pasajeroIndex" value="${pasajeroIndex+1}"/>
                    </c:forEach>
                    <c:if test="${not empty datosFacturacionDTO.buscarDestinoDTO.ninos and datosFacturacionDTO.buscarDestinoDTO.ninos gt 0}">
                        <h3>Niños:</h3>
                        <c:forEach begin="1" end="${datosFacturacionDTO.buscarDestinoDTO.ninos}" var="i">
                            <div class="row">
                                <h5>${tipoPasajeros[1].texto} ${i}:</h5>
                            </div>
                            <div class="row">
                                <div class="col l1 m1 s1"></div>
                                <div class="col l2 m2 s2">
                                    <p>
                                        <label>
                                            <form:radiobutton path="pasajeroList[${pasajeroIndex}].genero" class="with-gap" value="${generos[0]}"/>
                                            <span>${generos[0].texto}</span>
                                        </label>
                                        <label>
                                            <form:radiobutton path="pasajeroList[${pasajeroIndex}].genero" class="with-gap" value="${generos[1]}"/>
                                            <span>${generos[1].texto}</span>
                                        </label>
                                    </p>
                                </div>
                                <div class="col l4 m4 s12">
                                    <div class="input-field">
                                        <i class="material-icons prefix">account_circle</i>
                                        <form:input path="pasajeroList[${pasajeroIndex}].nombre" id="nombre${pasajeroIndex}" type="text" class="validate" />
                                        <label for="nombre${pasajeroIndex}">Nombre</label>
                                    </div>
                                </div>
                                <div class="col l4 m4 s12">
                                    <div class="input-field">
                                        <i class="material-icons prefix">account_circle</i>
                                        <form:input path="pasajeroList[${pasajeroIndex}].apellido1" id="apellido1${pasajeroIndex}" type="text" class="validate" />
                                        <label for="apellido1${pasajeroIndex}">Primer apellido</label>
                                    </div>
                                </div>
                                <div class="col l1 m1"></div>
                            </div>
                            <div class="row">
                                <div class="col l1 m1"></div>
                                <div class="col l4 m4 s12">
                                    <div class="input-field">
                                        <i class="material-icons prefix">account_circle</i>
                                        <form:input path="pasajeroList[${pasajeroIndex}].apellido2" id="apellido2${pasajeroIndex}" type="text" class="validate" />
                                        <label for="apellido2${pasajeroIndex}">Segundo apellido</label>
                                    </div>
                                </div>
                                <div class="col l4 m4 s12">
                                    <div class="input-field">
                                        <i class="material-icons prefix">account_circle</i>
                                        <form:input path="pasajeroList[${pasajeroIndex}].dni" id="dni${pasajeroIndex}" type="text" class="validate" />
                                        <label for="dni${pasajeroIndex}">DNI</label>
                                    </div>
                                </div>
                                <div class="col l2 m2 s12">
                                    <div class="input-field">
                                        <i class="material-icons prefix icons">event</i>
                                        <form:input path="pasajeroList[${pasajeroIndex}].fechaNacimiento" type="text" class="datepicker" placeholder="Nacimiento" />
                                    </div>
                                </div>
                                <div class="col l1 m1"></div>
                            </div>
                            <div class="row">
                                <div class="col l1 m1"></div>
                                <div class="col l4 m4 s12">
                                    <div class="input-field col s12">
                                        <i class="material-icons prefix">location_city</i>
                                        <form:select id="nacionalidad${pasajeroIndex}" path="pasajeroList[${pasajeroIndex}].pais.id">
                                            <form:options items="${paises}" itemLabel="nombre" itemValue="id"/>
                                        </form:select>
                                        <label for="nacionalidad${pasajeroIndex}">Nacionalidad</label>
                                    </div>
                                </div>
                                <div class="col l4 m4 s12">
                                    <div class="input-field">
                                        <i class="material-icons prefix icons">event</i>
                                        <form:input path="pasajeroList[${pasajeroIndex}].telefono" type="text" class="validate" id="telefono${pasajeroIndex}"/>
                                        <label for="telefono${pasajeroIndex}">Telefono</label>
                                    </div>
                                </div>
                            </div>
                            <form:hidden path="pasajeroList[${pasajeroIndex}].tipo" value="${tipoPasajeros[1]}"/>
                            <c:set var="pasajeroIndex" value="${pasajeroIndex+1}"/>
                        </c:forEach>
                    </c:if>
                </div>
                <div id="cliente" class="section scrollspy">
                    <h1>Datos de facturacion</h1>
                    <div class="row">
                        <div class="col l1 m1 s1"></div>
                        <div class="input-field col s12 m4 l4">
                            <i class="material-icons prefix">account_circle</i>
                            <form:input id="nombre-cliente" type="text" class="validate" path="nombre"/>
                            <label for="nombre-cliente">Nombre</label>
                        </div>
                        <div class="input-field col s12 m3 l3">
                            <i class="material-icons prefix">account_circle</i>
                            <form:input id="apellido-cliente1" type="text" class="validate" path="apellido1"/>
                            <label for="apellido-cliente1">Primer apellido</label>
                        </div>
                        <div class="input-field col s12 m3 l3">
                            <i class="material-icons prefix">account_circle</i>
                            <form:input id="apellido-cliente2" type="text" class="validate" path="apellido2"/>
                            <label for="apellido-cliente2">Segundo apellido</label>
                        </div>
                        <div class="col l1 m1 s1"></div>
                    </div>
                    <div class="row">
                        <div class="col l1 m1 s1"></div>
                        <div class="input-field col s12 m2 l2">
                            <i class="material-icons prefix">perm_identity</i>
                            <form:input id="inputDNI" type="text" class="validate" path="dni"/>
                            <label for="inputDNI">DNI/Pasaporte</label>
                        </div>
                        <div class="input-field col s12 m4 l4">
                            <i class="material-icons prefix">mail</i>
                            <form:input id="inputEmail" type="email" class="validate" path="email"/>
                            <label for="inputEmail">Email</label>
                        </div>
                        <div class="input-field col s12 m4 l4">
                            <i class="material-icons prefix">mail</i>
                            <input id="reptEmail" type="email" class="validate" name="emailRept">
                            <label for="reptEmail">Repite el Email</label>
                        </div>
                        <div class="col l1 m1 s1"></div>
                    </div>
                    <div class="row">
                        <div class="col l1 m1 s1"></div>
                        <div class="input-field col s12 m4 l4">
                            <i class="material-icons prefix">location_city</i>
                            <form:input id="calle" type="text" class="validate" path="calle"/>
                            <label for="calle">Direccion</label>
                        </div>
                        <div class="input-field col s12 m2 l2">
                            <i class="material-icons prefix">location_city</i>
                            <form:input id="numero" type="text" class="validate" path="numero"/>
                            <label for="numero">Número</label>
                        </div>
                        <div class="input-field col s12 m2 l2">
                            <i class="material-icons prefix">location_city</i>
                            <form:input id="piso" type="text" class="validate" path="piso"/>
                            <label for="piso">Piso</label>
                        </div>
                        <div class="input-field col s12 m2 l2">
                            <i class="material-icons prefix">location_city</i>
                            <form:input id="puerta" type="text" class="validate" path="puerta"/>
                            <label for="puerta">Puerta</label>
                        </div>
                        <div class="col l2 m2 s2"></div>
                    </div>
                    <div class="row">
                        <div class="col l1 m1 s1"></div>
                        <div class="input-field col s12 m3 l3">
                            <i class="material-icons prefix">location_city</i>
                            <form:input id="cp" type="text" class="validate" path="codigoPostal"/>
                            <label for="cp">Codigo postal</label>
                        </div>
                        <div class="input-field col s12 m3 l3">
                            <i class="material-icons prefix">location_city</i>
                            <form:input id="localidad" type="text" class="validate" path="localidad"/>
                            <label for="localidad">Localidad</label>
                        </div>
                        <div class="input-field col s12 m3 l3">
                            <i class="material-icons prefix">location_city</i>
                            <form:input id="provincia" type="text" class="validate" path="provincia"/>
                            <label for="provincia">Provincia</label>
                        </div>
                        <div class="col l1 m1 s1"></div>
                    </div>
                    <div class="row">
                        <div class="col l1 m1 s1"></div>
                        <div class="input-field col s12 m4 l4">
                            <i class="material-icons prefix">phone</i>
                            <form:input id="telefono" type="tel" class="validate" path="telefono"/>
                            <label for="telefono">Telefono</label>
                        </div>
                        <div class="col l7 m7 s7"></div>
                    </div>
                </div>
                <div id="pago" class="section scrollspy">
                    <div class="row">
                        <h1>Datos de pago</h1>
                        <div class="input-field col s12 m6">
                            <select class="icons">
                                <option value="0" disabled selected>Choose your option</option>
                                <option value="1" data-icon="${pageContext.request.contextPath}/resources/img/pago/visa_logo.png">Tarjeta de Crédito</option>
                                <option value="2" data-icon="${pageContext.request.contextPath}/resources/img/pago/mastercard_logo.jpg">Tarjeta de Débito</option>
                                <option value="3" data-icon="${pageContext.request.contextPath}/resources/img/pago/paypal_logo.png">Paypal</option>
                            </select>
                            <label>Forma de pago</label>
                        </div>
                    </div>
                </div>
            </div>
            <div class="scroll-spy-wiku col hide-on-small-only m3 l2">
                <img class="wiku-logo-img-hamburger" src="${pageContext.request.contextPath}/resources/img/logos/wiku_title.png">
                <p>Todos nuestros aviones cuentan con la mejor equipación y todas las comodidades posibles para que el viaje se haga
                lo más placentero posible. Durante el viaje nuestros profesionales estarán a su completa disposición y podrán disfrutar
                de los siguientes servicios:<br/><br/>
                <i class="material-icons">wifi</i> <i class="material-icons">pets</i> <i class="material-icons">play_arrow</i> <i class="material-icons">pregnant_woman</i> <i class="material-icons">restaurant</i> <i class="material-icons">wc</i> <i class="material-icons">child_friendly</i></p>
                <ul class="section table-of-contents">
                    <li><a href="#pasajeros">Datos de pasarejos</a></li>
                    <li><a href="#cliente">Datos de cliente</a></li>
                    <li><a href="#pago">Facturación</a></li>
                </ul>
            </div>
        </div>
    </form:form>
</main>
<footer class="page-footer">
    <%@include file="/WEB-INF/views/layout/footer.jsp" %>
</footer>

</body>
<script src="${pageContext.request.contextPath}/resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/materialize.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendor/js/date.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/facturacion.js"></script>
</html>
