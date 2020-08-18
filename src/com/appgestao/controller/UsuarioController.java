package com.appgestao.controller;

import com.appgestao.dao.UsuarioDao;
import com.appgestao.model.Usuario;
import jdk.swing.interop.SwingInterOpUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UsuarioController", urlPatterns = {"/UsuarioController"})
public class UsuarioController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            Usuario usuario = new Usuario();

            usuario.setNome(request.getParameter("nome"));
            usuario.setSobrenome(request.getParameter("sobrenome"));
            usuario.setEmail(request.getParameter("email"));
            usuario.setSenha(request.getParameter("senha"));
            usuario.setSexo(request.getParameter("sexo"));

            UsuarioDao.incluir(usuario);

            request.getRequestDispatcher("dashboard.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println(request.getMethod());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
