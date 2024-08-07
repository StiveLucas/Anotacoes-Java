package com.mycompany.tutorias_de_java;


public class Comparando_Strings {
    public static void main(String[] args) {
        
        //Variáveis.
    String nomeUsuario = "Stive";
    int senha = 123;
    
    //Comparação de Strings e inteiros.
    boolean resultadoNome = nomeUsuario.equals("Stive");
    boolean resultadoSenha = (senha == 123);
    
    //Exibindo resultado
        System.out.println("O nome do usuário está correto? " +resultadoNome);
        System.out.println("A senha está corrreta? " + resultadoSenha);
    
    }
    
    
}
