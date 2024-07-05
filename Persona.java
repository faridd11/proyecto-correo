class Persona {
    
String nombre;

public Persona (String n){
    this.nombre = n;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getNombre() {
    return nombre;
}

@Override
public String toString(){
    return super.toString();
}

public boolean equals(Object obj){
    Persona p = (Persona) obj;
    return p.nombre == this.nombre;
}
 
 


}
