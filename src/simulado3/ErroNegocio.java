package simulado3;

public class ErroNegocio extends RuntimeException {
    private final String mensagem;

    public ErroNegocio(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "ErroNegocio: " + getMensagem();
    }
    
    
    
}
