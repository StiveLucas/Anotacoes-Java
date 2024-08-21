package com.mycompany.atividade_basica11;

public class Motoboys extends Funcionario{
    private String cnh;

    public Motoboys(String nome, String cpf, String rg, double salario, String cnh) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    
    @Override
    public String toString() {
        return "\nMotoboys:" + 
               "\nNome:" + super.getNome() +
               "\nCPF:" + super.getCpf() +
               "\nRG:" + super.getRg() +
               "\nSalário::" + super.getSalario()+
               "\nCNH:" + cnh + '}';
    }
    
}
