package com.mycompany.atividademedia;

public class Engenheiros extends Funcionarios{
    private String crea;

    public Engenheiros(String crea, String cpf, String rg, String matricula, Setores setor, double salario, Sexo sexo, Estado_Civil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
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
        return "Engenheiros:" + 
               "\nCrea:" + crea +
               super.toString();
    }
    
    
}
