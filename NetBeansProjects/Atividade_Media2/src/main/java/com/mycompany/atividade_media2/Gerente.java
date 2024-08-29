package com.mycompany.atividade_media2;

public class Gerente extends Funcionarios{

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario_base, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario_base, dataNascimento);
    }

    @Override
    public String toString() {
        return "Gerente:" + 
                super.toString();
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalario_base();
    }
    
    
    
    
}
