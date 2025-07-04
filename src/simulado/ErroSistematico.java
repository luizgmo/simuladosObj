package simulado;

public class ErroSistematico extends Exception{
    private final String mensagem;
    
    public ErroSistematico(String mensagem){
        super(mensagem);
        this.mensagem = mensagem;
    }
    
    public String getMensagem(){
        return mensagem;
    }

    @Override
    public String toString() {
        return "ErroSistematico (" + getMensagem() + ")";
    }
    
    
}
