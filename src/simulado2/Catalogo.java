
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Catalogo {

    List<Video> catalogo;

    public Catalogo() {
        catalogo = new ArrayList<>();
    }
    
    public Stream<Video> getStream(){
        return catalogo.stream();
    }

    public boolean adicionar(Video v) throws ErroCritico {
        if (catalogo.contains(v)) {
            throw new ErroCritico("O vídeo já está no Catálogo!");
        } else {
            catalogo.add(v);
            return true;
        }
        
    }
    
    public boolean remover (Video v) throws ErroCritico{
        if (catalogo.contains(v)){
            catalogo.remove(v);
            return true;
        } else{
            throw new ErroCritico("O vídeo não existe no Catálogo!");
        }
        
    }

}
