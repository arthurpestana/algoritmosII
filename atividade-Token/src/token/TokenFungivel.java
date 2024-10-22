package token;

public class TokenFungivel extends Token{
    private Integer quantidade;

    public TokenFungivel(Token token, Integer quantidade) {
        super(token.getNome(), token.getValor());
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
