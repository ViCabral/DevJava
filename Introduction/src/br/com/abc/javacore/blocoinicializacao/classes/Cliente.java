package br.com.abc.javacore.blocoinicializacao.classes;

public class Cliente {

    /* 1- é Alocado espaço na memorai para o objeto que será
     Criado
     2- Cada atributo de classe é criado e inicializado com seus
     Valores default ou definido explicitamente
     3- Bloco de inicialização é executado
     4- O construtor é executado*/

    private int[] parcelas;

    {
        parcelas = new int[100];
        for(int i=1; i<=100 ; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
    }

    public int[] getParcelas(){
        return this.parcelas;
    }
    public void setParcelas(int[] parcelas){
        this.parcelas = parcelas;
    }
}
