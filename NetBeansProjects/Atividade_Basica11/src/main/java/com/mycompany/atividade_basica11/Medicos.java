package com.mycompany.atividade_basica11;

public class Medicos extends Funcionario{
    private String crm;

    public Medicos(String nome, String cpf, String rg, double salario, String crm) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nMédicos:" + 
               "\nNome:" + super.getNome() +
               "\nCPF:" + super.getCpf() +
               "\nRG:" + super.getRg() +
               "\nSalário::" + super.getSalario()+
               "\nCrm:" + crm;
    }
    
    
    
}
