package main;

class Funcionario {

    public String nome;
    public Cargo cargo;
    public Formacao formacao;
    public double salario = this.cargo.getSalarioBase()*this.formacao.getAumento();

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNomeCargo(){
        return this.cargo.getNome();
    }

    public String getNomeFormacao(){
        return this.cargo.getNome();
    }

    public double getSalario(){
        return this.salario;
    }

    
}