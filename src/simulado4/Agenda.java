package simulado4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Agenda {
    Set<Contato> agenda;

    public Agenda() {
        agenda = new HashSet<>();
    }
    
    public Stream<Contato> getContatos(){
        return agenda.stream();
    }
    
    public boolean adicionar(Contato c) throws ErroFormatacao{
        if (agenda.contains(c)){
            throw new ErroFormatacao("O contato já está na agenda!");
        } else{
            agenda.add(c);
            return true;
        }
    }
    
    public boolean remover(Contato c) throws ErroFormatacao{
        if (agenda.contains(c)){
            agenda.remove(c);
            return true;
        } else{
            throw new ErroFormatacao("O contato não existe na agenda!");
        }
    }
}
