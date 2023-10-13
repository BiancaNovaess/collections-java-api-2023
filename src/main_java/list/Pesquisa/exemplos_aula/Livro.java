package main_java.list.Pesquisa.exemplos_aula;

public class Livro {
    private String titulo, autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //Para não aparecer o caminho da memória e, sim, os itens da lista:

    @Override
    public String toString() {
        return "título= " + titulo + '\n' + "autor= " + autor + '\n' +"anoPublicação= " + anoPublicacao + "\n \n";
    }
}
