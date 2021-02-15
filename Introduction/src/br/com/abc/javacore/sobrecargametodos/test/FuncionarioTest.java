package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("William");

        /*funcionario.setNome("Vinicius L");
        funcionario.setCpf("123456789");
        funcionario.setSalario(2500);
        */

        funcionario.init("Vinicius L", "12345678", 2500, "524584");
        funcionario.imprime();

    }
}
