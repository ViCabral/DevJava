package AssociacaoTest;


import Classes.Aluno;
import Classes.Local;
import Classes.Professor;
import Classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("William", "27");
        Aluno aluno2 = new Aluno("Vinicius", "25");
        Seminario sem = new Seminario("Como sobreviver em um curso!");
        Professor prof = new Professor("Yoda", "A força se Deve a isso");
        Local regiao = new Local("Acacias", "Recanto das Rosas");


        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        sem.setProfessor(prof);
        sem.setLocal(regiao);
        sem.setAlunos(new Aluno[] {aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[1] = sem;
        prof.setSeminario(semArray);

        aluno.imprime();
    }
}
