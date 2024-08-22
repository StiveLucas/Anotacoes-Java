package com.mycompany.atividademedia;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMENINO("Feminino");
    
    private String nome;

    private Sexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
