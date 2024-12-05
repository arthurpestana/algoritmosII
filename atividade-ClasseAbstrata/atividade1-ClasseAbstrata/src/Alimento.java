import java.time.LocalDate;

public class Alimento extends Item {
    private LocalDate validade;

    public Alimento(String nome, double preco, LocalDate validade) {
        super(nome, preco);
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    @Override
    public boolean estaValido() {
        return LocalDate.now().isBefore(validade);
    }

    @Override
    public String toString() {
        return nome + " (R$" + preco + ") - Validade: " + validade;
    }
}
