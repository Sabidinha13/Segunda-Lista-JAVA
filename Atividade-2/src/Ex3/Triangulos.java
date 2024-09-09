package Ex3;

public class Triangulos {
    double x1, x2, x3;
    double y1, y2, y3;

    public Triangulos(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public void areaTriangulos() {
        double semiPerimetro;
        double areaX, areaY;
        double raizQuadradaX = 0.0, raizQuadradaY = 0.0;

        semiPerimetro = (x1 + x2 + x3) / 2;
        areaX = semiPerimetro * (semiPerimetro - x1) * (semiPerimetro - x2) * (semiPerimetro - x3);
        if (areaX <= 0){
            System.out.println("Nao eh possivel calcular a raiz quadrada de um numero negativo.");
        } else {
            raizQuadradaX = Math.sqrt(areaX);
        }

        semiPerimetro = (y1 + y2 + y3) / 2;
        areaY = semiPerimetro * (semiPerimetro - y1) * (semiPerimetro - y2) * (semiPerimetro - y3);
        if (areaY <= 0){
            System.out.println("Nao eh possivel calcular a raiz quadrada de um numero negativo.");
        } else {
            raizQuadradaY = Math.sqrt(areaY);
        }

        System.out.println("A area do triangulo X eh:" + raizQuadradaX);
        System.out.println("A area do triangulo Y eh: " + raizQuadradaY);

        if (areaX > areaY){
            System.out.println("A area do triangulo X eh maior que a area do triangulo Y.");
        } else if (areaX < areaY){
            System.out.println("A area do triangulo Y eh maior que a area do triangulo X.");
        }
    }

}
