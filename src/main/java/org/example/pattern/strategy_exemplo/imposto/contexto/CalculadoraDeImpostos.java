package org.example.pattern.strategy_exemplo.imposto.contexto;


import org.example.pattern.strategy_exemplo.imposto.strategy.ImpostoSrategy;

public class CalculadoraDeImpostos {

    private ImpostoSrategy srategy;

    public void definirStrategy(ImpostoSrategy srategy) {
        this.srategy = srategy;
    }

    public double calcular(double valor){

        if(srategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de imposto definica");
        }

        return srategy.calcular(valor);
    }
}
