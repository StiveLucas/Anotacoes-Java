package com.mycompany.principal;

public class Principal {

    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        
        cliente.setNome("Stive");
        cliente.setIdade(18);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        
    }
}
