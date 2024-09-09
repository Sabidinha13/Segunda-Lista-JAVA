package Ex2;
import java.util.Scanner;

public class MainSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o salario: ");
        double salario = sc.nextDouble();

        Salario salarioFuncionario = new Salario(nome, salario);
        System.out.println(salarioFuncionario);

        salarioFuncionario.aumentoSalario();

        sc.close();
    }
}
