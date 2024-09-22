import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Entrega entrega = new Entrega();

        Cliente cliente1 = new Cliente("Arthur", "arthur@gmail.com");

        Produto produto1 = new Produto("X-Tudo", "Pão, queijo e hambúguer", 17.00);
        Produto produto2 = new Produto("Pizza", "Pizza Grande de Calabresa", 42.00);
        Produto produto3 = new Produto("Sushi", "16 Hot Rolls", 48.00);

        Pedido pedido1 = new Pedido(cliente1, produto1, 2, "Jardim Vitória");
        Pedido pedido2 = new Pedido(cliente1, produto2, 1, "Jardim Vitória");
        Pedido pedido3 = new Pedido(cliente1, produto3, 3, "Jardim Vitória");

        entrega.setPedidos(pedido1);
        entrega.setTaxaEntrega(9.99);

        entrega.setPedidos(pedido2);
        entrega.setTaxaEntrega(19.90);

        entrega.setPedidos(pedido3);
        entrega.setTaxaEntrega(5.59);


        System.out.println("Faturamento total das entregas: R$"+new BigDecimal(entrega.FaturamentoTotal()).setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}