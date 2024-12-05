public abstract class BasePersonagem implements Personagem {
    protected String nome;
    protected int hp; // Vida
    protected int sp; // Mana
    protected Arma arma;
    protected Armadura armadura;

    public BasePersonagem(String nome, int hp, int sp) {
        this.nome = nome;
        this.hp = hp;
        this.sp = sp;
    }

    @Override
    public void receberDano(int dano) {
        int danoFinal = Math.max(dano - (armadura != null ? armadura.getDefesa() : 0), 0);
        hp = Math.max(hp - danoFinal, 0);
        System.out.println(nome + " recebeu " + danoFinal + " de dano. HP restante: " + hp);
    }

    @Override
    public void equiparArma(Arma arma) {
        this.arma = arma;
        System.out.println(nome + " equipou: " + arma);
    }

    @Override
    public void equiparArmadura(Armadura armadura) {
        this.armadura = armadura;
        System.out.println(nome + " equipou: " + armadura);
    }

    public boolean estaVivo() {
        return hp > 0;
    }

    @Override
    public abstract void atacar(Personagem alvo); // Definido pelas subclasses
}
