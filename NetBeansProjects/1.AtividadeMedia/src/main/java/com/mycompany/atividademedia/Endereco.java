package com.mycompany.atividademedia;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private Unidade_Federativa uf;

    public Endereco(String logradouro, String numero, String complemento, String cep, Unidade_Federativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
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

    @Override
    public String toString() {
        return 
               "\nLogradouro:" + logradouro + 
               "\nNumero: " + numero + 
               "\nComplemento: " + complemento + 
               "\nCEP: " + cep + 
               "\nUF: " + uf.getNome();
    }
    
    
}
