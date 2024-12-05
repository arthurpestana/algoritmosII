public class ServicoAuditoria implements Registravel {
    @Override
    public void registrarEvento(String mensagem) {
        System.out.println("Evento registrado no sistema de auditoria: " + mensagem);
    }
}