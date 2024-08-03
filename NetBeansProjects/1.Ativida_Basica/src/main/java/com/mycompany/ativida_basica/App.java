package com.mycompany.ativida_basica;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--- Mercado Mamão com Açucar ---");
        
        //Dados do usuário.
        System.out.println("Digite o Preço do produto: ");
        double preco = teclado.nextDouble();
        
        //Calculo.
        double resultado = preco / 5;
        
        //Resultados.
        System.out.println("--- Resultados ---");
        System.out.println("O valor irá ser dividida em 5 prestações.");
        System.out.println("Valor de cada prestação: R$" + resultado);
    }
}