public class OutroItem extends Item {
    public OutroItem(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public boolean estaValido() {
        return true;
    }

    @Override
    public String toString() {
        return nome + " (R$" + preco + ")";
    }
}
