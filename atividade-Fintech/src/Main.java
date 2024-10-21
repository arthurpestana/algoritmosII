//Faça um aplicativo para uma Fintech que tenha conta
//corrente, conta com limite e uma conta que têm
//rendimento diário.


import conta.*;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Arthur", "000-1", "792309-04");

        ContaCorrente conta_corrente1 = new ContaCorrente(conta, 1000.00);
        conta_corrente1.getSaldoCorrente();
        conta_corrente1.sacarDinheiro(250.00);

        ContaLimite conta_limite1 = new ContaLimite(conta_corrente1, 1000.00);
        conta_limite1.getLimite();
        conta_limite1.gastarCredito(1200);

        ContaRendimento conta_rendimento1 = new ContaRendimento(conta_limite1, 1000.00);
        conta_rendimento1.getPoupanca();
        conta_rendimento1.resgatarPoupanca(24);
    }
}