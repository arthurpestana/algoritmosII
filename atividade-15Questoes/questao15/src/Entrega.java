import java.time.LocalDate;
import java.util.ArrayList;

public class Entrega {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Double> taxaEntrega;
    private LocalDate data;

    public Entrega() {
        pedidos = new ArrayList<>();
        taxaEntrega = new ArrayList<>();
        data = LocalDate.now();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Double> getTaxaEntrega() {
        return taxaEntrega;
    }
    public void setTaxaEntrega(Double taxaEntrega) {
        this.taxaEntrega.add(taxaEntrega);
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double FaturamentoTotal() {
        double total = 0.00;
        for (Double taxa: taxaEntrega) {
            total += taxa;
        }
        return total;
    }

}
