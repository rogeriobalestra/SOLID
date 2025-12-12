package org.example;


import org.example.pattern.strategy.ex_01.imposto.contexto.CalculadoraDeImpostos;
import org.example.pattern.strategy.ex_01.imposto.strategy.impl.ICMS;
import org.example.pattern.strategy.ex_01.imposto.strategy.impl.IPI;
import org.example.pattern.strategy.ex_01.imposto.strategy.impl.ISS;

public class Main_Strategy_01 {
    public static void main(String[] args) {

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
