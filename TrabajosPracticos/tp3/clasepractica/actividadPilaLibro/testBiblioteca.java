package TrabajosPracticos.tp3.clasepractica.actividadPilaLibro;
import java.util.Scanner;

public class testBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Biblioteca biblioteca1= new Biblioteca("Bliblioteca de la UMPA", "zapiola 123");
        
        int opcion;
        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Agregar Obra");
            System.out.println("2 Sacar Obra");
            System.out.println("3 Informacion");
            System.out.println("0 Salir ");
            opcion= sc.nextInt();
            sc.nextLine();
        }while(opcion != 0);

        sc.close();
    }
}
