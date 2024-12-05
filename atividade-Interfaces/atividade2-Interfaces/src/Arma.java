public class Arma {
    private String nome;
    private int dano;
    private boolean danoMagico;

    public Arma(String nome, int dano, boolean danoMagico) {
        this.nome = nome;
        this.dano = dano;
        this.danoMagico = danoMagico;
    }

    public int getDano() {
        return dano;
    }

    public boolean isDanoMagico() {
        return danoMagico;
    }

    @Override
    public String toString() {
        return nome + " (Dano: " + dano + ", Mágico: " + danoMagico + ")";
    }
}
