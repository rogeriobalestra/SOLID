package org.example.pattern.adapter_exemplo.external;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class PagSeguro {

    public void executarPagamento(double valor) {
        log.info("PagSeguro executou pagamento de {}",  valor);
    }
}