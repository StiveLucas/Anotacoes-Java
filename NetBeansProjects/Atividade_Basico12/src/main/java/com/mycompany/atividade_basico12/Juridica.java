package com.mycompany.atividade_basico12;

public class Juridica extends Pessoas{
    
    private String cnpj;
    private String inscricao_Estadual;

    public Juridica(String cnpj, String inscricao_Estadual, String nome, String telefone, String email, Enderecos enderecos) {
        super(nome, telefone, email, enderecos);
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
        return "\nJuridica: " + 
               super.toString() +
               "\nCNPJ: " + cnpj + 
               "\nInscricao Estadual:" + inscricao_Estadual;
    }
    
    
}
