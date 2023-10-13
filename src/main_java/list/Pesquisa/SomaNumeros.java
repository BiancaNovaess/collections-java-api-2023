package main_java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        if(!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                soma += numero;
            }
            return soma;
        }
        else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public int encontrarMaiorNumero(){
        int numeroMaior = Integer.MIN_VALUE;

        if (!numeroList.isEmpty()){
            for (Integer numero : numeroList) {
                if(numeroMaior <= numero) {
                    numeroMaior = numero;
                }
            }
            return numeroMaior;
        }
        else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int numeroMenor = Integer.MAX_VALUE;
        
        if (!numeroList.isEmpty()){
            for (Integer numero: numeroList) {
                if (numero<= numeroMenor){
                    numeroMenor = numero;
                }
            }
            return numeroMenor;
        }
        else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirNumeros(){
        System.out.println(this.numeroList);
    }

    public static void main(String[] args) {
        SomaNumeros listaDeNumeros = new SomaNumeros();

        //TESTANDO OS MÉTODOS
        listaDeNumeros.adicionarNumero(5);
        listaDeNumeros.adicionarNumero(2);
        listaDeNumeros.adicionarNumero(2);
        listaDeNumeros.adicionarNumero(6);
        listaDeNumeros.adicionarNumero(3);
        listaDeNumeros.adicionarNumero(16);

        listaDeNumeros.exibirNumeros();

        System.out.println(listaDeNumeros.calcularSoma());

        System.out.println(listaDeNumeros.encontrarMaiorNumero());
        System.out.println(listaDeNumeros.encontrarMenorNumero());
    }
}

