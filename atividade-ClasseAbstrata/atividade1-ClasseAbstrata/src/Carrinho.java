import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens;
    private int idadeCliente;

    public Carrinho(int idadeCliente) {
        this.itens = new ArrayList<>();
        this.idadeCliente = idadeCliente;
    }

    public boolean adicionarItem(Item item) {
        if (item instanceof Alimento && !item.estaValido()) {
            System.out.println("Erro: O alimento '" + item.getNome() + "' está vencido e não pode ser adicionado.");
            return false;
        }
        if (item instanceof Bebida && !((Bebida) item).podeSerVendidaPara(idadeCliente)) {
            System.out.println("Erro: A bebida '" + item.getNome() + "' não pode ser vendida para menores de 18 anos.");
            return false;
        }
        itens.add(item);
        System.out.println("Item '" + item.getNome() + "' adicionado ao carrinho.");
        return true;
    }

    public void exibirItens() {
        System.out.println("\nItens no carrinho:");
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }
}
