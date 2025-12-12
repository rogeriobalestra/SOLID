package org.example.pattern.adapter.ex_01.adapter;

import org.example.pattern.adapter.ex_01.external.GetNet;
import org.example.pattern.adapter.ex_01.model.Pagamento;

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
