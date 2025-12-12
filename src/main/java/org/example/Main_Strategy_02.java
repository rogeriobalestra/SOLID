package org.example;

import org.example.pattern.strategy.ex_02.pagamento.contexto.CarrinhoDeCompras;
import org.example.pattern.strategy.ex_02.pagamento.strategy.impl.PagamentoBoleto;
import org.example.pattern.strategy.ex_02.pagamento.strategy.impl.PagamentoCartaoCredito;
import org.example.pattern.strategy.ex_02.pagamento.strategy.impl.PagamentoPix;

import java.math.BigDecimal;


public class Main_Strategy_02 {
    public static void main(String[] args) {

        //Testando Pagamentos ............................
        CarrinhoDeCompras context = new CarrinhoDeCompras();

        // Usando PIX
        context.setPagamentoStrategy(new PagamentoPix());
        context.finalizarPagamento(new BigDecimal("150"));

        // Usando Cartão de Crédito
        context.setPagamentoStrategy(new PagamentoCartaoCredito());
        context.finalizarPagamento(new BigDecimal("100"));

        // Usando Boleto
        context.setPagamentoStrategy(new PagamentoBoleto());
        context.finalizarPagamento(new BigDecimal("95.00"));



    }
}