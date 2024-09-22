import java.util.ArrayList;
import java.time.LocalDate;

public class Feira {
    private String dono;
    private ArrayList<Produto> produtos;
    private ArrayList<Venda> vendas;

    public Feira(String dono) {
        this.dono = dono;
        produtos = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    public void setVendas(Venda venda) {
        this.vendas.add(venda);
    }

    public Double FaturamentoDiario(LocalDate data) {
        double total = 0.0;
        for (Venda venda : vendas) {
            if (venda.getData().equals(data)) {
                total += venda.getValor();
            }
        }
        return total;
    }

    public Double FaturamentoTotal() {
        double total = 0.0;
        for (Venda venda : vendas) {
            total += venda.getValor();
        }
        return total;
    }
}
