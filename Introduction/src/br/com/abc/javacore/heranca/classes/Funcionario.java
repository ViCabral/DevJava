package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
        imprimeReciboPagamento();

    }
    public void imprimeReciboPagamento(){
        System.out.println("Eu "+super.nome+" Recebi pagamento de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
