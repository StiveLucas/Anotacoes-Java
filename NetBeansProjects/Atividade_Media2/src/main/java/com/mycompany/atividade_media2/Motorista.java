package com.mycompany.atividade_media2;

public class Motorista extends Funcionarios{
    private String carteiraDeTrabalho;

    public Motorista(String carteiraDeTrabalho, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario_base, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario_base, dataNascimento);
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }
    
    @Override
    public String toString() {
        return "Motorista:" + 
               super.toString() +
               "\nCarteira de trabalho:" + carteiraDeTrabalho;
    }

    @Override
    public double getSalarioFinal() {
        
        return super.getSalario_base();
    }
    
    
    
}
