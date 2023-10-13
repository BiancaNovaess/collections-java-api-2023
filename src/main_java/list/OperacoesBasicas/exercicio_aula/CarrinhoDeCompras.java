package main_java.list.OperacoesBasicas.exercicio_aula;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.carrinho.add(item);
    }

    public void removerItem(String nome){
        List<Item> comprasParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Item i: carrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    comprasParaRemover.add(i);
                }
            }
            carrinho.removeAll(comprasParaRemover);
        }
        else {
            System.out.println("A lista está vazia!");
        }

    }

    public double calcularValorTotal(){
        double valorTotal = 0d;

        if (!carrinho.isEmpty()){
            for (Item item: carrinho) {
                double itemValor = item.getPreco() * item.getQuantidade();
                valorTotal += itemValor;
            }
            return valorTotal;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(this.carrinho);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + carrinho +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Maçã", 2.50, 5);
        carrinhoDeCompras.adicionarItem("Pêssego", 5.50, 10);

        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Maçã");
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();


    }
}
