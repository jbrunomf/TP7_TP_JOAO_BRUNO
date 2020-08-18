<%--
  Created by IntelliJ IDEA.
  User: jbrun
  Date: 14/08/2020
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.1.1">
    <title>Signin Template · Bootstrap</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/sign-in/">

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="./assets/css/bootstrap.min.css">

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
    <!-- Custom styles for this template -->
    <link href="./assets/css/signin.css" rel="stylesheet">
</head>
<body class="text-center">
<form class="form-signin" method="post" action="UsuarioController">
    <img class="mb-4" src="./assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">Cadastre-se.</h1>
    <label for="inputNome" class="sr-only">Nome</label>
    <input type="text" id="inputNome" class="form-control" name="nome" placeholder="Seu nome" required autofocus>

    <label for="inputSobrenome" class="sr-only">Sobrenome</label>
    <input type="text" id="inputSobrenome" class="form-control" name="sobrenome" placeholder="Seu sobrenome" required autofocus>

    <label for="inputEmail" class="sr-only">Email</label>
    <input type="text" id="inputEmail" class="form-control" name="email" placeholder="email@exemplo.com" required autofocus>

    <label for="inputPassword" class="sr-only">Senha</label>
    <input type="password" id="inputPassword" class="form-control" name="senha" placeholder="Sua senha" required>

    <label for="" class="sr-only">Sexo</label>
    <input type="radio" id="male" name="sexo" value="masculino">
    <label for="male">Male</label><br>
    <input type="radio" id="female" name="sexo" value="feminino">
    <label for="female">Female</label><br>
    <input type="radio" id="other" name="sexo" value="outro">
    <label for="other">Other</label>


    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> Lembrar
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Fianalizar Cadastro!</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2019-2020</p>
</form>
</body>
</html>
