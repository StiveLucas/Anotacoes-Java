package com.mycompany.atividade_basica8;

public class Atividade_Basica8 {

    public static void main(String[] args) {
        
        Pets pet1 = new Pets("Davi", 8, "Inferior");
        Clientes cliente = new Clientes("Thiago", 20, pet1);
        
        System.out.println("Cliente:");
        System.out.println("\tNome: " + cliente.getNome());
        System.out.println("\tIdade: " + cliente.getIdade());
        System.out.println("Pet:");
        System.out.println("\tNome: " + cliente.getPet().getNome());
        System.out.println("\tIdade: " + cliente.getPet().getIdade());
        System.out.println("\tRaça: " + cliente.getPet().getRaca());
        
    }
}
