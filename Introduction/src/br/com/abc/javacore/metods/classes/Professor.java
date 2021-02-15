package br.com.abc.javacore.metods.classes;

// Exercicio aula 25, Introdução a classes
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }
}
