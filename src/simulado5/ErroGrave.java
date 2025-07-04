package simulado5;

public class ErroGrave extends Exception{
    private String mensagem;

    public ErroGrave(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "ErroGrave: " + getMensagem();
    }
    
    
}
