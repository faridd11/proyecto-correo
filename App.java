public class App {
    public static void main(String[] args) {
        Remitente rem = new Remitente("Zenon");
        Destinatario des = new Destinatario("Merentiel");
        Mensaje mensa = new Mensaje(rem, des, "Boooooooooooooca");

        Buzon buzon1 = new Buzon();
        buzon1.setNombre("Gmail");

        buzon1.anadirAsociado(des);

        buzon1.recibeMensaje(mensa);

        Destinatario desti = new Destinatario("Roman");
        Remitente remi = new Remitente("Bataglia");
        Mensaje mensa2 = new Mensaje(remi, desti, "Boca es el más ganador");

        buzon1.anadirAsociado(desti);
        buzon1.recibeMensaje(mensa2);
        buzon1.entregaDeMensaje(desti);

    }
}
