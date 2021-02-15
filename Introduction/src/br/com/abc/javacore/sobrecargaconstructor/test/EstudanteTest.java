package br.com.abc.javacore.sobrecargaconstructor.test;

import br.com.abc.javacore.sobrecargaconstructor.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("123456","Carlos", new double[]{5, 7, 8});
        est.imprime();
    }
}
