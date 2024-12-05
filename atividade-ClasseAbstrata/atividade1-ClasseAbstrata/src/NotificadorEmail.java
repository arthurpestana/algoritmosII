public class NotificadorEmail implements Notificador {
    private String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando e-mail para " + email + ": " + mensagem);
    }
}

