public class Banco {
    private String nome;
    private int saldo;

    public Banco(String nome, int saldo) {
        this.nome = nome;
        this.saldo = saldo;
        System.out.println("Cliente do Banco criado com sucesso!");
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return nome;
    }

    public void setTitular(String titular) {
        this.nome = titular;
    }

    public void depositarSaldo(int valor) {
        this.saldo += valor;
        System.out.println("Saldo atualizado com sucesso!");
    }

    public void sacarSaldo(int valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente!");
        }
        else {
            this.saldo -= valor;
            System.out.println("Saldo sacado com sucesso!");
        }
    }
}
