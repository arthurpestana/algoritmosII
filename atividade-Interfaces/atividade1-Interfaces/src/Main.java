public class Main {
    public static void main(String[] args) {
        // Instanciar os serviços
        Registravel auditoria = new ServicoAuditoria();
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

        // Usar os métodos das interfaces
        auditoria.registrarEvento("Usuário realizou login.");

        gerenciadorTarefas.registrarEvento("Nova tarefa criada.");
        gerenciadorTarefas.enviarNotificacao("123", "Você tem uma nova tarefa atribuída!");
    }
}