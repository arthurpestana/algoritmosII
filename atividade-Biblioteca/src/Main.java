import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca lib = new Biblioteca();

        Usuario user1 = new Usuario("Arthur", "arthur@gmail.com");
        Usuario user2 = new Usuario("Maria", "maria@gmail.com");
        Autor author1 = new Autor("Sergio", "sergio@gmail.com", new Date(1996, 9, 15));
        Livro book1 = new Livro("Harry Potter e a Pedra Filosofal", author1, "Bloomsbury", new Date(2004, 9, 15));
        Livro book2 = new Livro("1984", author1, "Secker & Warburg", new Date(2009, 9, 15));
        Emprestimo loan1 = new Emprestimo(book1, user1, new Date(2024, 9, 15));

        lib.addAutor(author1);
        lib.addLivro(book1);
        lib.addLivro(book2);
        lib.addEmprestimo(loan1);

        System.out.println(lib.getLivrosEmprestimos());
        System.out.println(lib.getEmprestimos());
        System.out.println(lib.getLivros());
        System.out.println(lib.getAutores());
    }
}