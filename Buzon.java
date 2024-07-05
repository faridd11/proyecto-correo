import java.util.*;

public class Buzon{
  String nombre;
    

    ArrayList<Mensaje> mensajes = new ArrayList<>();
    ArrayList<Destinatario>asociados = new ArrayList<>();

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void anadirAsociado(Destinatario des){
    this.asociados.add(des);
}

public void recibeMensaje(Mensaje m){
    System.out.println("Mensaje entrante de: " + m.getRemitente().getNombre());
    for (int i = 0; i<asociados.size(); i++){
        System.out.println(asociados.get(i));
        System.out.println(asociados.get(i).equals(m.getDestinatario()));
    }
}

public void mostrarBuzon(){
    String tex = "\n --- Buzon -----";
    for(int i = 0; i<mensajes.size() ; i++){
        tex += mensajes.get(i).toString();
    }
    tex += "---------------------";
    System.out.println(tex);
}

public Destinatario entregaDeMensaje(Destinatario des){
    System.out.println("Mensaje para: "+des.nombre);
    for(int i=0; i<mensajes.size(); i++){
        if(mensajes.get(i).getDestinatario().equals(des)){
            Mensaje me = mensajes.remove(i);
            des.capturarCorreo(me);

        }
    }
    return des;
}



}
    



