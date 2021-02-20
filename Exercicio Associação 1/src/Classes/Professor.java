package Classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(){

    }
    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;

    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public void setSeminario(Seminario[] seminarios){
        this.seminarios = seminarios;
    }

    public String getNome(){
        return this.nome;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }
    public Seminario[] getSeminario(){
        return this.seminarios;
    }

    public void imprime(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Especialidade: " +this.especialidade);
        System.out.println("Seminarios: ");
        for(Seminario i: seminarios){
            System.out.println(i.getTitulo() + " ");
        }
    }
}

