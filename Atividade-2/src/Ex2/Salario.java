package Ex2;

import java.text.DecimalFormat;

public class Salario {
    String nome;
    double salario;

    DecimalFormat df = new DecimalFormat("0.00");

    public Salario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentoSalario() {

        double novoSalario;
        double valAumento;

        if (salario >= 1 && salario <= 1000){
        valAumento = salario * 15/100;
        } else if (salario >= 1001 && salario <=1500){
            valAumento = salario * 10/100;
        } else if (salario >= 1501 && salario <= 2000){
            valAumento = salario * 5/100;
        } else {
            System.out.println("O salario esta fora dos intervalos definidos para aumento.");
            return;
        }

        novoSalario = salario + valAumento;
        System.out.println("Seu nome eh: " + nome);
        System.out.println("Salario original: R$" + df.format (salario));
        System.out.println("Valor do aumento: R$" + df.format (valAumento));
        System.out.println("Novo salario: R$" + df.format (novoSalario));
    }

}