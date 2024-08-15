package com.mycompany.atividade_basica4;

public class Atividade_Basica4 {

    public static void main(String[] args) {
      
       Processadores processador = new Processadores("Power Guido", "750");
        Memorias memoria = new Memorias(250, 5.90, "Jalan Bipal", "Dark");
        Placas_Mae placas = new Placas_Mae("Tekominamata", "5", "Seila");
        DispositivosDe_Armazenamentos dispositivos = new DispositivosDe_Armazenamentos("Bravo", "Preto", 90, "NAT 2");
        
        System.out.println("Processador:");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("\nMémoria:");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Capacidade de Armazenamento: " + memoria.getCapacidadeArmazenamento());
        System.out.println("Frequência: " + memoria.getFrequencia());
        System.out.println("\nPlaca Mãe:");
        System.out.println("Marca: " + placas.getMarca());
        System.out.println("Modelo: " + placas.getModelo());
        System.out.println("Soquete: " + placas.getSoquete());
        System.out.println("\nDispositivo de Armazenamento:");
        System.out.println("Marca: " + dispositivos.getMarca());
        System.out.println("Modelo: " + dispositivos.getModelo());
        System.out.println("Capacidade de Armazenamento: " + dispositivos.getCapacidadeDe_Armazenamento());
        System.out.println("Tipo de Conexão: " + dispositivos.getTipoConexao());
        
    }
}
