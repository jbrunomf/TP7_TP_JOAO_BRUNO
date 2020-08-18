package com.appgestao.controller;

import com.appgestao.dao.CategoriaDao;
import com.appgestao.dao.ProdutoDao;
import com.appgestao.model.Categoria;
import com.appgestao.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CadastrarProdutoServlet", urlPatterns = {"/CadastrarProdutoServlet"})
public class CadastrarProdutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Categoria c = new Categoria(Integer.valueOf(request.getParameter("categoria")));

        Produto p = new Produto();
        p.setNome(request.getParameter("nome"));
        p.setPreco(Float.valueOf(request.getParameter("preco")));
        p.setCategoria(c);


        ProdutoDao.incluir(p);

        request.setAttribute("listaProduto", ProdutoDao.buscarProdutos());
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("getCategorias", CategoriaDao.getCategorias());

        request.getRequestDispatcher("produto.jsp").forward(request, response);

    }
}
