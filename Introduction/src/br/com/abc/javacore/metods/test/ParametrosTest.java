package br.com.abc.javacore.metods.test;
import br.com.abc.javacore.metods.classes.Calculadora;

public class ParametrosTest {
    public static void main (String[] args){
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        // Função envia uma cópia e não altera o valor original

    }
}
