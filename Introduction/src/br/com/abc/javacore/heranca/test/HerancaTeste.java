package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João");
        p.setCpf("148525");

        Endereco end = new Endereco();
        end.setBairro("Recanto d");
        end.setRua("Mario Quin");

        p.setEndereco(end);
        //p.imprime();

        Funcionario f = new Funcionario(p.getNome());
        f.setNome("Pedro");
        f.setCpf("15745");
        f.setEndereco(end);
        f.setSalario(15774);
        f.imprime();
    }
}
