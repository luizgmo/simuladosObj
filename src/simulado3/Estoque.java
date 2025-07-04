package simulado3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Estoque {
    private final Map<Produto, Integer> estoque;

    public Estoque() {
        estoque = new HashMap<>();
    }
    
    public Set<Produto> getProdutos() {
        return estoque.keySet();
    }
    
    public synchronized boolean adicionar(Produto p) {
        if (estoque.containsKey(p)) {
            int aux = estoque.get(p);
            estoque.put(p, aux + 1);
        } else {
            estoque.put(p, 1);
        }
        return true;
    }
    
    public synchronized boolean remover(Produto p) {
        if (estoque.containsKey(p)) {
            int aux = estoque.get(p);
            if (aux == 0) {
                return false;
            }
            estoque.put(p, aux - 1);
        } else {
            return false;
        }   
        return true;
    }
    
    public Stream<Produto> buscar(String regex) {
        return estoque.keySet().stream()
                   .filter(p -> p.getNome().matches(regex));
    }
}