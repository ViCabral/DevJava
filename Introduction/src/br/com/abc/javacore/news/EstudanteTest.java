package br.com.abc.javacore.news;

import br.com.abc.javacore.classes.Estudante;

public class EstudanteTest {
    public static void main (String[] args){
        Estudante joao = new Estudante();
        joao.nome = "joao";
        joao.matricula = "15";
        joao.idade = 10;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);

    }
}
