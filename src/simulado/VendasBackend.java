package simulado;

import java.util.Comparator;

public class VendasBackend {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Livro l1 = new Livro("Java 1", 2013, 50, Livro.LivroGenero.DIDATICO);
        Livro l2 = new Livro("Java 2", 2022, 100, Livro.LivroGenero.DIDATICO);
        Livro l3 = new Livro("O Mistério da Casa Verde", 2011, 30, Livro.LivroGenero.CONTO);
        Livro l4 = new Livro("Anne Frank", 1997, 40, Livro.LivroGenero.BIOGRAFIAS);

        estoque.adicionar(l1);
        estoque.adicionar(l1);
        estoque.adicionar(l1);
        estoque.adicionar(l1);
        estoque.adicionar(l2);
        estoque.adicionar(l3);
        estoque.adicionar(l4);

        System.out.println(estoque);

        // classe anonima
        Thread ponto1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ponto1 " + estoque.remover(l1));
                System.out.println("ponto1 " + estoque.remover(l2));
                System.out.println("ponto1 " + estoque.remover(l3));
            }
        });

        // lambda
        Thread ponto2 = new Thread(() -> {
            System.out.println("ponto2 " + estoque.remover(l1));
            System.out.println("ponto2 " + estoque.remover(l2));
            System.out.println("ponto2 " + estoque.remover(l3));
        });

        Thread ponto3 = new Thread(() -> {
            System.out.println("ponto3 " + estoque.remover(l1));
            System.out.println("ponto3 " + estoque.remover(l2));
            System.out.println("ponto3 " + estoque.remover(l3));
        });

        ponto1.start();
        ponto2.start();
        ponto3.start();
    }
}
