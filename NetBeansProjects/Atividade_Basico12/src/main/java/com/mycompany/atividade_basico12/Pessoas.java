package com.mycompany.atividade_basico12;

public abstract class Pessoas {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Enderecos enderecos;

    public Pessoas(String nome, String telefone, String email, Enderecos enderecos) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.enderecos = enderecos;
    }

    public Enderecos getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
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
        return 
               "\nNome: " + nome + 
               "\nTelefone: " + telefone + 
               "\nEmail: " + email + 
               "\nEnderecos: " + enderecos;
    }
    
    
}
