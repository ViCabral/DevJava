package br.com.abc.javacore.classesintro.test;

import br.com.abc.javacore.classesintro.classes.Carro;

public class CarroTest {
    public static void main(String[] args){
        Carro vectra = new Carro();
        vectra.placa = "ABCDEF";
        vectra.modelo = "Renault";
        vectra.velocidadeMaxima = 155;

        System.out.println(vectra.placa);
    }
}
