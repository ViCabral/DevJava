package br.com.abc.javacore.metods.test;

import br.com.abc.javacore.metods.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args){
        Professor prof = new Professor();

        prof.cpf = "1224544";
        prof.rg = "151554";
        prof.nome = "Joao";
        prof.matricula = "2468546";

        Professor prof2 = new Professor();

        prof2.cpf = "22222";
        prof2.rg = "222222";
        prof2.nome = "Carlos";
        prof2.matricula = "2222222";

        prof.imprime();
        prof.imprime();

        System.out.println(prof.nome);
        System.out.println(prof.cpf);



    }
}
