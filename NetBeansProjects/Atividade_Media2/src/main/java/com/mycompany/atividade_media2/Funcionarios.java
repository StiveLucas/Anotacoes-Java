package com.mycompany.atividade_media2;

public abstract class Funcionarios implements SalarioFinal{
    private String nome;
    private String cpf;
    private String rg;
    private Endereco endereco;
    private Setor setor;
    private Sexo sexo;
    private double salario_base;
    private String dataNascimento;

    public Funcionarios(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario_base, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.salario_base = salario_base;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    @Override
    public String toString() {
        return "Funcionarios:" + 
               "\nNome:" + nome + 
               "\nCPF:" + cpf + 
               "\nRG:" + rg + 
               "\nEndereco:" + endereco + 
               "\nSetor:" + setor + 
               "\nSexo:" + sexo + 
               "\nSalario Base:" + salario_base + 
               "\nData de nascimento:" + dataNascimento;
    }

    
    
}
