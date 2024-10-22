/*Faça um programa para um jogo de RPG onde um
personagem poderá escolher entre as classes: Mago,
Guerreiro, Sacerdote e Ladrão. O Mago poderá castar
magias arcanas. O sacerdote fazer milagres (magias
divinas). O ladrão poderá ficar invisível. E o guerreiro
poderá usar armaduras pesadas. Todos possuem HP
(vida) e SP (alma)*/

import personagem.*;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Arthur", 100, 100);
        Mago mago = new Mago(personagem);
        Ladino ladino = new Ladino(personagem);
        Guerreiro guerreiro = new Guerreiro(personagem);
        Sacerdote sacerdote = new Sacerdote(personagem);

        mago.castMagiaArcana();
        ladino.usarInvisibilidade();
        guerreiro.equiparArmaduraPesada();
        sacerdote.castMilagre();
    }
}