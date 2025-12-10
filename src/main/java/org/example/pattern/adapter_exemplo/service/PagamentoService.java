package org.example.pattern.adapter_exemplo.service;

import org.example.pattern.adapter_exemplo.model.Pagamento;

public class PagamentoService {

    private final Pagamento pagamento;

    public PagamentoService (Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void processar(double valor){
        pagamento.pagar(valor);
    }


}
