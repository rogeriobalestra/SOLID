package org.example.pattern.strategy_exemplo.pagamento.strategy;

import java.math.BigDecimal;

public interface PagamentoStrategy {
    void pagar(BigDecimal value);

}
