package com.mycompany.atividademedia;

public class Advogado extends Funcionarios{
    private String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setores setor, double salario, Sexo sexo, Estado_Civil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\nAdvogado:" + 
               "\nOAB:" + oab +
               super.toString();
    }
    
    
}
