package TrabajosPracticos.tp2.Punto6;

public class FechasMain {
    public static void main(String[] args) {
        Fecha fecha1= new Fecha(80, 1, 2025);

        if (fecha1.control()== true){
            System.out.println("La fecha es valida");
        }else{
            System.out.println("no es valido");
        }

    }
}
