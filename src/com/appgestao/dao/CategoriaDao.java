package com.appgestao.dao;

import com.appgestao.conexao.Conexao;
import com.appgestao.model.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;


public class CategoriaDao extends Conexao{

    public static boolean incluir(Categoria categoria) {

            entityManager.getTransaction().begin();

            entityManager.persist(categoria);

            entityTransaction.commit();

            return true;
    }

    public static List getCategorias() {
        List categorias;

        try{


            Query getCategorias = entityManager.createQuery("select c from Categoria c");

            categorias = getCategorias.getResultList();
            return categorias;

        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }

    }


    public static int getCategoriaId(int cat){
        try {

            Categoria c;


            Query getCategoria = entityManager.createQuery("SELECT c from Categoria c where c.nome like :categoria", Categoria.class);

            getCategoria.setParameter("categoria", cat);

            c = (Categoria) getCategoria.getSingleResult();

            return c.getId();

        } catch (Exception e){
            e.printStackTrace();
            throw  e;
        }


    }

}

