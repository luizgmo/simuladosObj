
public class Video implements Comparable<Video> {

    private String titulo;
    private int classificacao;
    private Genero genero;

    public Video(String titulo, int classificacao, Genero genero) {
        setTitulo(titulo);
        setClassificacao(classificacao);
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        } else {
            throw new ErroPassivo("O título não pode ser nulo!");
        }
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        if (classificacao >= 0) {
            this.classificacao = classificacao;
        } else {
            throw new ErroPassivo("A classificação não pode ser negativa!");
        }
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Vídeo: " + getTitulo() + " / Classificação: " + getClassificacao() + " / Gênero: " + getGenero();
    }

    @Override
    public int compareTo(Video v) {
        return getTitulo().compareTo(v.getTitulo());
    }

}
