package main;

public class Formacao {

    public String nome;

    public double aumento;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAumento(double aumento){
        this.aumento = aumento;
    }
    
    public String getNome(){
        return this.nome;
    }

    public double getAumento(){
        return this.aumento;
    }
}
