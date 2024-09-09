package Ex3;

import java.util.Scanner;

public class MainTriangulos {
    public static void main(String[] args) {
        double x1, x2, x3;
        double y1, y2, y3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as medidas de cado lado do triangulo X: ");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        x3 = sc.nextInt();

        System.out.println("Digite as medidas de cado lado do triangulo Y: ");
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        y3 = sc.nextInt();

        Triangulos trianguloArea = new Triangulos(x1, x2, x3, y1, y2, y3);
         System.out.println(trianguloArea);

         trianguloArea.areaTriangulos();
         sc.close();
    }
}
