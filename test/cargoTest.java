package test;
import main.Cargo;

public class CargoTest{
    @test
    void deveRetornarNome(){
        Cargo cargo = new Cargo("gerente", 2500.00);
        assertEquals("gerente", cargo.getNome());
    }

    @test
    void deveRetornarSalario({
        Cargo cargo = new Cargo("gerente", 2500.00);
        assertEquals(2500.00, cargo.getSalarioBase());
    })
}