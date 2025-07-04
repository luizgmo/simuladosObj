package simulado5;

public class ErroLeve extends RuntimeException{
    private String mensagem;

    public ErroLeve(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return "ErroLeve: " + getMensagem();
    }
    
    
}
