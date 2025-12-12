package org.example.pattern.adapter_exemplo2.adapter;

import org.example.pattern.adapter_exemplo2.clienteexterno.SistemaPessoaFisica;
import org.example.pattern.adapter_exemplo2.domain.Pessoa;
import org.example.pattern.adapter_exemplo2.domain.PessoaFisica;

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
