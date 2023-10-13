package main_java.list.Pesquisa.exemplos_aula;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> livroLista;

    public CatalogoLivros() {
        this.livroLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livroLista.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroLista.isEmpty()) {
            for (Livro l : livroLista) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();


        if(!livroLista.isEmpty()) {
            for (Livro l : livroLista) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorAno.add(l);
                }
            }
            return livrosPorAno;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }


    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        if(!livroLista.isEmpty()) {
            for (Livro l : livroLista) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = l;
                    break;
                }
            }
        }

        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("A Seleção", "Kiera Cass", 2012);
        catalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogo.adicionarLivro("A Escolha", "Kiera Cass", 2014);
        catalogo.adicionarLivro("Código Limpo", "Robert Cecil Martin", 2008);
        catalogo.adicionarLivro("A Escolha", "Autor x", 1498);

        System.out.println("PESQUISA POR AUTOR\n " + catalogo.pesquisarPorAutor("Kiera Cass") + "\n");
        System.out.println("PESQUISA POR TÍTULO\n " + catalogo.pesquisarPorTitulo("A Escolha") + "\n");
        System.out.println("PESQUISA POR INTERVALO DE ANOS\n " + catalogo.pesquisarPorIntervaloAnos(1900, 2012));
    }
}
