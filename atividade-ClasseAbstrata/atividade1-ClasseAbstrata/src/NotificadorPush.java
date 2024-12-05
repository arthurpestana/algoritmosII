public class NotificadorPush implements Notificador {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando notificação push: " + mensagem);
    }
}

