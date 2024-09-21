//Questão 6:

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void addLivros(Livro livro) {
        livros.add(livro);
    }
    public void removeLivro(Livro livro) {
        livros.remove(livro);
    }

    //Questão 7:
    public Livro buscarLivro(String titulo) {
        Livro livroV = null;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livroV = livro;
            }
        }
        return livroV;
    }
}
