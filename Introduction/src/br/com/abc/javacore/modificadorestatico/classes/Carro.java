package br.com.abc.javacore.modificadorestatico.classes;

public class Carro {
    // Velocidade limite = 240
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 240;
    
    // independente de qual objeto você altere
    // ao colocar static todos objetos serao alterados
    public Carro(String nome, double velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public Carro(){

    }

    public void imprime(){
        System.out.println("---------------------------------");
        System.out.println(this.nome);
        System.out.println(this.getVelocidadeMax());
    }

    public String getNome(){
        return this.nome;
    }
    public double getVelocidadeMax(){
        return this.velocidadeMax;
    }
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setVelocidadeMax(double velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
