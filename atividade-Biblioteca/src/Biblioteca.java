import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Autor> autores;

    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
        this.autores = new ArrayList<Autor>();
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
        System.out.println("Autor adicionado com sucesso!");
    }
    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void addEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
        System.out.println("Emprestimo adicionado com sucesso!");
    }
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public ArrayList<Livro> getLivrosEmprestimos() {
        ArrayList<Livro> livrosEmprestimos = new ArrayList<Livro>();
        for (Livro livro : livros) {
            if (livro.getStatus()) {
                livrosEmprestimos.add(livro);
            }
        }
        return livrosEmprestimos;
    }
}
