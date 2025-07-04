package simulado4;

import java.util.stream.Collectors;

public class RelatorioContatos {

    public static void main(String[] args) throws ErroFormatacao {
        Agenda agenda = new Agenda();

        Contato c1 = new Contato("(14) 1111-2222", "Luiz", Contato.Tipo.PESSOAL);
        Contato c2 = new Contato("(14) 2222-2222", "Lucas", Contato.Tipo.FAMILIA);
        Contato c3 = new Contato("(14) 3333-3333", "Ana", Contato.Tipo.TRABALHO);

        agenda.adicionar(c1);
        agenda.adicionar(c2);
        agenda.adicionar(c3);

        System.out.println("Ordenar por nome (sorted usa o compareTo do Contato)");
        agenda.getContatos()
                .sorted()
                .forEach((c) -> System.out.println(c));

        System.out.println("Contato tipo TRABALHO");
        agenda.getContatos()
                .filter((c) -> c.getTipo() == Contato.Tipo.TRABALHO)
                .forEach((c) -> System.out.println(c));

        System.out.println("Contatos que começam com A");
        agenda.getContatos()
                .filter((c) -> c.getNome().matches("^[Aa].*"))
                .forEach((c) -> System.out.println(c));

        System.out.println("Agrupados por tipo");
        agenda.getContatos()
                .collect(Collectors.groupingBy((c) -> c.getTipo()))
                .forEach((tipo, contatos) -> {
                    System.out.println("\n" + tipo + ":");
                    contatos.forEach(contato -> System.out.println("  - " + contato.getNome()));
                });
    }
}
