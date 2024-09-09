package Ex1;

import java.util.Scanner;

public class Estoque {
    public String nome;
    public double valor;
    public int quantidade;


    public Estoque() {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void mostraEstoque() {

        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Valor do produto: " + this.valor);
        System.out.println("Quantidade do produto: " + this.quantidade);
    }

    public void entradaEstoque(int quantidadeEntrada) {
        this.quantidade += quantidadeEntrada;
        System.out.println("Entrada do produto registrada. Quantidade atual: " + this.quantidade);
    }

    public void saidaEstoque(int quantidadeSaida) {
        if (this.quantidade >= quantidadeSaida) {
            this.quantidade -= quantidadeSaida;
            System.out.println("Saida do produto resgistrada. Quantidade atual: " + this.quantidade);
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }


    }



