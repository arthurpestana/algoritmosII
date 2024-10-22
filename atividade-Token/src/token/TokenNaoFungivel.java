package token;

public class TokenNaoFungivel extends Token{
    private String idUnico;

    public TokenNaoFungivel(Token token, String idUnico){
        super(token.getNome(), token.getValor());
        this.idUnico = idUnico;
    }

    public String getIdUnico() {
        return idUnico;
    }
    public void setIdUnico(String idUnico) {
        this.idUnico = idUnico;
    }
}
