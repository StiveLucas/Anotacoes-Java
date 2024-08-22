package com.mycompany.atividademedia;

public class App {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Viaduto", "344", "Nenhum", "57754-48", Unidade_Federativa.BAHIA);
        Cliente cliente = new Cliente("457854-96", Sexo.FEMENINO, Estado_Civil.CASADO, "08/5/1889", "Thiago", "74374-384", "krlbola@gmail.com", endereco);
        Prestacao_Servico prestacao = new Prestacao_Servico("08/07/1909", "02/07/2030", "775-84", "5787849549", "Davi", "585958-8956", "seoai@gmail.com", endereco);
        Fornecedor fornecedor = new Fornecedor("Jogos", "857439", "83427643934-75", "Paulo", "845943-84", "lofdhb@gmail.com", endereco);
        Engenheiros engenheiro = new Engenheiros("575", "673276489", "84782129-6", "4325375485", Setores.SAUDE, 4500, Sexo.MASCULINO, Estado_Civil.CASADO, "07/6/0009", "Pedro", "543322664-57", "lupi@gmail.com", endereco);
        Medico medico = new Medico("8347", "548644332-47", "13453-8767", "32345566474", Setores.SAUDE, 3477, Sexo.FEMENINO, Estado_Civil.CASADO, "30/09/2000", "jessica", "8854-76", "jessi@gmail.com", endereco);
        Advogado advogado = new Advogado("778559", "4566734-4746", "345563", "1111111", Setores.SAUDE, 0, Sexo.FEMENINO, Estado_Civil.SEPARADO, "24/12/2087", "Luna", "6746238-90", "popo@gmail.com", endereco);
        
        System.out.println(engenheiro);
        System.out.println(medico);
        System.out.println(advogado);
        
    }
}
