package com.algaworks.iniciandocomjpa;

import com.algaworks.EntityManagerTest;
import com.algaworks.model.Produto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConsultaRegistrosTest extends EntityManagerTest {

    @Test
    public void buscarPorId() {
        Produto produto = entityManager.find(Produto.class, 1);
        assertNotNull(produto);
    }

    @Test
    public void atualizaReferencia() {
        Produto produto = entityManager.find(Produto.class, 1);
        produto.setNome("Microfone");

        // volta original
        entityManager.refresh(produto);

        assertEquals("Kindle", produto.getNome());
    }

}
