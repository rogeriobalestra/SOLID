package org.example.pattern.adapter_exemplo.adapter;

import org.example.pattern.adapter_exemplo.external.GetNet;
import org.example.pattern.adapter_exemplo.model.Pagamento;

public class GetNetAdapter implements Pagamento {

    private final GetNet getNet;

    public GetNetAdapter(GetNet getNet) {
        this.getNet = getNet;
    }

    @Override
    public void pagar(double valor) {
        getNet.executarPagamento(valor);
    }
}
