package conta;

public class ContaRendimento extends Conta{
    private Double poupanca;

    public ContaRendimento(Conta conta, Double poupanca) {
        super(conta.getTitular(), conta.getAgencia(), conta.getNumero());
        this.poupanca = poupanca;
    }

    public Double getPoupanca() {
        return poupanca;
    }
    public void setPoupanca(Double poupanca) {
        this.poupanca = poupanca;
    }

    public void depositarPoupanca(Double poupanca){
        this.poupanca += poupanca;
    }
    public void resgatarPoupanca(Integer meses) {
        Double rendimentoTotal = this.poupanca * meses * 0.1;
        this.setPoupanca(rendimentoTotal);
        System.out.println("Valor resgatado da poupança: "+ rendimentoTotal);
    }
}
