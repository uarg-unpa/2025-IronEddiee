package TrabajosPracticos.tp2part2.punto3;
import java.util.Scanner;

public class testTeatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        Obra funcion1= new Obra("Capelucita Roja", "Catherine Hardwicke", 5000, 1, 30);
        Obra funcion2= new Obra("Romeo y Julieta", "Franco Zeffirelli", 8000, 2, 0);
        Obra funcion3= new Obra("hamlet", "Kenneth Branagh", 10000, 2, 40);

        Teatro teatroCentro= new Teatro("Teatro Municipal", "AV. San Martin 1350", funcion1, funcion2, funcion3);

        System.out.println(teatroCentro);



        scanner.close();
    }
}
