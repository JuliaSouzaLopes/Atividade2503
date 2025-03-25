package main;

public class Cargo {

    public String nome;
    public double salarioBase;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalarioBase(double salario){
        this.salarioBase = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }
    
}
