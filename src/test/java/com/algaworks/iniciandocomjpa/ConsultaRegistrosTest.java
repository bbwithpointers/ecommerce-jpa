package com.algaworks.iniciandocomjpa;

import com.algaworks.model.Produto;
import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

public class ConsultaRegistrosTest {

    private static EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    @BeforeClass
    public static void setUpBeforeClass() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Ecommerce-PU");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        entityManagerFactory.close();
    }

    @Before
    public void setUp() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @After
    public void tearDown() {
        entityManager.close();
    }


    @Test
    public void buscarPorId() {
        Produto produto = entityManager.find(Produto.class, 1);
        assertNotNull(produto);
    }

    @Test
    public void atualizaReferencia(){
        Produto produto = entityManager.find(Produto.class, 1);
        produto.setNome("Microfone");

        // volta original
        entityManager.refresh(produto);

        assertEquals("Kindle", produto.getNome());
    }

}
