package org.example;

import org.example.pattern.strategy_exemplo.imposto.contexto.CalculadoraDeImpostos;
import org.example.pattern.strategy_exemplo.imposto.strategy.impl.ICMS;
import org.example.pattern.strategy_exemplo.imposto.strategy.impl.IPI;
import org.example.pattern.strategy_exemplo.imposto.strategy.impl.ISS;
import org.example.pattern.strategy_exemplo.pagamento.contexto.CarrinhoDeCompras;
import org.example.pattern.strategy_exemplo.pagamento.strategy.impl.PagamentoBoleto;
import org.example.pattern.strategy_exemplo.pagamento.strategy.impl.PagamentoCartaoCredito;
import org.example.pattern.strategy_exemplo.pagamento.strategy.impl.PagamentoPix;

import java.math.BigDecimal;


public class Main_Strategy {
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



        //Testando calculadora de impostos ...........................
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        calculadoraDeImpostos.definirStrategy(new ICMS());
        calculadoraDeImpostos.calcular(200);

        calculadoraDeImpostos.definirStrategy(new IPI());
        calculadoraDeImpostos.calcular(100);

        calculadoraDeImpostos.definirStrategy(new ISS());
        calculadoraDeImpostos.calcular(300);
    }
}