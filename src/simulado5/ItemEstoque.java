package simulado5;

public class ItemEstoque<T> {
    private T item;
    private int quantidade;

    public ItemEstoque(T item, int quantidade) {
        setItem(item);
        setQuantidade(quantidade);
    }

    public T getItem() {
        return item;
    }

    private void setItem(T item) {
        if (item != null){
            this.item = item;
        } else{
            throw new ErroLeve("O item não pode ser null");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(int quantidade) {
        if (quantidade >= 0){
            this.quantidade = quantidade;
        } else{
            throw new ErroLeve("A quantidade não pode ser negativa");
        }
    }
    
    
}
