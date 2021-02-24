package br.com.abc.javacore.kenum.classes;

public enum TipoCliente {
    PESSOA_FISICA(1), PESSOA_JURIDICA(2);
    private int tipo;

    TipoCliente(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
