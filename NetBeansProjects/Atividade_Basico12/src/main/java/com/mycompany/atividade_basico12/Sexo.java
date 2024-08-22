package com.mycompany.atividade_basico12;

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
