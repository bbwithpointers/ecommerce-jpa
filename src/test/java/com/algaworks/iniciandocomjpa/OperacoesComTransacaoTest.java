package com.algaworks.iniciandocomjpa;

import com.algaworks.EntityManagerTest;
import com.algaworks.model.Produto;
import org.junit.Test;

public class OperacoesComTransacaoTest extends EntityManagerTest {

    @Test
    public void abrirEFecharTransacao() {
        Produto produto = new Produto(); // somente para operacoes não darem erro

        entityManager.getTransaction().begin(); // comeco
        // ---- operacoes
//        entityManager.persist(produto);
//        entityManager.merge(produto);
//        entityManager.remove(produto);
        // ---- operacoes
        entityManager.getTransaction().commit(); // final
    }


}
