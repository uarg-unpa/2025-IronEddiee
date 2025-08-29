package TrabajosPracticos.tp2.Punto4;

public class Televisores {
    public static void main(String[] args) {
        Televisor tele1;
        tele1= new Televisor("Noblex", "HD", "Apagado", 5, 3);
        System.out.println("El Canal es: " + tele1.getCanal());

        tele1.subirCanal();
        System.out.println("Ahora el Canal es: " + tele1.getCanal());
    }
}
