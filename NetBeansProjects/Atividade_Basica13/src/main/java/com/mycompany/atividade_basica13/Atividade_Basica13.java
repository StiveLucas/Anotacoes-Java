package com.mycompany.atividade_basica13;

public class Atividade_Basica13 {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Viaduto", "333", "Nenhum", "466-90", Unidade_Federativa.BAHIA);
        Prestacao_Servico prestacao = new Prestacao_Servico("22/07/2024", "23/06/2027", "7567-897", "8667", "Carlos", "867876-97", "lucas.rtt@gmail.com", endereco);
        Cliente cliente = new Cliente("x9", Sexo.FEMENINO, Estado_Civil.CASADO, "02/07/2007", "Stive", "868-978", "lucas.s@gmail.com", endereco);
        
        System.out.println(prestacao);
        System.out.println(cliente);
        
        
    }
}
