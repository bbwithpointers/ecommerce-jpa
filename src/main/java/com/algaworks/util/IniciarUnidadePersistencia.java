package com.algaworks.util;

import com.algaworks.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IniciarUnidadePersistencia {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ecommerce-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // testes crud
        Produto produto = entityManager.find(Produto.class, 1);
        System.out.println(produto.getNome());

        entityManager.close();
        entityManagerFactory.close();

    }

}
