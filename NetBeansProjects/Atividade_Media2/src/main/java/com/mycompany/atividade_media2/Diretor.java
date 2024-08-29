package com.mycompany.atividade_media2;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private double premio = 0.5;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario_base, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario_base, dataNascimento);
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }
    
    


    
    
    
}
