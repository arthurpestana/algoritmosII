import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int idadeCliente = 20;

        // Carrinho
        Carrinho carrinho = new Carrinho(idadeCliente);

        // Criar itens
        Alimento leite = new Alimento("Leite", 4.50, LocalDate.of(2024, 12, 3));
        OutroItem shampoo = new OutroItem("Shampoo", 15.00);
        Bebida cerveja = new Bebida("Cerveja", 8.00);

        carrinho.adicionarItem(leite);
        carrinho.adicionarItem(shampoo);
        carrinho.adicionarItem(cerveja);

        // Exibir itens no carrinho
        carrinho.exibirItens();
        double total = carrinho.calcularTotal();
        System.out.printf("\nTotal: R$%.2f%n", total);

        Notificador email = new NotificadorEmail("cliente@example.com");
        Notificador push = new NotificadorPush();
        Notificador whatsapp = new NotificadorWhatsApp("+5511999999999");

        Caixa caixa = new Caixa(Arrays.asList(email, push, whatsapp));

        Pagamento pagamento = new Pix("chave-pix-exemplo");
        caixa.processarPagamento(pagamento, total);
    }
}

