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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/quienSoy.css">

</head>
<body>
    <header>
        <%@include file="/WEB-INF/views/layout/header.jsp" %>
    </header>
    <main>
        <div class="parallax-container center valign-wrapper">
            <div class="container">
                <div class="row">
                    <div class="col s12 white-text">
                        <h1 class="wiku-title lighten-2">Wiku Airlines</h1>
                        <p class="wiku-text-title">Un proyecto para Conecta Empleo por Marta Morales Feito.</p>
                        <img class="wiku-logo-img-hamburger" src="${pageContext.request.contextPath}/resources/img/logos/wiku_blank.png">
                    </div>
                </div>
            </div>
            <div class="parallax">
                <img src="${pageContext.request.contextPath}/resources/img/quiensoy/londres.jpg">
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col m4 s12">
                    <div class="icon-block">
                        <h2 class="center light-blue-text">
                            <i class="material-icons">memory</i>
                        </h2>
                        <h5 class="center">Tecnologías y Arquitectura</h5>
                        <p class="light">
                            La aplicación está realizada con tecnologías modernas basándose en una arquitectura Modelo Vista Controlador. Para el FrontEnd se está utilizando un framework muy visual llamado
                            Materialize CSS que sigue el estándar aconsejado por Google llamado Material Design. El Backend se ha montado utilizando Spring Boot con Spring MVC y Spring Data con una base de
                            datos MySql. Para todo ello he utilizado el IDE llama IntelliJ IDEA.
                        </p>
                    </div>

                </div>
                <div class="col m4 s12">
                    <div class="icon-block">
                        <h2 class="center light-blue-text">
                            <i class="material-icons">flash_on</i>
                        </h2>
                        <h5 class="center">¿Por qué...?</h5>
                        <p class="light">
                            La única razón por la cual he elegido la arquitectura MVC y las tecnologías mencionadas es porque a día de hoy son muy utilizadas por las empresas. La arquitectura MVC
                            ha sido muy utilizada a lo largo de los años y todavía es la arquitectura básica para las aplicaciones monolíticas. En el caso de Matarialize y Spring Boot son tecnologías muy modernas
                            que me aportan mucho como profesional y aprenderlas ha sido una de las mejores ideas que he tomado.
                        </p>
                    </div>
                </div>
                <div class="col m4 s12">
                    <div class="icon-block">
                        <h2 class="center light-blue-text">
                            <i class="material-icons">report_problem</i>
                        </h2>
                        <h5 class="center">Problemas en el camino</h5>
                        <p class="light">
                            Por un lado la solución técnica tomada ha sido muy positiva y un reto que me ha encantado afrontar, pero por otro lado también ha sido el principal causante de los problemas encontrados.
                            He tenido que aprender desde cero varias tecnologías modernas y complejas con una base joven y no ha sido tarea fácil. Aún tengo mucho que aprender y sé que solo he rozado la superficie
                            pero me siento muy satisfecha con lo que he conseguido con esfuerzo.
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="parallax-container center valign-wrapper">
            <div class="container">
                <div class="row">
                    <div class="col s12 white-text">
                        <h2 class="wiku-title lighten-2">El Equipo</h2>
                        <p class="wiku-text-title">Miembros del equipo del proyecto Wiku Airlines para Conecta Empleo.</p>
                    </div>
                </div>
            </div>

            <div class="parallax">
                <img src="${pageContext.request.contextPath}/resources/img/quiensoy/budapest.jpg">
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col l6 m6 s12">
                    <div class="icon-block">
                        <div class="img-container">
                            <img class="wiku-quiensoy-img" src="${pageContext.request.contextPath}/resources/img/quiensoy/fayrah.jpg"/>
                        </div>
                        <h5 class="center">Fayrah</h5>
                        <h6 class="center text-grey">Chief Executive Officer (CEO)</h6>
                        <p class="light">
                            Fayrah es la CEO de Wiku, la cual ha aportado grandes ideas y ha sido un gran pilar dentro del apoyo que ha recibido el proyecto. Ha estado presente en todas las fases del
                            desarrollo y ha repartido sus dosis de órdenes, mimos y exigencias en sus horas de comida y paseo. Ella es la principal razón por la cual la aerolínea Wiku admite mascotas
                            en todas sus instalaciones y aviones.
                        </p>
                    </div>

                </div>
                <div class="col l6 m6 s12">
                    <div class="icon-block">
                        <div class="img-container">
                            <img class="wiku-quiensoy-img" src="${pageContext.request.contextPath}/resources/img/quiensoy/marta.jpg"/>
                        </div>
                        <h5 class="center">Marta Morales Feito</h5>
                        <h6 class="center text-grey">Chief Technology Officer (CTO)</h6>
                        <p class="light">
                            Tras una dura decisión decidí realizar el proyecto yo sola y avanzar al máximo con las mejores tecnologías que pensé para ello. Soy una persona constante, tenaz y muy ambiciosa
                            por lo que me centré al máximo en el proyecto. He realizado el análisis, la definición de la base de datos, la mínima funcionalidad deseada, diseñado la interfaz, creado el
                            proyecto y la desarrolladora.
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="parallax-container center valign-wrapper">
            <div class="container">
                <div class="row">
                    <div class="col s12 white-text">
                        <h2 class="wiku-title-small lighten-2">Marta, Desarrolladora Web</h2>
                        <p class="wiku-text-title">Amante de la naturaleza, los viajes y los animales. De Ambientóloga a Desarrolladora web.</p>
                    </div>
                </div>
            </div>

            <div class="parallax">
                <img src="${pageContext.request.contextPath}/resources/img/quiensoy/asturias.jpg">
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col m4 s12">
                    <div class="icon-block">
                        <h2 class="center light-blue-text">
                            <i class="material-icons">card_travel</i>
                        </h2>
                        <h5 class="center">Alma libre y viajera</h5>
                        <p class="light">
                            Me considero una persona amante de los viajes y todo aquello que nos pueden aportar. Poder recorrer toda Europa en autocaravana a lo largo de mi infancia y mi juventud es
                            algo que me ha forjado como persona. Considero que gracias a todo ello he aprendido a apreciar todo detalle por pequeño que sea. Esa es la principal razón por la que decidí
                            que mi proyecto se basaría en una agencia de viajes, para compartir una de mis pequeñas pasiones.
                        </p>
                    </div>

                </div>
                <div class="col m4 s12">
                    <div class="icon-block">
                        <h2 class="center light-blue-text">
                            <i class="material-icons">landscape</i>
                        </h2>
                        <h5 class="center">Estudiante de Ciencias Ambientales</h5>
                        <p class="light">
                            Como amante de la naturaleza estudié el Grado de Ciencias Ambientales en la Universidad de Alcalá. Fue un gran reto para mí y tuve que hacer un gran esfuerzo pero me
                            gradué satisfactoriamente. Con el fin de encontrar empleo me inscribí y aprobé el Ciclo Formativo Superior de Química ambiental. Comparado con la carrera fue un paseo, pero
                            encontrar trabajo no lo estaba siendo. Tras unas pocas ofertas y entrevistas comencé a ver que no era mi futuro así que decidí reinvitarme aprendiendo desarrollo web.
                        </p>
                    </div>
                </div>
                <div class="col m4 s12">
                    <div class="icon-block">
                        <h2 class="center light-blue-text">
                            <i class="material-icons">settings</i>
                        </h2>
                        <h5 class="center">Continuo crecimiento</h5>
                        <p class="light">
                            Soy una persona creativa, luchadora y con muchas ganas de aprender. He sentido la necesidad de crecer un poco más a cada paso que doy y se me da muy bien adaptarme a todas
                            las situaciones. A cada objetivo que he tenido en mi vida he dado el 100% de mí y aunque no saliera bien siempre he aprendido de él y he tomado fuerzas para ir a por el
                            siguiente. Sé que el sector informático se me va a dar muy bien y espero prosperar al máximo.
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="container row">
            <p><span class="wiku-title-greetings">Agradecimientos:</span>Quiero agradecer a mi antiguo equipo por ayudarme en la creación y el desarrollo de la aerolínea y a Armando principalmente por haber tenido la idea.
            También quiero dar las gracias a mi pareja por animarme a comenzar con el mundo del desarrollo, ayudarme a gestionar el proyecto aplicando la metodología SCRUM y por sugerirme y ayudarme con el aprendizaje
            de las nuevas tecnologías.</p>
        </div>
        <div class="container">
            <div class="row">
                <div class="col l12 m12 s12">
                    <div class="icon-block">
                        <div class="img-container">
                            <a href="https://www.linkedin.com/in/marta-morales-feito/"><img class="wiku-quiensoy-logo" alt="Linked-in" src="${pageContext.request.contextPath}/resources/img/logos/linkedin.png"/></a>
                        </div>
                    </div>
                </div>
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
<script src="${pageContext.request.contextPath}/resources/vendor/js/date.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/quienSoy.js"></script>
</html>
