package br.com.abc.javacore.metods.test;

import br.com.abc.javacore.metods.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        Estudante aluno = new Estudante();

        aluno.setNome("Pedro");
        aluno.setIdade("12");
        aluno.setNotas(new double[] {5, 7, 10});
        //aluno.nome = "Pedro";
        //aluno.idade = "12";
        //aluno.notas = new double[] {5, 7, 10};

        aluno.imprime();
        aluno.media();
        System.out.println(aluno.getNome());
        System.out.println(aluno.isAprovado());

    }
}
