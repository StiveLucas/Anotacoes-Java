package com.mycompany.atividade_media2;

public class Advogado extends Funcionarios{
    private String oab;

    public Advogado(String oab, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario_base, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario_base, dataNascimento);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
      @Override
    public double getSalarioFinal() {
        return super.getSalario_base();
    }

    @Override
    public String toString() {
        return "Advogado:" + 
               super.toString() +
               "\nOAB:" + oab;
    }
    
    
}
