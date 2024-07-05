import java.util.*;
public class Destinatario extends Persona {

ArrayList<Mensaje> mensajes = new ArrayList<>();

public Destinatario(String n){
    super(n);
}

public void capturarCorreo(Mensaje m){
    mensajes.add(m);
}

public String toString(){
    String d = "\nDestinatario---------\n";
    d += this.getNombre()+"\n";
    for(int i = 0; i<mensajes.size(); i++){
        d += mensajes.get(i).toString();
    }
    return d;
}
  
    
}
