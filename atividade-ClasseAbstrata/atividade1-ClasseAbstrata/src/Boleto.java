public class Boleto implements Pagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$" + valor);
        return true;
    }
}
