package com.mycompany.atividade_basica10;

public class Juridico extends Pessoa{
    private String cnpj;
    private String inscrricao_Estadual;

    public Juridico(String nome, String telefone,String cnpj, String inscrricao_Estadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscrricao_Estadual = inscrricao_Estadual;
    }

    public String getInscrricao_Estadual() {
        return inscrricao_Estadual;
    }

    public void setInscrricao_Estadual(String inscrricao_Estadual) {
        this.inscrricao_Estadual = inscrricao_Estadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nJuridico:" + 
               "\nNome:" + super.nome +
               "\nTelefone:" + super.telefone +
               "\nCNPJ:" + cnpj + 
               "\nInscrricao Estadual:" + inscrricao_Estadual;
    }
    
    
}
