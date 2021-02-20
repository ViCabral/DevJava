package Classes;

public class Aluno {
    private String nome;
    private String idade;
    private Seminario seminario;


    public Aluno(){

    }
    public Aluno(String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    public String getNome(){
        return this.nome;
    }
    public String getIdade(){
        return this.idade;
    }
    public Seminario getSeminario(){
        return this.seminario;
    }

    public void imprime(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        if(this.seminario != null)
            System.out.println("Seminario: " +this.seminario.getTitulo());
        else System.out.println("Nenhum seminario cadastrado!");
    }
}
