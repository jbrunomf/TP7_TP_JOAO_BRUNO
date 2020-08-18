package com.appgestao.conexao;

import javax.persistence.*;


public class Conexao {

    @PersistenceContext
    protected static  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JBPersistenceUnit");
    protected static EntityManager entityManager = entityManagerFactory.createEntityManager();
    protected static EntityTransaction entityTransaction = entityManager.getTransaction();

}
