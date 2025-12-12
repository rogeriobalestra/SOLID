package org.example.pattern.adapter.ex_01.adapter;

import org.example.pattern.adapter.ex_01.external.PagSeguro;
import org.example.pattern.adapter.ex_01.model.Pagamento;

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
