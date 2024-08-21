package com.mycompany.atividade_basica11;

public class Engenheiros extends Funcionario{
    private String crea;

    public Engenheiros(String nome, String cpf, String rg, double salario, String crea) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nEngenheiros:" + 
               "\nNome:" + super.getNome() +
               "\nCPF:" + super.getCpf() +
               "\nRG:" + super.getRg() +
               "\nSalário::" + super.getSalario()+
               "\nCrea:" + crea;
    }
    
    
}
