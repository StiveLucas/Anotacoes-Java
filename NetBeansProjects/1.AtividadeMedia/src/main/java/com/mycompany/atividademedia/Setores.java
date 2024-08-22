package com.mycompany.atividademedia;

public enum Setores {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico");
    
    private String nome;

    private Setores(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
