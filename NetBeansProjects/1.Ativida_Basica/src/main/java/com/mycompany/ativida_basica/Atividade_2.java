
package com.mycompany.ativida_basica;

import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        //Variáveis.
        int menor_Numero;
        
        //Dados do usuário.
        System.out.println("Digite o 1º número:");
        int numero1 = teclado.nextInt();
        
        System.out.println("Digite o 2º  número:");
        int numero2 = teclado.nextInt();
        
        //Calculo.
        if(numero1 > numero2){
            menor_Numero = numero2;
            
        }else{
            menor_Numero = numero1;
            
        }
        
        //Resultado
        System.out.println("--- Resultado ---");
        System.out.println("Menor número: " + menor_Numero);
        
    }
                
}
