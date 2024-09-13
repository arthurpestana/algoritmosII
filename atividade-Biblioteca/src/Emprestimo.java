import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Usuario cliente;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Usuario cliente, Date dataDevolucao) {
        this.livro = livro;
        this.cliente = cliente;
        this.dataDevolucao = dataDevolucao;
        this.livro.setStatus(true);
    }

    public String getLivrosEmprestados() {
        if (this.livro.getStatus()) {
            return livro.getTitulo();
        }
        return null;
    }
}
