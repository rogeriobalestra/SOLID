package org.example.pattern.strategy_exemplo.imposto.contexto;


import org.example.pattern.strategy_exemplo.imposto.strategy.ImpostoSrategy;

public class CalculadoraDeImpostos {

    private ImpostoSrategy strategy;

    public void definirStrategy(ImpostoSrategy srategy) {
        this.strategy = srategy;
    }

    public double calcular(double valor){

        if(strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de imposto definica");
        }

        return strategy.calcular(valor);
    }
}
