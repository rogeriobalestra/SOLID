package org.example.pattern.adapter.ex_01.service;

import org.example.pattern.adapter.ex_01.model.Pagamento;

public class PagamentoService {

    private final Pagamento pagamento;

    public PagamentoService (Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void processar(double valor){
        pagamento.pagar(valor);
    }


}
