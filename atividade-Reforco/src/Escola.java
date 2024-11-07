import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Pessoa> pessoas;

    public Escola() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada: ");
        pessoa.exibirInformacoes();
    }
}
