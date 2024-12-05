public class Cartao implements Pagamento {
    private String numeroCartao;

    public Cartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " com cartão: " + numeroCartao);
        return true;
    }
}

