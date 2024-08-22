package com.mycompany.atividade_basico12;

public class Fisica extends Pessoas{
    
    private Sexo sexo;
    private String data_Nascimento;

    public Fisica(Sexo sexo, String data_Nascimento, String nome, String telefone, String email, Enderecos enderecos) {
        super(nome, telefone, email, enderecos);
        this.sexo = sexo;
        this.data_Nascimento = data_Nascimento;
    }

    public String getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(String data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "\nFisica:" + 
               super.toString() +
               "\nSexo: " + sexo.getNome() + 
               "\nData Nascimento:" + data_Nascimento;
    }
    
    
}
