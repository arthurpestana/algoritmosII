package conta;

public class ContaCorrente extends Conta {
    private Double saldoCorrente;

    public ContaCorrente(Conta conta, Double saldoCorrente) {
        super(conta.getTitular(), conta.getAgencia(), conta.getNumero());
        this.saldoCorrente = saldoCorrente;
    }

    public Double getSaldoCorrente() {
        return saldoCorrente;
    }
    public void setSaldoCorrente(Double saldoCorrente) {
        this.saldoCorrente = saldoCorrente;
    }

    public void sacarDinheiro(Double valor) {
        if (valor > getSaldoCorrente()) {
            System.out.println("Saldo Insuficiente");
        }
        else {
            this.setSaldoCorrente(getSaldoCorrente() - valor);
            System.out.println("Saque realizado com sucesso");
        }
    }

    public void depositarDinheiro(Double valor) {
        this.setSaldoCorrente(getSaldoCorrente() + valor);
        System.out.println("Valor depositado com sucesso");
    }
}
