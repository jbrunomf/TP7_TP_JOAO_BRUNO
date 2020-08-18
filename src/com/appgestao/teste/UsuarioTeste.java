package com.appgestao.teste;

import com.appgestao.dao.UsuarioDao;
import com.appgestao.model.Usuario;

public class UsuarioTeste {
    public static void main(String[] args) {

        Usuario u = new Usuario();
        u.setEmail("jbrunomf@hotmail.com");
        u.setNome("João Bruno");
        u.setSobrenome("M. Fernandes");
        u.setSenha("12345");
        u.setSexo("Masculino");
        UsuarioDao.incluir(u);

    }
}
