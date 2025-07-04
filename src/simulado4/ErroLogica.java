package simulado4;

public class ErroLogica extends RuntimeException{
    private String mensagem;

    public ErroLogica(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "ErroLogica: " + getMensagem(); 
    }
    
    
}
