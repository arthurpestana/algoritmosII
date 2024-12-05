public class GerenciadorTarefas implements Registravel, Notificavel {
    @Override
    public void registrarEvento(String mensagem) {
        System.out.println("Evento registrado no gerenciador de tarefas: " + mensagem);
    }

    @Override
    public void enviarNotificacao(String usuarioId, String mensagem) {
        System.out.println("Notificação enviada para o usuário " + usuarioId + ": " + mensagem);
    }
}