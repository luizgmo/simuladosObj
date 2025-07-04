package simulado5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class EstoqueGenerico<T> {

    Map<T, ItemEstoque<T>> estoque;

    public EstoqueGenerico() {
        this.estoque = new HashMap<>();
    }

    public Stream<ItemEstoque<T>> getItem() {
        return estoque.values().stream();
    }

    public boolean adicionar(T item, int qnt) {
        if (item == null) {
            throw new ErroLeve("Item não pode ser nulo.");
        }
        if (qnt <= 0) {
            throw new ErroLeve("Quantidade deve ser positiva.");
        }

        if (estoque.containsKey(item)) {
            ItemEstoque<T> atual = estoque.get(item);
            int novaQnt = atual.getQuantidade() + qnt;
            estoque.put(item, new ItemEstoque<>(item, novaQnt));
        } else {
            estoque.put(item, new ItemEstoque<>(item, qnt));
        }
        return true;
    }

    public boolean remover(T item, int qnt) {
        if (item == null) {
            throw new ErroLeve("Item não pode ser nulo.");
        }
        if (qnt <= 0) {
            throw new ErroLeve("Quantidade deve ser positiva.");
        }

        if (!estoque.containsKey(item)) {
            throw new ErroLeve("Item não encontrado no estoque.");
        }

        ItemEstoque<T> atual = estoque.get(item);
        int qntAtual = atual.getQuantidade();

        if (qntAtual < qnt) {
            throw new ErroLeve("Quantidade insuficiente para remover.");
        }

        int novaQnt = qntAtual - qnt;

        if (novaQnt > 0) {
            estoque.put(item, new ItemEstoque<>(item, novaQnt));
        } else {
            estoque.remove(item);
        }

        return true;
    }
}
