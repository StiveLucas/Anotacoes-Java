package com.mycompany.atividade_basica7;

public class Endereco {
    
    private String logradouro;
    private int numeo;
    private String cidade;

    public Endereco(String logradouro, int numeo, String cidade) {
        this.logradouro = logradouro;
        this.numeo = numeo;
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumeo() {
        return numeo;
    }

    public void setNumeo(int numeo) {
        this.numeo = numeo;
    }
    
}
