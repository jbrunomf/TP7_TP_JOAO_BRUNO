package com.appgestao.controller;

import com.appgestao.dao.ProdutoDao;
import com.appgestao.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProdutoDeleteController", urlPatterns = {"/ProdutoDeleteController"})
public class ProdutoDeleteController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int idProduto = Integer.parseInt(request.getParameter("idProduto"));

        ProdutoDao.deletar(idProduto);

        request.setAttribute("listaProduto", ProdutoDao.buscarProdutos());

        request.getRequestDispatcher("listaproduto.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
