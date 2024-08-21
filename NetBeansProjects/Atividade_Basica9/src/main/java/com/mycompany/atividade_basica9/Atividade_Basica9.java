package com.mycompany.atividade_basica9;

public class Atividade_Basica9 {

    public static void main(String[] args) {
        
        Enderecos endereco = new Enderecos("Montanha Paul", "7", "Nenhum", "000-0000", "Seila", Unidade_Federativa.Bahia);
        
        Funcionarios funcionario = new Funcionarios(1, "Goku", "569-09", "1608-65", "666-5666", "09/03/1985", Sexo.MASCULINO, Setor.JURIDICO, 2459.50, "7585-855", "Goku.maisforte@gmail.com", endereco);
             
        
        System.out.println(funcionario.toString());
        
    }
}