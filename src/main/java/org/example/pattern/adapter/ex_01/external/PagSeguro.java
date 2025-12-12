package org.example.pattern.adapter.ex_01.external;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class PagSeguro {

    public void executarPagamento(double valor) {
        log.info("PagSeguro executou pagamento de {}",  valor);
    }
}