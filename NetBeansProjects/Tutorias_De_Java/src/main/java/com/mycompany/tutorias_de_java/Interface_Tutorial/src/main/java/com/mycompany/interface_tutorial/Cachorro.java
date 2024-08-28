package com.mycompany.interface_tutorial;

public class Cachorro implements Animal{

    //Voce pode Sobrescrever
    @Override
    public String emitirSom() {
        return "Auau!";
        
    }
    
}
