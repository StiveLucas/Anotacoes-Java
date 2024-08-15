package com.mycompany.atividade_basica4;

public class Memorias extends Componentes {

    private int capacidadeArmazenamento;
    private double frequencia;

    public Memorias(int capacidadeArmazenamento, double frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
 
    
}
    
    
