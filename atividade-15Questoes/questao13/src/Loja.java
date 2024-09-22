import java.util.ArrayList;

public class Loja {
    private String nome;
    private String cnpj;
    private ArrayList<CheckIn> checkIns;

    public Loja(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.checkIns = new ArrayList<CheckIn>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<CheckIn> getCheckIns() {
        return checkIns;
    }
    public void setCheckIns(CheckIn checkIn) {
        this.checkIns.add(checkIn);
    }
}
