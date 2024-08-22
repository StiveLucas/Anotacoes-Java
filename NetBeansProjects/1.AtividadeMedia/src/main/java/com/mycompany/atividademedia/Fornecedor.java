package com.mycompany.atividademedia;

public class Fornecedor extends Juridicas{
    
    private String produto;

    public Fornecedor(String produto, String cnpj, String inscricao_Estadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricao_Estadual, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecedor:" +
               "\nProduto: " + produto +
               super.toString();

    }
    
    
}
