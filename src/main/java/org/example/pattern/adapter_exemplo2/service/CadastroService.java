package org.example.pattern.adapter_exemplo2.service;


import org.example.pattern.adapter_exemplo2.adapter.PessoaAdapter;
import org.example.pattern.adapter_exemplo2.domain.Pessoa;

public class CadastroService {

    private PessoaAdapter adapter;

    public CadastroService(PessoaAdapter adapter) {
        this.adapter = adapter;
    }

    public void cadastrar(Pessoa pessoa){
        adapter.cadastrar(pessoa);
    }

}
