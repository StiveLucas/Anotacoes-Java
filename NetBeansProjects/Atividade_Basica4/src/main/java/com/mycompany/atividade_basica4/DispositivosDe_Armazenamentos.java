package com.mycompany.atividade_basica4;

public class DispositivosDe_Armazenamentos extends Componentes{
    private String tipoConexao;
    private int capacidadeDe_Armazenamento;

    public DispositivosDe_Armazenamentos( String marca, String modelo, int capacidadeDe_Armazenament0, String tipoConexao) {
        super(marca, modelo);
        this.tipoConexao = tipoConexao;
        this.capacidadeDe_Armazenamento = capacidadeDe_Armazenamento;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public int getCapacidadeDe_Armazenamento() {
        return capacidadeDe_Armazenamento;
    }

    public void setCapacidadeDe_Armazenamento(int capacidadeDe_Armazenamento) {
        this.capacidadeDe_Armazenamento = capacidadeDe_Armazenamento;
    }


    
    
}
