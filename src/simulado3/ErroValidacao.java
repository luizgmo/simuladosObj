package simulado3;

public class ErroValidacao extends Exception {
    private final String mensagem;

    public ErroValidacao(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "ErroValidacao: " + getMensagem();
    }
    
    


}
