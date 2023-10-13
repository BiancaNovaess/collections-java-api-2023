package main_java.list.ordenacao.exercicios_aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(numerosList);

        if(!numerosList.isEmpty()){
            Collections.sort(numerosDescendentes, Collections.reverseOrder());
            return numerosDescendentes;
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros= new OrdenacaoNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(-50);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(300);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(200);
        numeros.adicionarNumero(58);

        System.out.println("Ordem ascendente:\n" + numeros.ordenarAscendente());
        System.out.println("Ordem descendente:\n" + numeros.ordenarDescendente());
    }

}
