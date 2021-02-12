package br.com.abc.javacore.metods.test;

import br.com.abc.javacore.metods.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);
        System.out.println("Foi");
        System.out.println(calc.divideDoisNumeros(20, 2));
    }
}
