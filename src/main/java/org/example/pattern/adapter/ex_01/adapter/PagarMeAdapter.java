package org.example.pattern.adapter.ex_01.adapter;

import org.example.pattern.adapter.ex_01.external.PagarMe;
import org.example.pattern.adapter.ex_01.model.Pagamento;

public class PagarMeAdapter implements Pagamento {

    private final PagarMe pagarMe;

    public PagarMeAdapter(PagarMe pagarMe) {
        this.pagarMe = pagarMe;
    }

    @Override
    public void pagar(double valor) {
        pagarMe.executarPagamento(valor);
    }
}
