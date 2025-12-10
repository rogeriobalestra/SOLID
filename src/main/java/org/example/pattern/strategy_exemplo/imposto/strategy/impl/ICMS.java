package org.example.pattern.strategy_exemplo.imposto.strategy.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.pattern.strategy_exemplo.imposto.strategy.ImpostoSrategy;


@Slf4j
public class ICMS implements ImpostoSrategy {

    @Override
    public double calcular(double valorBase) {
        log.info(String.format("O valor do imposto é de R$ %.2f", valorBase * 0.18));
        return valorBase * 0.18;
    }
}
