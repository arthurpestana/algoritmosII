package conta;

public class Conta {
    protected String titular;
    protected String agencia;
    protected String numero;

    public Conta(String titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
