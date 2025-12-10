package org.example.pattern.strategy_exemplo.pagamento.contexto;


import java.math.BigDecimal;


import org.example.pattern.strategy_exemplo.pagamento.strategy.PagamentoStrategy;

public class CarrinhoDeCompras {

    private PagamentoStrategy strategy;

    public void setPagamentoStrategy(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void finalizarPagamento(BigDecimal value) {
        if(strategy == null) {
            throw  new IllegalStateException("Nenhuma estrategia de pagamento definida!");
        }
        strategy.pagar(value);
    }

}
