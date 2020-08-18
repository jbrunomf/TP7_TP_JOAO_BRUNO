package com.appgestao.dao;

import com.appgestao.conexao.Conexao;
import com.appgestao.model.Usuario;

import javax.persistence.*;
import java.util.List;

public class UsuarioDao extends Conexao {


    public static boolean incluir(Usuario usuario) {

        try {

//            entityManager.getTransaction();

//            entityTransaction.begin();

            entityManager.persist(usuario);

            entityTransaction.commit();

            return true;
        } catch (Exception e) {
            entityTransaction.rollback();
            return false;
        }

    }


    public boolean deletarUsuario(Usuario usuario) {
        try {
            entityManager.remove(usuario);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public static boolean buscaUsuario(String email, String senha) {

        try {
            if (!entityTransaction.isActive()){
                entityTransaction.begin();
            }

//            entityManager.getTransaction();

            Usuario u;
            Query buscaUser = entityManager.createQuery("select u from Usuario u where email like :email and senha like :senha", Usuario.class);
            buscaUser.setParameter("email", email);
            buscaUser.setParameter("senha", senha);
            u = (Usuario) buscaUser.getSingleResult();

            return u != null;

        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
            throw  e;
        }

    }

    public static List buscaUsuarios(){
        List usuarios;

        try {
            Query buscaUsuarios = entityManager.createQuery("SELECT u from Usuario u");
            usuarios = buscaUsuarios.getResultList();
            return usuarios;

        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }

    }
}
