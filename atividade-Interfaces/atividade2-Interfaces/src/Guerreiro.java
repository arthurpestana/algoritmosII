public class Guerreiro extends BasePersonagem {
    public Guerreiro(String nome, int hp, int sp) {
        super(nome, hp, sp);
    }

    @Override
    public void atacar(Personagem alvo) {
        if (arma == null || arma.isDanoMagico()) {
            System.out.println(nome + " não tem uma arma física equipada!");
            return;
        }
        System.out.println(nome + " ataca com sua arma física!");
        alvo.receberDano(arma.getDano());
    }
}

