package br.com.abc.javacore.blocoinicializacao.test;

import br.com.abc.javacore.blocoinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente();

        for(int i: c.getParcelas()){
            System.out.println(i+ " ");
        }
    }
}
