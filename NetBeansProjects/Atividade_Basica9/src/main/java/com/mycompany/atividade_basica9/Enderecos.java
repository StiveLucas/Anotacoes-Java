package com.mycompany.atividade_basica9;

public class Enderecos {
    
    
    private String logradouro ;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private Unidade_Federativa unidade;

    public Enderecos(String logradouro, String numero, String complemento, String cep, String cidade, Unidade_Federativa unidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidade = unidade;
    }

    public Unidade_Federativa getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade_Federativa unidade) {
        this.unidade = unidade;
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
        return "\nLogradouro:" + logradouro + 
               "\nNumero:" + numero + 
               "\nComplemento:" + complemento + 
               "\nCEP:" + cep + 
               "\nCidade:" + cidade + 
               "\nUnidade:" + unidade;
    }
    
    
    
}
