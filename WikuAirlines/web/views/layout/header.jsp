<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- delimitacion de la barra de navegacion -->

<div class="wiku-header">
    <div class = "row">

        <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6"></div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <form>
                                <div class="row">
                                    <div class="col login">
                                        <label>Usuario: </label>
                                        <input type="text" class="form-control"/>
                                    </div>
                                    <div class="col login">
                                        <label>Contraseña: </label>
                                        <input type="password" class="form-control login"/>

                                    </div>
                                    <a href="#">
                                    <img id=login src="img/Icons/01-%20Light/06-PNG/24w/login-2.png" alt="iconoLogin">
                                    </a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


            <nav class="navbar navbar-expand-lg">

                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a onclick="activo(this)" id="index" class="nav-link active" href="/Web_Vuelos_1.0/Index.html">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a onclick="activo(this)" id="destinos" class="nav-link" href="/Web_Vuelos_1.0/Destino.html">Destinos</a>
                        </li>
                        <li class="nav-item">
                            <a onclick="activo(this)" id="misDatos" class="nav-link" href="#">Mis viajes</a>
                        </li>
                        <li class="nav-item" >
                            <a onclick="activo(this)" class="nav-link" href="#">Contacto</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
</div>






<!--
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <nav class="nav nav-pills nav-fill">
                        <a onclick="activo(this)" id="index" class="nav-item nav-link active" href="/Web_Vuelos_1.0/Index.html">Inicio</a>

                        <a onclick="activo(this)" id="destinos" class="nav-item nav-link" href="/Web_Vuelos_1.0/Destino.html">Destinos</a>

                        <a onclick="activo(this)" id="misDatos" class="nav-item nav-link" href="#">Mis viajes</a>

                        <a onclick="activo(this)" class="nav-item nav-link" href="#">Contacto</a>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</div>
-->
<!--./ delimitacion de la barra de navegacion -->