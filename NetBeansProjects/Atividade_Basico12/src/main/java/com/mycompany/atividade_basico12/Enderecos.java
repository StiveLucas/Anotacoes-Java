package com.mycompany.atividade_basico12;

public class Enderecos {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private Unidade_Federativa uf;

    public Enderecos(String logradouro, String numero, String complemento, String cep, String cidade, Unidade_Federativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Unidade_Federativa getUf() {
        return uf;
    }

    public void setUf(Unidade_Federativa uf) {
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\nEnderecos:" + 
               "\nLogradouro: " + logradouro + 
               "\nNumero: " + numero + 
               "\nComplemento: " + complemento + 
               "\nCEP: " + cep + 
               "\nCidade: " + cidade + 
               "\nUF: " + uf.getNome();
    }

    
    
    
}
