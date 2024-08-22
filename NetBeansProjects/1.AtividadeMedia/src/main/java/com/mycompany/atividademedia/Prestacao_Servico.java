package com.mycompany.atividademedia;

public class Prestacao_Servico extends Juridicas{
    private String contrato_Inicio;
    private String contrato_Fim;

    public Prestacao_Servico(String contrato_Inicio, String contrato_Fim, String cnpj, String inscricao_Estadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricao_Estadual, nome, telefone, email, endereco);
        this.contrato_Inicio = contrato_Inicio;
        this.contrato_Fim = contrato_Fim;
    }

    public String getContrato_Fim() {
        return contrato_Fim;
    }

    public void setContrato_Fim(String contrato_Fim) {
        this.contrato_Fim = contrato_Fim;
    }

    public String getContrato_Inicio() {
        return contrato_Inicio;
    }

    public void setContrato_Inicio(String contrato_Inicio) {
        this.contrato_Inicio = contrato_Inicio;
    }

    @Override
    public String toString() {
        return "Prestacao de Servico:" + 
               "\nInicio do Contrato: " + contrato_Inicio + 
               "\nFim do Contrato: " + contrato_Fim +
               super.toString();
    }
    
    
}
