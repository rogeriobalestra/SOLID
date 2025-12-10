package org.example.pattern.strategy_exemplo.pagamento.strategy.impl;



import lombok.extern.slf4j.Slf4j;
import org.example.pattern.strategy_exemplo.pagamento.strategy.PagamentoStrategy;

import java.math.BigDecimal;
import java.util.logging.Logger;

@Slf4j
public class PagamentoBoleto implements PagamentoStrategy {

    @Override
    public void pagar(BigDecimal value) {
        log.info(String.format("Pagamento de  R$ %.2f realizado via boleto", value));
    }
}
