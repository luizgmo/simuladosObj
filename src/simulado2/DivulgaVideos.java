
import java.util.Comparator;

public class DivulgaVideos {

    public static void main(String[] args) throws ErroCritico {
        Catalogo catalogo = new Catalogo();

        Video v1 = new Video("Homem Aranha 1", 14, Genero.ENTRETENIMENTO);
        Video v2 = new Video("Java Parte 1", 0, Genero.EDUCACAO);
        Video v3 = new Video("Velozes e Furiosos", 18, Genero.ENTRETENIMENTO);

        try {
            catalogo.adicionar(v1);
            catalogo.adicionar(v2);
            catalogo.adicionar(v3);
        } catch (ErroCritico ex) {
            ex.printStackTrace();
        }

        System.out.println("#1 - Vídeos ordenados por título");
        catalogo.getStream()
                .sorted()
                .forEach((v) -> System.out.println(v));

        System.out.println("");

        System.out.println("#2 - Vídeos apenas para menores de idade");
        catalogo.getStream()
                .filter((v) -> v.getClassificacao() < 18)
                .forEach((v) -> System.out.println(v));

        System.out.println("");

        System.out.println("#3 - Vídeos com a palavra Parte 1");
        catalogo.getStream()
                .filter((v) -> v.getTitulo().matches(".*Parte 1*."))
                .forEach((v) -> System.out.println(v));

        System.out.println("");

        System.out.println("#4 - Vídeos ordenados por classificação");
        catalogo.getStream()
                .sorted(Comparator.comparing((v) -> v.getClassificacao()))
                .forEach((v) -> System.out.println(v));
    }
}
