<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Wiku Airlines - Destinos</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Leckerli+One' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="../resources/vendor/css/materialize.min.css">
    <link rel="stylesheet" href="../resources/vendor/css/normalize.css">
    <link rel="stylesheet" href="../resources/css/general.css">
    <link rel="stylesheet" href="../resources/css/facturacion.css">
</head>
<body>
<header>
    <%@include file="/views/layout/header.jsp" %>
</header>
<main>
    <div class="row">
        <div class="col s12 ">
            <h4>Cadastrar Cliente</h4>
        </div>
        <form class="" name="formulario">
            <div class="row">
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">account_circle</i>
                    <input id="inputNome" type="text" class="validate" name="Name" >
                    <label for="inputNome">Nombre</label>
                </div>
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">perm_identity</i>
                    <input id="inputCPF" type="text" class="validate" name="CPF" >
                    <label for="inputCPF">CPF</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">mail</i>
                    <input id="inpuEmail" type="email" class="validate" name="Email">
                    <label for="inpuEmail">Email</label>
                </div>
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">phone</i>
                    <input id="inputResidencial" type="tel" class="validate" name="Residencial">
                    <label for="inputResidencial">Residêncial</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">phone</i>
                    <input id="inputCelular" type="tel" class="validate" name="Celular">
                    <label for="inputCelular">Celular</label>
                </div>

                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">phone</i>
                    <input id="inputComercial" type="tel" class="validate" name="Comercial">
                    <label for="inputComercial">Comercial</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">location_city</i>
                    <input id="inputCEP" type="text" class="validate" name="Cep">
                    <label for="inputCEP">CEP</label>
                </div>
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">location_city</i>
                    <input id="inputNumero" type="text" class="validate" name="Numero">
                    <label for="inputNumero">Número</label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">location_city</i>
                    <input id="inputLogradouro" type="text" class="validate" name="Logradouro">
                    <label for="inputLogradouro">Logradouro</label>
                </div>
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">location_city</i>
                    <input id="inputBairro" type="text" class="validate" name="Bairro">
                    <label for="inputBairro">Bairro</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">location_city</i>
                    <input id="inputLocalidade" type="text" class="validate" name="Localidade">
                    <label for="inputLocalidade">Localidade</label>
                </div>
                <div class="input-field col s5 m5 l5">
                    <i class="material-icons prefix">location_city</i>
                    <input id="inputEstado" type="text" class="validate" name="Estado">
                    <label for="inputEstado">Estado</label>
                </div>
            </div>
            <div class="row left-align">
                <div class="col s5 m5 l5">
                    <button class="btn waves-effect waves-light" type="submit" name="action">
                        Submit
                        <i class="material-icons right">send</i>
                    </button>
                </div>
            </div>
        </form>
    </div>

</main>
<footer><%@include file="/views/layout/footer.jsp" %></footer>

</body>
<script src="../resources/vendor/js/jquery-3.4.1.min.js"></script>
<script src="../resources/vendor/js/materialize.min.js"></script>
<script src="../resources/js/facturacion.js"></script>
</html>