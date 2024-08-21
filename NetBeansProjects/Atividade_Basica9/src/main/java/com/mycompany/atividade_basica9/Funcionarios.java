package com.mycompany.atividade_basica9;

public class Funcionarios {
    
    private int id;
    private String nom;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNacimento;
    private Sexo sexo;
    private Setor setor;
    private double salario;
    private String telefone;
    private String email;
    private Enderecos endereco;

    public Funcionarios(int id, String nom, String cpf, String rg, String matricula, String dataNacimento, Sexo sexo, Setor setor, double salario, String telefone, String email, Enderecos endereco) {
        this.id = id;
        this.nom = nom;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNacimento = dataNacimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public Enderecos getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderecos endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionarios:" + 
               "\nId:" + id + 
               "\nNome:" + nom + 
               "\nCPF:" + cpf + 
               "\nRG:" + rg + 
               "\nMatricula:" + matricula + 
               "\nData de Nacimento:" + dataNacimento + 
               "\nSexo:" + sexo + 
               "\nSetor:" + setor + 
               "\nSalario:" + salario + 
               "\nTelefone:" + telefone + 
               "\nEmail:" + email + 
               "\n\nEndereco:" + endereco;
    }

    
    
    
    
    }

    
 
