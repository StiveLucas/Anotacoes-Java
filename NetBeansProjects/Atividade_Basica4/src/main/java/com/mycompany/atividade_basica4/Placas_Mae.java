package com.mycompany.atividade_basica4;

public class Placas_Mae extends Componentes{
    
    private String soquete;

    public Placas_Mae(String marca, String modelo ,String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    
    
    
}
