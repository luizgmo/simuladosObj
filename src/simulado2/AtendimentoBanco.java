
public class AtendimentoBanco {

    public static void main(String[] args) {
        FilaDeEspera fila = new FilaDeEspera();

        Pessoa p1 = new Pessoa("luiz", "123.456.789-89");
        Pessoa p2 = new Pessoa("lucas", "999.456.789-89");
        Pessoa p3 = new Pessoa("cauan", "888.456.789-89");
        Pessoa p4 = new Pessoa("joao", "784.456.789-89");
        Pessoa p5 = new Pessoa("pedro", "222.456.789-89");

        Thread pp1 = new Thread(() -> {
            try {
                fila.adicionar(p1);
                Thread.sleep(500);

                fila.adicionar(p2);
                Thread.sleep(500);

                fila.adicionar(p3);
                Thread.sleep(500);

                fila.adicionar(p4);
                Thread.sleep(500);

                fila.adicionar(p5);
                Thread.sleep(500);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        Thread pp2 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1500);
                    fila.remover();
                    System.out.println("CX2: " + fila);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        Thread pp3 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1500);
                    fila.remover();
                    System.out.println("CX3: " + fila);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        Thread pp4 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1500);
                    fila.remover();
                    System.out.println("CX4: " + fila);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        
        pp1.start();
        pp2.start();
        pp3.start();
        pp4.start();

    }
}
