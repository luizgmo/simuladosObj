package simulado5;

import java.util.List;

public class VendaConcorrente<T> {
    private EstoqueGenerico<T> estoque;
    private List<T> itens;

    public VendaConcorrente(EstoqueGenerico<T> estoque, List<T> itens) {
        this.estoque = estoque;
        this.itens = itens;
    }
    
    public void iniciarVendas(int nThreads){
        Thread[] threads = new Thread[nThreads];
        
        for (int i = 0; i < nThreads; i++){
            threads[i] = new Thread( () -> {
                for (T item : itens){
                    try {
                        if (estoque.remover(item, 1)){
                            System.out.println(Thread.currentThread().getName() + " vendeu 1 unidade de: " + item);
                        }
                    } catch (ErroLeve e){
                        System.out.println(Thread.currentThread().getName() + " falha ao vender " + item + ": " + e.getMessage());
                    }
                }
            }, "Vendedor: " + (i + 1));
            threads[i].start();
        }
        
        for (Thread t : threads){
            try {
                t.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
