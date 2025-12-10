package org.example.pattern.adapter_exemplo.adapter;

import org.example.pattern.adapter_exemplo.external.PagarMe;
import org.example.pattern.adapter_exemplo.model.Pagamento;

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
