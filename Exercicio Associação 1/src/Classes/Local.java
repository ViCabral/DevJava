package Classes;

public class Local {
    private String rua;
    private String bairro;

    public Local(){

    }
    public Local(String rua, String bairro){
        this.rua = rua;
        this.bairro = bairro;
    }

    public void setRua(String rua){
        this.rua = rua;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getRua(){
        return this.rua;
    }
    public String getBairro(){
        return this.bairro;
    }

    public void imprime(){
        System.out.println("Rua: " +this.rua);
        System.out.println("Bairro: " +this.bairro);
    }

}
