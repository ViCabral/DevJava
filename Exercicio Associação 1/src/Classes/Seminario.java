package Classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(){

    }
    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public void setLocal(Local local){
        this.local = local;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public Aluno[] getAlunos(){
        return this.alunos;
    }
    public Professor getProfessor(){
        return this.professor;
    }
    public Local getLocal(){
        return this.local;
    }

    public void imprime(){
        System.out.println(this.titulo);
        for(Aluno i: alunos){

        }
    }
}
