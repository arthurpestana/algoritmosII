import java.util.List;

public class Caixa {
    private List<Notificador> notificadores;

    public Caixa(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void processarPagamento(Pagamento pagamento, double valor) {
        if (pagamento.processarPagamento(valor)) {
            String mensagem = "Pagamento de R$" + valor + " realizado com sucesso.";
            notificarCliente(mensagem);
        } else {
            System.out.println("Erro ao processar o pagamento.");
        }
    }

    private void notificarCliente(String mensagem) {
        for (Notificador notificador : notificadores) {
            notificador.enviarNotificacao(mensagem);
        }
    }
}
