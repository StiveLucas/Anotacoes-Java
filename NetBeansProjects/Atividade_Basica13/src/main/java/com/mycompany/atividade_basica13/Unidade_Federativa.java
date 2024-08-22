package com.mycompany.atividade_basica13;

public enum Unidade_Federativa {
    BAHIA("Bahia"),
    SAO_PAULO("São de Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro");
    
    private String nome;

    private Unidade_Federativa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
