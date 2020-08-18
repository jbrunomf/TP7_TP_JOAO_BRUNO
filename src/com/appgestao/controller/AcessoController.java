package com.appgestao.controller;

import com.appgestao.dao.ProdutoDao;
import com.appgestao.dao.UsuarioDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AcessoController", urlPatterns = {"/AcessoController"})
public class AcessoController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String senha = request.getParameter("senha");


            if (UsuarioDao.buscaUsuario(email, senha)) {
                request.setAttribute("listaProduto", ProdutoDao.buscarProdutos());
                request.getRequestDispatcher("dashboard.jsp").forward(request, response);
            }
            else {

                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

    }

        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

            request.getRequestDispatcher("cadastrar.jsp").forward(request, response);

        }
    }


