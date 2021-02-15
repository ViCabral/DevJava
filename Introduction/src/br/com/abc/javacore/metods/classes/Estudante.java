package br.com.abc.javacore.metods.classes;

public class Estudante {
    private String nome;
    private String idade;
    private double notas[];


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(notas != null)
        for(double i: this.notas){
            System.out.print("Nota: "+i +"\n");
        }
    }

    public void media(){
        if(notas == null) return;
        double soma = 0;
        for(double i: this.notas){
            soma += i;
        }
        System.out.println("Média = "+(soma/(this.notas.length)));

        if(((soma/(this.notas.length)) >= 0) && ((soma/(this.notas.length)) <= 10)) {
            if ((soma / (this.notas.length)) >= 5) {
                System.out.println("Aluno Aprovado");
            } else if ((soma / (this.notas.length)) < 5){
                System.out.println("Aluno Reprovado");
            }
        }else System.out.println("Erro com a média");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
    public void setNotas(double [] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }
    public String getIdade(){
        return this.idade;
    }
    public double[] getNotas(){
        return this.notas;
    }
}

