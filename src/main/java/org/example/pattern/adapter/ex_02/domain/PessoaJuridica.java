package org.example.pattern.adapter.ex_02.domain;

import lombok.Getter;

@Getter
public class PessoaJuridica extends Pessoa{

    private String cnpj;


    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

}
