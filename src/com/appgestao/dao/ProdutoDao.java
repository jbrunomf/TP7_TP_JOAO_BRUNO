package com.appgestao.dao;

import com.appgestao.conexao.Conexao;
import com.appgestao.model.Produto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.List;


public class ProdutoDao extends Conexao{

    public static boolean incluir(Produto produto) {

        try {
            if (!entityTransaction.isActive()){
                entityTransaction.begin();
            }



//            entityManager.getTransaction();

            entityManager.persist(produto);

            entityTransaction.commit();

            return true;
        } catch (Exception e) {
            entityTransaction.rollback();
            return false;
        }
    }

    public static void deletar(int id) {

        try{
            if (!entityTransaction.isActive()){
                entityTransaction.begin();
            }

            Query deletarProduto = entityManager.createQuery("delete FROM Produto p WHERE p.id = :idProduto");
            deletarProduto.setParameter("idProduto", id);
            int rowsDeleted = deletarProduto.executeUpdate();
            System.out.println("Produtos deletados: " +rowsDeleted);
            entityTransaction.commit();

        } catch (Exception e){
            entityTransaction.rollback();
            throw e;
        }

    }

    public static List buscarProdutos() {
        List produtos;

        try{
//            entityTransaction.begin();

//            entityManager.getTransaction();

            Query buscaProdutos = entityManager.createQuery("select p from Produto p");

            produtos = buscaProdutos.getResultList();
            return produtos;

        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }

    }

//    private static void atualizarProduto() {
//
//        entityManager.getTransaction().begin();
//        Query query = entityManager.createQuery("UPDATE Produto  SET e.salary = e.salary + :increment "
//                + "WHERE e.dept = :dept");
//        query.setParameter("increment", 500d);
//        query.setParameter("dept", "IT");
//        int rowsUpdated = query.executeUpdate();
//        System.out.println("entities Updated: " + rowsUpdated);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//    }

}
