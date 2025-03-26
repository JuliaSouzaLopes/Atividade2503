package test;
import main.Formacao;

public class FormacaoTest {

    @test
    void deveRetornarNome(){
        Formacao formacao = new Formacao("Faculdade", 1.50);
        assertEquals("Faculdade", formacao.getNome());
    }

    @test
    void deveRetornarAumento({
        Formacao formacao = new Formacao("Faculdade", 1.50);
        assertEquals(1.50, formacao.getAumento());
    })

}