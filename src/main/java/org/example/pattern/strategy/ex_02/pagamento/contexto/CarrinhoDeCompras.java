package org.example.pattern.strategy.ex_02.pagamento.contexto;


import java.math.BigDecimal;


import org.example.pattern.strategy.ex_02.pagamento.strategy.PagamentoStrategy;

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
