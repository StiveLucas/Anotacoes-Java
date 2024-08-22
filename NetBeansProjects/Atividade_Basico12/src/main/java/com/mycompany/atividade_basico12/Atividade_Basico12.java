package com.mycompany.atividade_basico12;

public class Atividade_Basico12 {

    public static void main(String[] args) {
        
        Enderecos enderecos = new Enderecos("Condominio", "4", "1º Andar", "477857-87", "Salvador", Unidade_Federativa.BAHIA);
        Fisica fisica = new Fisica(Sexo.FEMENINO, "02/09/2008", "Gabrielle", "4746786-8", "Lucas", enderecos);
        Juridica juridica = new Juridica("767458-854", "854854834.74578.549", "Lucas", "42845-8746", "lucas.s.tg@gmaiç.com", enderecos);
        
        System.out.println(juridica);
        System.out.println(fisica);
        
    }
}