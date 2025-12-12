package org.example;

import org.example.pattern.adapter.ex_01.adapter.GetNetAdapter;
import org.example.pattern.adapter.ex_01.adapter.PagSeguroAdapter;
import org.example.pattern.adapter.ex_01.adapter.PagarMeAdapter;
import org.example.pattern.adapter.ex_01.external.GetNet;
import org.example.pattern.adapter.ex_01.external.PagSeguro;
import org.example.pattern.adapter.ex_01.external.PagarMe;
import org.example.pattern.adapter.ex_01.service.PagamentoService;

public class Main_Adapter_01 {
    public static void main(String[] args) {

        PagSeguro pagSeguro = new PagSeguro();
        PagSeguroAdapter adapter1 = new PagSeguroAdapter(pagSeguro);
        PagamentoService service1 = new PagamentoService(adapter1);
        service1.processar(150);

        GetNet getNet = new GetNet();
        GetNetAdapter adapter2 = new GetNetAdapter(getNet);
        PagamentoService service2 = new PagamentoService(adapter2);
        service2.processar(200);

        PagarMe pagarMe = new PagarMe();
        PagarMeAdapter adapter3 = new PagarMeAdapter(pagarMe);
        PagamentoService service3 = new PagamentoService(adapter3);
        service3.processar(250);

    }
}
