package org.example.pattern.adapter_exemplo.adapter;

import org.example.pattern.adapter_exemplo.external.PagSeguro;
import org.example.pattern.adapter_exemplo.model.Pagamento;

public class PagSeguroAdapter implements Pagamento {

    private final PagSeguro pagSeguro;

    public PagSeguroAdapter(PagSeguro pagSeguro) {
        this.pagSeguro = pagSeguro;
    }

    @Override
    public void pagar(double valor) {
        pagSeguro.executarPagamento(valor);
    }
}
