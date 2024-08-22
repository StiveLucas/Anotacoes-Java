package com.mycompany.atividade_basica13;

public abstract class Pessoas {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public Pessoas(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
               "\nTelefone: " + telefone + 
               "\nEmail: " + email +
               "\nEndereco: " + endereco;
        
    }
    
    
}
