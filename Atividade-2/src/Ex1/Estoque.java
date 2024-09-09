package Ex1;

import java.util.Scanner;

public class Estoque {
    public String nome;
    public double valor;
    public int quant;


    public Estoque() {
        this.nome = nome;
        this.valor = valor;
        this.quant = quant;
    }

    public void mostraEstoque() {

        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Valor do produto: " + this.valor);
        System.out.println("Quantidade do produto: " + this.quant);
    }

    public void entradaEstoque(int quantidadeEntrada) {
        this.quant += quantidadeEntrada;
        System.out.println("Entrada do produto registrada. Quantidade atual: " + this.quant);
    }

    public void saidaEstoque(int quantidadeSaida) {
        if (this.quant >= quantidadeSaida) {
            this.quant -= quantidadeSaida;
            System.out.println("Saida do produto resgistrada. Quantidade atual: " + this.quant);
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }


    }



