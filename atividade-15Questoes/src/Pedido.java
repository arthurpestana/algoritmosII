//Questão 8:
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Integer numero;
    private Date data;
    private ArrayList<Produto> produtos;
    //Questão 9:
    private Cliente cliente;

    public Pedido(Integer numero, Date data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
        //Questão 9:
        this.cliente = cliente;
    }

    public void addProdutos(Produto produto) {
        produtos.add(produto);
    }
    public Double calcTotal() {
        Double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return total;
    }
}
