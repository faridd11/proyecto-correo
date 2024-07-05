public class Mensaje{

private Remitente remitente;
private Destinatario destinatario;
private String text = "";

public Mensaje(Remitente r, Destinatario des, String mensa){
    this.remitente = r;
    this.destinatario = des;
    this.text = mensa;
}

public Destinatario getDestinatario() {
    return destinatario;
}

public Remitente getRemitente() {
    return remitente;
}

public String toString(){
    String t = "";
    t += "\nMensaje --------------\n";
    t += "Remitente: " +this.remitente.getNombre()+"\n";
    t += "Destinatario: " +this.destinatario.getNombre()+"\n";
    t += "Mensaje: " + this.text+"\n";
    return t;
}
}
