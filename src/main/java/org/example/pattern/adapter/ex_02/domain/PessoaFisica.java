package org.example.pattern.adapter.ex_02.domain;

public class PessoaFisica  extends  Pessoa {

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
