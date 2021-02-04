import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        System.out.println("Digite o Salario");
        Scanner input = new Scanner(System.in);
        int salario = input.nextInt();  // Create a Scanner object

        String imposto;

        imposto = (salario < 1000) ? "5%": (salario >= 1000 && salario < 2000) ? "10%" : (salario >= 2000 && salario < 4000) ? "15%" :  (salario > 4000) ? "20%": "Erro";
        System.out.println("Imposto: "+imposto);


    }
}
