package simulado5;

public class RegExString {
    private String palavra;

    public RegExString(String palavra, String regex) {
        if (palavra.matches(regex)){
            this.palavra = palavra;
        } else{
            throw new ErroLeve("A palavra não bate com o regex");
        }
    }

    public String getPalavra() {
        return palavra;
    }
    
    public boolean match(String regex){
        return palavra.matches(regex);
    }

    @Override
    public String toString() {
        return getPalavra();
    }
    
    
    
}
