package org.example.pattern.strategy.ex_02.pagamento.strategy;

import java.math.BigDecimal;

public interface PagamentoStrategy {
    void pagar(BigDecimal value);

}
