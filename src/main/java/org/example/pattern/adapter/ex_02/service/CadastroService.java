package org.example.pattern.adapter.ex_02.service;


import org.example.pattern.adapter.ex_02.adapter.PessoaAdapter;
import org.example.pattern.adapter.ex_02.domain.Pessoa;

public class CadastroService {

    private PessoaAdapter adapter;

    public CadastroService(PessoaAdapter adapter) {
        this.adapter = adapter;
    }

    public void cadastrar(Pessoa pessoa){
        adapter.cadastrar(pessoa);
    }

}
