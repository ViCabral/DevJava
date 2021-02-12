package br.com.abc.javacore.news;

import br.com.abc.javacore.classes.Professor;

// Criação de dois objetos utilizando uma mesma classe
public class ProfessorTest {
    public static void main(String[] args){
        Professor novo = new Professor();
        novo.nome = "Joao";
        novo.matricula = "154785";
        novo.rg = "8825551";
        System.out.println(novo.nome);

        Professor novo2 = new Professor();
        novo2.nome = "Carlos";
        System.out.println(novo2.nome);
    }
}
