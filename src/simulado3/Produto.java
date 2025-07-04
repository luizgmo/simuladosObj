package simulado3;

public class Produto {
    private String codigo;
    private String nome;
    private float preco;
    private Categoria categoria;
    
    public enum Categoria{ELETRONICO, VESTUARIO, ALIMENTO, LIMPEZA};

    public Produto(String codigo, String nome, float preco, Categoria categoria) {
        setCodigo(codigo);
        setNome(nome);
        setPreco(preco);
        setCategoria(categoria);
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        if (codigo.matches("^PRD-\\d{4}$")){
            this.codigo = codigo;
        } else{
            throw new ErroNegocio("Código inválido!");
        }
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome.length() > 2 && nome != null){
            this.nome = nome;
        } else{
            throw new ErroNegocio("Nome inválido!");
        }
    }

    public float getPreco() {
        return preco;
    }

    private void setPreco(float preco) {
        if (preco >= 0){
            this.preco = preco;
        } else{
            throw new ErroNegocio("O preço não pode ser negativo!");
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + " | Código: " + getCodigo() + "| Preço: " + getPreco() + " | Categoria: " + getCategoria();
    }
    
    
}
