package com.mycompany.atividade_media2;

public enum UnidadeFederativa {
    BAHIA("Bahia"),
    SAO_PAULO("São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro");
    
    private String nome;

    private UnidadeFederativa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
