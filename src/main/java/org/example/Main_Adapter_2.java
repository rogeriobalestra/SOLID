package org.example;


import org.example.pattern.adapter_exemplo2.adapter.PessoaFisicaAdapter;
import org.example.pattern.adapter_exemplo2.adapter.PessoaJuridicaAdapter;
import org.example.pattern.adapter_exemplo2.clienteexterno.SistemaPessoaFisica;
import org.example.pattern.adapter_exemplo2.clienteexterno.SistemaPessoaJuridica;
import org.example.pattern.adapter_exemplo2.domain.Pessoa;
import org.example.pattern.adapter_exemplo2.domain.PessoaFisica;
import org.example.pattern.adapter_exemplo2.domain.PessoaJuridica;
import org.example.pattern.adapter_exemplo2.service.CadastroService;

public class Main_Adapter_2 {
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
