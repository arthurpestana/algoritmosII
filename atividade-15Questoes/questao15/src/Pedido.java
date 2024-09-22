import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private double valor;
    private String endereco;
    private LocalDateTime dataPedido;

    public Pedido (Cliente cliente, Produto produto, int quantidade, String endereco) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.endereco = endereco;
        this.dataPedido = LocalDateTime.now();
        this.valor = produto.getPreco()*quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
