package simulado4;

public class Contato implements Comparable<Contato>{
    private String telefone;
    private String nome;
    private Tipo tipo;
    
    public enum Tipo{ PESSOAL, TRABALHO, FAMILIA };

    public Contato(String telefone, String nome, Tipo tipo) {
        setNome(nome);
        setTelefone(telefone);
        setTipo(tipo);
    }

    public String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        if (telefone.matches("^\\(\\d{2}\\) \\d{4}-\\d{4}$")){
            this.telefone = telefone;
        } else{
            throw new ErroLogica("Telefone inválido!");
        }
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        } else{
            throw new ErroLogica("Nome não pode ser nulo!");
        }
    }

    public Tipo getTipo() {
        return tipo;
    }

    private void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | Telefone: " + getTelefone() + " | Tipo: " + getTipo();
    }

    @Override
    public int compareTo(Contato c) {
        return getNome().compareTo(c.getNome());
    }
    
    
    
}
