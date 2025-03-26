package test;

import main.Cargo;
import main.Formacao;
import main.Funcionario;

public class FuncionarioTest {

    @test
    void deveRetornarSalario(){
        Formacao formacao = new Formacao("Ensino Medio", 1.1);
        Cargo cargo = new Cargo("Tecnico administrativo", 1000.00);
        Funcionario funcionario = new Funcionario("Marco", cargo, formacao);
        assertEquals(1100.00, funcionario.getSalario());
    }
    
    @test
    void deveRetornarNome(){
        Formacao formacao = new Formacao("Ensino Medio", 1.1);
        Cargo cargo = new Cargo("Tecnico administrativo", 1000.00);
        Funcionario funcionario = new Funcionario("Marco", cargo, formacao);
        assertEquals("Marco", funcionario.getNome());
    }

    @test
    void deveRetornarCargo(){
        Formacao formacao = new Formacao("Ensino Medio", 1.1);
        Cargo cargo = new Cargo("Tecnico administrativo", 1000.00);
        Funcionario funcionario = new Funcionario("Marco", cargo, formacao);
        assertEquals("Tecnico administrativo", funcionario.cargo.getNome());
    }

    @test
    void deveRetornarSalarioBase(){
        Formacao formacao = new Formacao("Ensino Medio", 1.1);
        Cargo cargo = new Cargo("Tecnico administrativo", 1000.00);
        Funcionario funcionario = new Funcionario("Marco", cargo, formacao);
        assertEquals(1000.00, funcionario.cargo.getSalarioBase())
    }

    @test
    void deveRetornarFormacao(){
        Formacao formacao = new Formacao("Ensino Medio", 1.1);
        Cargo cargo = new Cargo("Tecnico administrativo", 1000.00);
        Funcionario funcionario = new Funcionario("Marco", cargo, formacao);
        assertEquals("Ensino Medio", funcionario.formacao.getNome());
    }

    @test
    void deveRetornarAumento(){
        Formacao formacao = new Formacao("Ensino Medio", 1.1);
        Cargo cargo = new Cargo("Tecnico administrativo", 1000.00);
        Funcionario funcionario = new Funcionario("Marco", cargo, formacao);
        assertEquals(1.1, funcionario.formacao.getAumento());
    }


}
