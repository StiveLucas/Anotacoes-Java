package com.mycompany.atividade_basica9;

import javax.security.auth.callback.TextOutputCallback;

public enum Sexo {
    
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String texto;

    private Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
