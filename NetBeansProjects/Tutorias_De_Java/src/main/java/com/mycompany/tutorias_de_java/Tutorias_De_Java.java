package com.mycompany.tutorias_de_java;

public class Tutorias_De_Java {

    public static void main(String[] args) {
        
        //Variáveis.
        String nome = "Stive";
        String sobrenome = "Silveira";
        
        //Exibindo a quantidade de caracteres.
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        //Concatenando nome + sobrenome.
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        //Exibindo nome completo usando métodos Strings - Maiúscula
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
        
        //Exibindo nome complrto usando métodos Strings - Minúscula
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
        
    }
}
