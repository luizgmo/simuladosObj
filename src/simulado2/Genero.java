public enum Genero {
    ENTRETENIMENTO("ENTRETENIMENTO"),
    EDUCACAO("EDUCACAO"),
    NOTICIAS("NOTICIAS");
    
    private String nome;

    private Genero(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome.matches("[A-Z]+")){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome deve ser maiusculo.");
        }
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
     
}
