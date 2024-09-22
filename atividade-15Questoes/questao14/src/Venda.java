import java.time.LocalDate;

public class Venda {
    private Produto produto;
    private LocalDate data;
    private Double valor;
    private Integer desconto;

    public Venda(Produto produto, Integer desconto) {
        this.produto = produto;
        this.data = LocalDate.now();
        if (desconto >= 0 && desconto <= 100) {
            this.desconto = desconto/100;
        }
        else if (desconto<0) {
            this.desconto = 0;
        }
        else {
            this.desconto = 1;
        }
        this.valor = produto.getPreco()-(produto.getPreco()*this.desconto);
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(int ano, int mes, int dia) {
        this.data = LocalDate.of(ano, mes, dia);
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getDesconto() {
        return desconto;
    }
    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }
}
