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

    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getCliente() {
        return cliente;
    }
    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
