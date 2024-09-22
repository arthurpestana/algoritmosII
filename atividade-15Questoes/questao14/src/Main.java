import java.math.BigDecimal;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Feira feira1 = new Feira("Arthur");

        Produto produto1 = new Produto("Melancia", 15.00);
        Produto produto2 = new Produto("Banana", 6.00);
        Produto produto3 = new Produto("Pera", 9.00);

        Venda venda1 = new Venda(produto1, 0);
        Venda venda2 = new Venda(produto2, 20);
        Venda venda3 = new Venda(produto3, 5);
        Venda venda4 = new Venda(produto3, 0);
        Venda venda5 = new Venda(produto1, 10);

        feira1.setProdutos(produto1);
        feira1.setProdutos(produto2);
        feira1.setProdutos(produto3);

        feira1.setVendas(venda1);
        feira1.setVendas(venda2);
        feira1.setVendas(venda3);
        feira1.setVendas(venda4);
        feira1.setVendas(venda5);

        System.out.println("Faturamento do dia "+LocalDate.of(2024, 9, 22)+": R$"+String.format("%.2f", feira1.FaturamentoDiario(LocalDate.now())));
    }
}