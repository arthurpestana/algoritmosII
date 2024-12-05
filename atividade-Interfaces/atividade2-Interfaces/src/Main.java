public class Main {
    public static void main(String[] args) {
        // Criar personagens
        Mago mago = new Mago("Merlin", 100, 50);
        Guerreiro guerreiro = new Guerreiro("Arthur", 150, 20);

        // Criar armas e armaduras
        Arma cajado = new Arma("Cajado Arcano", 30, true);
        Arma espada = new Arma("Espada Longa", 25, false);
        Armadura robe = new Armadura("Robe do Arcanjo", 5);
        Armadura armaduraPesada = new Armadura("Armadura de Aço", 15);

        // Equipar itens
        mago.equiparArma(cajado);
        mago.equiparArmadura(robe);

        guerreiro.equiparArma(espada);
        guerreiro.equiparArmadura(armaduraPesada);

        // Combate
        mago.atacar(guerreiro);
        guerreiro.atacar(mago);
        mago.atacar(guerreiro);
    }
}
