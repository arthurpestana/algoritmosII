import java.util.ArrayList;

public class Carrinho {
    private Cliente cliente;
    private ArrayList<Produto> produtos;
    private float valorTotal;
    private int quantProdutos;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<Produto>();
        this.valorTotal = 0;
        this.quantProdutos = 0;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
        this.valorTotal += produto.getPreco();
        this.quantProdutos += 1;
        System.out.println("Produto adicionado com sucesso!");
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void removeProduto(int index) {
        if (index >= 1 && index <= this.produtos.size()) {
            this.valorTotal -= this.produtos.get(index).getPreco();
            this.quantProdutos -= 1;
            this.produtos.remove(index);
            System.out.println("Produto removido com sucesso!");
        }
        else {
            System.out.println("Erro ao remover produto");
        }
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public Integer getQuantProdutos() {
        return this.quantProdutos;
    }

}
