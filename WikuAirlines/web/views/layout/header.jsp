<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- delimitacion de la barra de navegacion -->

<div >

    <nav class="wiku-nav">
            <div class="nav-wrapper">
            <a href="#!" class="brand-logo"><img class="wiku-logo-header" src="/WikuAirlines/resources/img/logos/wiku_blank.png"></a>
            <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            <ul class="right hide-on-med-and-down">
                    <li class="active"><a href="sass.html">Inicio</a></li>
                    <li><a href="badges.html">Destinos</a></li>
                    <li><a href="collapsible.html">Mis viajes</a></li>
                    <li><a href="mobile.html">Contacto</a></li>
                    <li><div class="row">
                        <div class="input-field col s4">
                            <input placeholder="User Name" id="first_name" type="text" class="validate">
                            <label for="first_name">User Name</label>
                        </div>
                        <div class="input-field col s4">
                            <input placeholder="Password" id="last_name" type="password" class="validate">
                            <label for="last_name">Password</label>
                        </div>
                        <div class="input-field col s4">
                                <button id="submit-button" type="submit" class="btn waves-effect waves-light">Login<i class="material-icons submit-icon right">send</i>
                                </button>
                        </div>
                        </div>
                    </li>
            </ul>
            </div>
    </nav>

    <ul class="sidenav" id="mobile-demo">
            <li><a href="sass.html">Inicio</a></li>
            <li><a href="badges.html">Destinos</a></li>
            <li><a href="collapsible.html">Mis viajes</a></li>
            <li><a href="mobile.html">Contacto</a></li>
    </ul>
</div>