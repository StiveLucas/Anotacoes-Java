package com.mycompany.atividade_atribuindo_funcionarios;

public class Atividade_atribuindo_funcionarios {

    public static void main(String[] args) {
        
        Funcionarios funcionario = new Funcionarios("Lucas", 20, 2500);
        
        //funcionario.setNome("Stive");
        //funcionario.setIdade(18);
        //funcionario.setSalario(1450);
        
        System.out.println("Nome do Funcionário: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salário: R$" + funcionario.getSalario());
        
    }
}
