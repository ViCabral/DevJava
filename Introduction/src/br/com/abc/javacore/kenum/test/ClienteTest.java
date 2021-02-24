package br.com.abc.javacore.kenum.test;

import br.com.abc.javacore.kenum.classes.Cliente;
import br.com.abc.javacore.kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(cliente);
    }
}
