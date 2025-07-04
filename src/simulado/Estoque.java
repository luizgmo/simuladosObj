package simulado;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Estoque {

    Map<Livro, Integer> estoque;

    public Estoque() {
        estoque = new HashMap();
    }

    // conseguir acessar o stream na main
    public Set<Livro> getLivros() {
        return estoque.keySet();
    }

    public synchronized boolean adicionar(Livro l) {
        if (estoque.containsKey(l)) {
            int aux = estoque.get(l);
            estoque.put(l, aux + 1);
        } else {
            estoque.put(l, 1);
        }
        return true;
    }

    public synchronized boolean remover(Livro l) {
        if (estoque.containsKey(l)) {
            int aux = estoque.get(l);
            if (aux == 0) {
                return false;
            }
            estoque.put(l, aux - 1);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Livro chave : estoque.keySet()) {
            int quantidade = estoque.get(chave);
            resultado += "- " + chave + " / Quantidade: " + quantidade + "\n";
        }
        return resultado;
    }

}
