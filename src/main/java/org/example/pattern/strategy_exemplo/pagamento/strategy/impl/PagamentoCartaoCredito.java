package org.example.pattern.strategy_exemplo.pagamento.strategy.impl;


import lombok.extern.slf4j.Slf4j;
import org.example.pattern.strategy_exemplo.pagamento.strategy.PagamentoStrategy;

import java.math.BigDecimal;


@Slf4j
public class PagamentoCartaoCredito implements PagamentoStrategy {

    @Override
    public void pagar(BigDecimal value) {
        log.info(String.format("Pagamento de  R$ %.2f realizado via Cartão de Crédito", value));
    }
}
