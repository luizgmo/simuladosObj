package simulado;

public class ErroSimples extends RuntimeException{
    private final String mensagem;
    
    public ErroSimples(String mensagem){
        super(mensagem);
        this.mensagem = mensagem;
    }
    
    public String getMensagem(){
        return mensagem;
    }

    @Override
    public String toString() {
        return "ErroSimples (" + getMensagem() + ")";
    }
}
