package com.mycompany.atividademedia;

public class Medico extends Funcionarios{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setores setor, double salario, Sexo sexo, Estado_Civil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
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
        return "\nMedico:" + 
               "\nCRM: " + crm +
               super.toString();
    }
    
    
}
