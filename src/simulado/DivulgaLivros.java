package simulado;

import java.util.Comparator;

public class DivulgaLivros {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Livro l1 = new Livro("Java 1", 2013, 50, Livro.LivroGenero.DIDATICO);
        Livro l2 = new Livro("Java 2", 2022, 100, Livro.LivroGenero.DIDATICO);
        Livro l3 = new Livro("O Mistério da Casa Verde", 2011, 30, Livro.LivroGenero.CONTO);
        Livro l4 = new Livro("Anne Frank", 1997, 40, Livro.LivroGenero.BIOGRAFIAS);

        estoque.adicionar(l1);
        estoque.adicionar(l1);
        estoque.adicionar(l2);
        estoque.adicionar(l3);
        estoque.adicionar(l4);

        System.out.println(estoque);

        System.out.println("#1 - Ordenados por nome");
        estoque.getLivros().stream()
                .sorted() // sorted ordena por nome por causa do compareTo em Livro
                .forEach( (l) ->  System.out.println(l));
        
        System.out.println("\n#2 - Livros recentes - ultimos 5 anos");
        estoque.getLivros().stream()
                .filter( (e) -> e.getAno() >= 2021 )
                .forEach( (l) ->  System.out.println(l));
        
        System.out.println("\n#3 - Livros com Java no nome");
        estoque.getLivros().stream()
                .filter( (e) -> e.getNome().matches(".*Java.*") )
                .forEach( (l) ->  System.out.println(l));

    }
}
