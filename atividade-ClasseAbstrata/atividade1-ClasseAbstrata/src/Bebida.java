public class Bebida extends Item {
    private int idadeMinima;

    public Bebida(String nome, double preco) {
        super(nome, preco);
        this.idadeMinima = 18;
    }

    @Override
    public boolean estaValido() {
        return true;
    }

    public boolean podeSerVendidaPara(int idadeCliente) {
        return idadeCliente >= idadeMinima;
    }

    @Override
    public String toString() {
        return nome + " (R$" + preco + ") - Apenas para maiores de " + idadeMinima + " anos.";
    }
}

