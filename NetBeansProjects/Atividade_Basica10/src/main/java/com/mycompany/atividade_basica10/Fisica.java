package com.mycompany.atividade_basica10;

public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String data_Nacimento;

    public Fisica(String nome, String telefone,String cpf, String rg, String data_Nacimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.data_Nacimento = data_Nacimento;
    }

    public String getData_Nacimento() {
        return data_Nacimento;
    }

    public void setData_Nacimento(String data_Nacimento) {
        this.data_Nacimento = data_Nacimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Fisica:" + 
               "\nNome:" + super.nome + 
               "\nTelefone:" + super.telefone + 
               "\nCPF:" + cpf + 
               "\nRG:" + rg + 
               "\nData de Nacimento:" + data_Nacimento;
    }
    
    
}
