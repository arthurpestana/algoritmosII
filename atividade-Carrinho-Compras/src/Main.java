import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matheus");

        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Smartphone", 1200.00);
        Produto produto3 = new Produto("Teclado", 150.00);
        Produto produto4 = new Produto("Monitor", 850.00);
        Produto produto5 = new Produto("Mouse", 75.00);

        Carrinho carrinho = new Carrinho(cliente);
        carrinho.addProduto(produto1);
        carrinho.addProduto(produto4);
        carrinho.addProduto(produto3);
        carrinho.addProduto(produto5);

        float valorTotal = carrinho.getValorTotal();
        System.out.println("\nValor Total: " + valorTotal);

        float quantTotal = carrinho.getQuantProdutos();
        System.out.println("\nQuantidade Total: " + quantTotal);

        ArrayList<Produto> produtos = carrinho.getProdutos();
        System.out.println("\nProdutos: ");
        System.out.println("Index: \t\tNome: \t\tPreço:");
        for (int i=0; i<produtos.size(); i++) {
            System.out.println(i+1 + "\t\t\t"+produtos.get(i).getNome()+"\t\t"+produtos.get(i).getPreco());
        };

        System.out.println("\nRemover o Produto 2");
        carrinho.removeProduto(2-1);
    }
}