public class NotificadorWhatsApp implements Notificador {
    private String numero;

    public NotificadorWhatsApp(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando mensagem pelo WhatsApp para " + numero + ": " + mensagem);
    }
}

