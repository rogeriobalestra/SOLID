package org.example.pattern.adapter.ex_02.adapter;

import org.example.pattern.adapter.ex_02.clienteexterno.SistemaPessoaJuridica;
import org.example.pattern.adapter.ex_02.domain.Pessoa;
import org.example.pattern.adapter.ex_02.domain.PessoaJuridica;

public class PessoaJuridicaAdapter implements PessoaAdapter{

    private final SistemaPessoaJuridica pessoaJuridica;

    public PessoaJuridicaAdapter(SistemaPessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }


    @Override
    public void cadastrar(Pessoa pessoa) {
        PessoaJuridica pf = (PessoaJuridica) pessoa;
        pessoaJuridica.registrarCNPJ(pf.getNome(), pf.getCnpj());
    }
}
