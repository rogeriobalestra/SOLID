package org.example.pattern.adapter.ex_01.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PagarMe {
    public void executarPagamento(double valor) {
        log.info("PagarMe executou pagamento de {}",  valor);
    }
}
