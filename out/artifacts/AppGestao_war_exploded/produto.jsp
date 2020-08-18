<%--
  Created by IntelliJ IDEA.
  User: jbrun
  Date: 13/08/2020
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Produto</title>
    <link rel="stylesheet" href="./assets/css/bootstrap.min.css">
</head>
<body>
<h1>Testando página de produto</h1>



<form method="post" action="CadastrarProdutoServlet">
    <div class="form-group">
        <label for="cadastrarProduto">Produto</label>
        <input type="text" class="form-control" id="cadastrarProdutoNome" placeholder="Nome" name="nome">
    </div>
    <div class="form-group">
        <label for="cadastrarProduto">Categoria</label>
        <select class="form-control" id="cadastrarProduto" name="categoria">
        <c:forEach var="categoria" items="${getCategorias}">
            <option value="${categoria.id}">${categoria.nome}</option>
<%--            <option>Placa de vídeo</option>--%>
<%--            <option>Cooler</option>--%>
<%--            <option>Fonte</option>--%>
        </c:forEach>
        </select>

    </div>
    <div class="form-group">
        <label for="cadastrarProduto">Preço</label>
        <input type="text" class="form-control" id="cadastarProdutoPreco" placeholder="Preço" name="preco">
    </div>
    <div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Cadastrar</button>
    </div>
</form>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="./assets/js/vendor/jquery.slim.min.js"><\/script>')</script>
<script src="./assets/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
<script src="./assets/js/dashboard.js"></script>
</body>
</html>
