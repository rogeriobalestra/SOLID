package org.example.pattern.strategy.ex_01.imposto.strategy.impl;


import lombok.extern.slf4j.Slf4j;
import org.example.pattern.strategy.ex_01.imposto.strategy.ImpostoSrategy;


@Slf4j
public class IPI implements ImpostoSrategy {

    @Override
    public double calcular(double valorBase) {
        log.info(String.format("O valor do imposto é de R$ %.2f", valorBase * 0.10));
        return valorBase * 0.10;
    }
}
