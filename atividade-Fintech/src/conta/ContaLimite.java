package conta;

public class ContaLimite extends Conta {
    private Double limite;

    public ContaLimite(Conta conta, Double limite) {
        super(conta.getTitular(), conta.getAgencia(), conta.getNumero());
        this.limite = limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    public Double getLimite() {
        return limite;
    }

    public void gastarCredito(double valor) {
        if (valor > limite) {
            System.out.println("Limite Insuficiente");
        }
        else {
            System.out.println("Compra creditada realizada com sucesso");
            limite -= valor;
        }
    }
}
