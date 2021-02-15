package br.com.abc.javacore.sobrecargaconstructor.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;

    public Estudante(String matricula, String nome, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }
    public Estudante(){

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double i: this.notas){
            System.out.println("Nota: " +i);
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
