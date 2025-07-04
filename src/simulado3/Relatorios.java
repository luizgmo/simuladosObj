package simulado3;

import java.util.Comparator;

public class Relatorios {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto p1 = new Produto("PRD-0000", "Camiseta", 50, Produto.Categoria.VESTUARIO);
        Produto p2 = new Produto("PRD-1111", "Teclado", 100, Produto.Categoria.ELETRONICO);
        Produto p3 = new Produto("PRD-2222", "Arroz", 20, Produto.Categoria.ALIMENTO);
        Produto p4 = new Produto("PRD-4444", "Smart TV", 2000, Produto.Categoria.ELETRONICO);

        estoque.adicionar(p1);
        estoque.adicionar(p2);
        estoque.adicionar(p3);
        estoque.adicionar(p4);

        System.out.println("Ordenados por preço");
        estoque.getProdutos().stream()
                .sorted(Comparator.comparing((p) -> p.getPreco()))
                .forEach((p) -> System.out.println(p));
        
        System.out.println("");
        System.out.println("Categoria ELETRONICO");
        estoque.getProdutos().stream()
                .filter( (e) -> e.getCategoria() == Produto.Categoria.ELETRONICO )
                .forEach((p) -> System.out.println(p));
        
        System.out.println("");
        System.out.println("Nome com Smart");
        estoque.getProdutos().stream()
                .filter( (p) -> p.getNome().contains("Smart") )
                .forEach((p) -> System.out.println(p));
        
        System.out.println("");
        System.out.println("Soma dos preços");
        double soma = estoque.getProdutos().stream()
                .mapToDouble((p) -> p.getPreco() )
                .sum();
        System.out.println(soma);
                
    }
}
