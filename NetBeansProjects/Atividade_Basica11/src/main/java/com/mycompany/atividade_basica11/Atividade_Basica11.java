package com.mycompany.atividade_basica11;

public class Atividade_Basica11 {

    public static void main(String[] args) {
     
        Motoboys motoboy = new Motoboys("Goku", "57865-87", "4849-97", 4890.89, "7548856");
        Engenheiros engenheiro = new Engenheiros("Vegeta", "8686-37", "5885", 7500, "Crea Bahia");
        Medicos medico = new Medicos("Kakarot", "588-3636", "080890", 67890, "Colaborativo");
        
        System.out.println(motoboy);
        System.out.println(engenheiro);
        System.out.println(medico);
        
    }
}
