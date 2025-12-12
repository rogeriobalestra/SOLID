package org.example.pattern.adapter.ex_02.adapter;

import org.example.pattern.adapter.ex_02.clienteexterno.SistemaPessoaFisica;
import org.example.pattern.adapter.ex_02.domain.Pessoa;
import org.example.pattern.adapter.ex_02.domain.PessoaFisica;

public class PessoaFisicaAdapter  implements  PessoaAdapter{

    private final SistemaPessoaFisica sistemaPessoaFisica;

    public PessoaFisicaAdapter(SistemaPessoaFisica sistemaPessoaFisica) {
        this.sistemaPessoaFisica = sistemaPessoaFisica;
    }

    @Override
    public void cadastrar(Pessoa pessoa) {
        PessoaFisica pf = (PessoaFisica) pessoa;
        sistemaPessoaFisica.registrarCPF(pf.getNome(), pf.getCpf());
    }
}
