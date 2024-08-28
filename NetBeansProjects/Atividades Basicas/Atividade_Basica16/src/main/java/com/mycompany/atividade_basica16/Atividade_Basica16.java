package com.mycompany.atividade_basica16;

public class Atividade_Basica16 {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Divisao div = new Divisao();
        Multiplicar multiplicar = new Multiplicar();
        
        System.out.println(soma.Calcular(8, 8));
        System.out.println(sub.Calcular(8, 8));
        System.out.println(div.Calcular(8, 8));
        System.out.println(multiplicar.Calcular(8, 8));
   
    }
}
