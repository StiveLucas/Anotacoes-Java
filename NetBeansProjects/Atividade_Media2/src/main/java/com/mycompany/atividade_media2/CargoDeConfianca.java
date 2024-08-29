package com.mycompany.atividade_media2;

public class CargoDeConfianca extends Funcionarios{
    
   private Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario_base, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario_base, dataNascimento);
        this.bonificacao = bonificacao;
    }

    
    @Override
    public double getSalarioFinal() {
        return super.getSalario_base();
    }

    @Override
    public String toString() {
        return "CargoDeConfianca:" +
               super.toString() +
               "\nBonificacao:" + bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
   
}
