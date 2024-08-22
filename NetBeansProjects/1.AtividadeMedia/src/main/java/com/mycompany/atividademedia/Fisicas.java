package com.mycompany.atividademedia;

public abstract class Fisicas extends Pessoas{
    protected Sexo sexo;
    protected Estado_Civil estadoCivil;
    protected String dataNascimento;

    public Fisicas(Sexo sexo, Estado_Civil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Estado_Civil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Estado_Civil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSexo:" + sexo.getNome() + 
               "\nEstado Civil:" + estadoCivil.getTexto() + 
               "\nData de Nascimento:" + dataNascimento;
    }
    
    
}
