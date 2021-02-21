package br.com.abc.javacore.Isobreescrita.classes;

public class Pessoa {
    private String nome;
    private String cpf;

    private static final double VELOCIDADE_FINAL = 250;
    private String carro;
    private String marca;

    @Override
    public String toString() {
        return "Pessoa{" +
                "carro='" + carro + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //Sobreescrita da classe vinda de Object
    // Todas classes henrdam extends Object
    public String getNome() {
        return nome;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
