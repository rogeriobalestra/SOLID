package org.example;

import org.example.pattern.adapter_exemplo.adapter.GetNetAdapter;
import org.example.pattern.adapter_exemplo.adapter.PagSeguroAdapter;
import org.example.pattern.adapter_exemplo.adapter.PagarMeAdapter;
import org.example.pattern.adapter_exemplo.external.GetNet;
import org.example.pattern.adapter_exemplo.external.PagSeguro;
import org.example.pattern.adapter_exemplo.external.PagarMe;
import org.example.pattern.adapter_exemplo.service.PagamentoService;

public class Main_Adapter {
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
