package com.mycompany.ativida_basica;

import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //Variáveis.
        float somaDasNotas = 0;
        
        //Dados do usuário.
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.next();
        
        System.out.println("Digite a 1º nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Digite a 2º nota: ");
        float nota2 = teclado.nextFloat();
        
        //Calculo.
        somaDasNotas = nota1 + nota2;
        float media = somaDasNotas / 2;
        
        //Resultados.
        System.out.println("--- Resultados ---");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        
        if(media < 7){
            System.out.println("Situação: Reprovado");
        
        }else{
            System.out.println("Situação: Aprovado");
        
        }
        
    }
    
}
