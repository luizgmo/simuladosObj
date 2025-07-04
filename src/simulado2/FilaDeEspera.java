import java.util.LinkedList;
import java.util.Queue;

public class FilaDeEspera {
    private Queue<Pessoa> fila;

    public FilaDeEspera() {
        fila = new LinkedList<>();
    }
    
    public boolean adicionar(Pessoa p){
        if (fila.contains(p)){
            return false;
        } else{
            fila.offer(p);
            return true;
        }
        
    }
    
    public synchronized boolean remover(){
        if (fila.isEmpty() == false){
            System.out.println(fila.poll());
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return fila.toString();
    }
    
    
}
