package main_java.list.Ordenacao.exemplos_aula;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorALtura(){
        List<Pessoa> pessoasOrdemAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdemAltura, new ComparatorPorAltura());
        return pessoasOrdemAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.adicionarPessoa("Bianca", 19, 1.60);
        pessoas.adicionarPessoa("Maria", 18, 1.60);
        pessoas.adicionarPessoa("Marcos", 16, 1.60);
        pessoas.adicionarPessoa("Maxon", 18, 1.57);
        pessoas.adicionarPessoa("Júlia", 38, 1.68);
        pessoas.adicionarPessoa("Bruno", 50, 1.70);
        pessoas.adicionarPessoa("Pérola", 20, 1.58);

        System.out.println("ORDENANDO POR IDADE\n" + pessoas.ordenarPorIdade());
        System.out.println("ORDENANDO POR ALTURA\n" + pessoas.ordenarPorALtura());
    }


}
