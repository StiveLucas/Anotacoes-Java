package com.mycompany.atividade_basica13;

public abstract class Juridicas extends Pessoas{
    protected String cnpj;
    protected String inscricao_Estadual;

    public Juridicas(String cnpj, String inscricao_Estadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricao_Estadual = inscricao_Estadual;
    }

    public String getInscricao_Estadual() {
        return inscricao_Estadual;
    }

    public void setInscricao_Estadual(String inscricao_Estadual) {
        this.inscricao_Estadual = inscricao_Estadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() +
               "CNPJ: " + cnpj + 
               "\ninscricao Estadual: " + inscricao_Estadual;
    }
    
    
    
}
