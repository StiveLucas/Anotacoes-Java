package com.mycompany.ativida_basica;

import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Dados do Usuário.
        System.out.println("Digite o nome do usuário:");
        String nome = teclado.next();
        
        System.out.println("Digite a 1º nota:");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Digite a 2º nota:");
        double nota2 = teclado.nextDouble();
        
        //Calculo.
        double somaDasNotas = nota1 + nota2;
        double media = somaDasNotas / 2;
        
        //Resultado
        System.out.println("--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        
        if(media > 7){
            System.out.println("Situação: Aprovado");
            
        }
        
        if(media >= 5 && media <= 7){
            System.out.println("Situação: Verificação Suplementar");
            
        }
        
        if(media < 5){
            System.out.println("Situação: Reprovado");
        
        }
        
       }
    }