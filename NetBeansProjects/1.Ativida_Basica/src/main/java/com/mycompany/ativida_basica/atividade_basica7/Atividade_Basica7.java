package com.mycompany.atividade_basica7;

import java.util.Scanner;

public class Atividade_Basica7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        
        Endereco enderecos = new Endereco("Viaduto", 506, "Salvador");
        Cliente clientes = new Cliente("Stive", 18, enderecos);
        
        System.out.println("Cliente:");
        System.out.println("\tNome: " + clientes.getNome());
        System.out.println("\tIdade: " + clientes.getIdade());
        System.out.println("Endereço: ");
        System.out.println("\tLogradouro: " + clientes.getEndereco().getLogradouro());
        System.out.println("\tNúmero: " + clientes.getEndereco().getNumeo());
        System.out.println("\tCidade: " + clientes.getEndereco().getCidade());
        
        
        
    }
}
