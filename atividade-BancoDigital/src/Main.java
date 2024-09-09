//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco clienteBanco = new Banco("João", 1000);

        System.out.println("Cliente: "+clienteBanco.getTitular());
        System.out.println("Saldo: "+clienteBanco.getSaldo());

        clienteBanco.depositarSaldo(1200);
        System.out.println("Saldo: "+clienteBanco.getSaldo());

        clienteBanco.sacarSaldo(400);
        System.out.println("Saldo: "+clienteBanco.getSaldo());

        clienteBanco.sacarSaldo(3000);
        System.out.println("Saldo: "+clienteBanco.getSaldo());
    }
}