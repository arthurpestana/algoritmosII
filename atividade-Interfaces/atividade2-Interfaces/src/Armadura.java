public class Armadura {
    private String nome;
    private int defesa;

    public Armadura(String nome, int defesa) {
        this.nome = nome;
        this.defesa = defesa;
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public String toString() {
        return nome + " (Defesa: " + defesa + ")";
    }
}
