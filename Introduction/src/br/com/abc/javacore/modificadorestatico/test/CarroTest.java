package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Palio", 300);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        Carro.setVelocidadeLimite(220);
        System.out.println(Carro.getVelocidadeLimite());
        // portanto é necessário alterar direto na classe
        // ao invés de colocar por exemplo
        // c1.setVelocidadeLimite(220);
    }
}
