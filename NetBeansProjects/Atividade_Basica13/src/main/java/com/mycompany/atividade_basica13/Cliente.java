package com.mycompany.atividade_basica13;

public class Cliente extends Fisicas{
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, Estado_Civil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return  "\nCliente:" +
                "\nProtocolo de Atendimento: " + protocoloAtendimento +
                super.toString();
               
    }
    
    
}
