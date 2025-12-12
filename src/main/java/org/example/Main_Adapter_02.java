package org.example;


import org.example.pattern.adapter.ex_02.adapter.PessoaFisicaAdapter;
import org.example.pattern.adapter.ex_02.adapter.PessoaJuridicaAdapter;
import org.example.pattern.adapter.ex_02.clienteexterno.SistemaPessoaFisica;
import org.example.pattern.adapter.ex_02.clienteexterno.SistemaPessoaJuridica;
import org.example.pattern.adapter.ex_02.domain.Pessoa;
import org.example.pattern.adapter.ex_02.domain.PessoaFisica;
import org.example.pattern.adapter.ex_02.domain.PessoaJuridica;
import org.example.pattern.adapter.ex_02.service.CadastroService;

public class Main_Adapter_02 {
    public static void main(String[] args) {

        var sistemaPF = new SistemaPessoaFisica();
        var sistemaPJ = new SistemaPessoaJuridica();

        Pessoa pf = new PessoaFisica("Joao","26128233344");
        Pessoa pj = new PessoaJuridica("Construtora Ficticia","88822222/0001-55");


        CadastroService cadastroPF = new CadastroService(new PessoaFisicaAdapter(sistemaPF));
        CadastroService cadastroPJ = new CadastroService(new PessoaJuridicaAdapter(sistemaPJ));

        cadastroPF.cadastrar(pf);
        cadastroPJ.cadastrar(pj);


    }

}
