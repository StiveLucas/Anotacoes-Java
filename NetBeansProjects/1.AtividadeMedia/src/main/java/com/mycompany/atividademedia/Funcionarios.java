package com.mycompany.atividademedia;

public abstract class Funcionarios extends Fisicas{
    private String cpf;
    private String rg;
    private String matricula;
    private Setores setor;
    private double salario;

    public Funcionarios(String cpf, String rg, String matricula, Setores setor, double salario, Sexo sexo, Estado_Civil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setores getSetor() {
        return setor;
    }

    public void setSetor(Setores setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    @Override
    public String toString() {
        return "\nFuncionario:" + 
               "\nCPF: " + cpf + 
               "\nRG: " + rg + 
               "\nMatricula: " + matricula + 
               "\nSetor: " + setor.getNome() + 
               "\nSalario: " + salario +
               super.toString();
    }
}