import java.util.Date;

//Questão 5:
public class Livro {
    private String titulo;
    private String autor;
    private Date anoPublicacao;

    public Livro(String titulo, String autor, Date anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicacao: " + this.anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }
}
