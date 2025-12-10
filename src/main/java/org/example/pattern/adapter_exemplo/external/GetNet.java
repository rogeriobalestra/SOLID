package org.example.pattern.adapter_exemplo.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetNet {
    public void executarPagamento(double valor) {
        log.info("GetNet executou pagamento de {}",  valor);
    }

}
