package Ex1;

import java.util.Scanner;

public class Main_estoque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estoque est = new Estoque();

        System.out.printf("Digite o nome do produto: ");
        est.nome = sc.nextLine();

        System.out.printf("Digite o valor do produto: ");
        est.valor = sc.nextDouble();

        System.out.printf("Digite a quantidade do produto: ");
        est.quantidade = sc.nextInt();

        Estoque estoque = new Estoque();
    }
}
