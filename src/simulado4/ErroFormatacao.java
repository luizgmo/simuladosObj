package simulado4;

public class ErroFormatacao extends Exception{
    private String mensagem;

    public ErroFormatacao(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "ErroFormatação: " + getMensagem();
    }
    
    
    
}
