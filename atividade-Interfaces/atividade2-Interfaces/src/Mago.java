public class Mago extends BasePersonagem {
    public Mago(String nome, int hp, int sp) {
        super(nome, hp, sp);
    }

    @Override
    public void atacar(Personagem alvo) {
        if (arma == null || !arma.isDanoMagico()) {
            System.out.println(nome + " não tem uma arma mágica equipada!");
            return;
        }
        if (sp >= 10) {
            sp -= 10; // Custo de mana
            System.out.println(nome + " lança um feitiço!");
            alvo.receberDano(arma.getDano());
        } else {
            System.out.println(nome + " não tem mana suficiente!");
        }
    }
}
