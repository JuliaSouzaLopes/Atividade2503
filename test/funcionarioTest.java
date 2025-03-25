package test;

import main.Cargo;
import main.Formacao;

public class funcionarioTest {

    @test
    void deveRetornarSalario(){
        Formacao formacao("Ensino Medio", 1.1);
        Cargo cargo("Tecnico administrativo", 1000.00);
        Funcionario funcionario("Marco", cargo, formacao);
        assertEquals(1100.00, funcionario.getSalario());
    }
    
}
