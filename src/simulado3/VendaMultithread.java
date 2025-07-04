package simulado3;

public class VendaMultithread {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        
        Produto p1 = new Produto("PRD-0000", "Camiseta", 50, Produto.Categoria.VESTUARIO);
        
        estoque.adicionar(p1);
        estoque.adicionar(p1);
        estoque.adicionar(p1);
        estoque.adicionar(p1);
        estoque.adicionar(p1);
        
        Thread compra1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("compra1 " + estoque.remover(p1));
                System.out.println("compra1 " + estoque.remover(p1));
                System.out.println("compra1 " + estoque.remover(p1));
            }           
        });
        
        Thread compra2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("compra2 " + estoque.remover(p1));
                System.out.println("compra2 " + estoque.remover(p1));
                System.out.println("compra2 " + estoque.remover(p1));
            }           
        });
        
        Thread compra3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("compra3 " + estoque.remover(p1));
                System.out.println("compra3 " + estoque.remover(p1));
                System.out.println("compra3 " + estoque.remover(p1));
            }           
        });
        
        compra1.start();
        compra2.start();
        compra3.start();
    }
}
