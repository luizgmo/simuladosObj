package simulado5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EstoqueGenerico<RegExString> estoque = new EstoqueGenerico<>();
        
        try {
            RegExString item1 = new RegExString("JAVA", "^[A-Z]+$");
            RegExString item2 = new RegExString("CODIGO", "^[A-Z]+$");
            RegExString item3 = new RegExString("ESTOQUE", "^[A-Z]+$");

            estoque.adicionar(item1, 5);
            estoque.adicionar(item2, 3);
            estoque.adicionar(item3, 7);

            RegExString invalido = new RegExString("Java123", "^[A-Z]+$");
            estoque.adicionar(invalido, 2);
        } catch(ErroLeve e){
            System.out.println("Item inválido: " + e.getMessage());
        }
        
        List<RegExString> itens = new ArrayList<>();
        itens.add(new RegExString("JAVA", "^[A-Z]+$"));
        itens.add(new RegExString("JAVA", "^[A-Z]+$"));
        itens.add(new RegExString("CODIGO", "^[A-Z]+$"));
        itens.add(new RegExString("ESTOQUE", "^[A-Z]+$"));
        itens.add(new RegExString("ESTOQUE", "^[A-Z]+$"));
        
        VendaConcorrente<RegExString> vendas = new VendaConcorrente<>(estoque, itens);
        
        vendas.iniciarVendas(3);
        estoque.getItem()
            .sorted(Comparator.comparing(e -> e.getItem().getPalavra()))
            .forEach(System.out::println);
        

    }
    
}
