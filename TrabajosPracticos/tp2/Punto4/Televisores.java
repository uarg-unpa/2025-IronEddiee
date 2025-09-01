package TrabajosPracticos.tp2.Punto4;
import java.util.Scanner;

public class Televisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Televisor tele1;
        tele1= new Televisor("Noblex", "Full HD", "Apagado", 5, 3);
        
        boolean cond= true;
        do{
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1 Informacion de tv \n2 Ensender televisor \n3 Cambio de volumen \n4 Cambio de canal \n5 Apagar \n");
            int opcion= scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(tele1.getInformacion());
                    break;
                case 2:
                    if (tele1.getEstado() == "Apagado"){
                        tele1.setEstado("Encendido");
                        System.out.println("EL televisor se encendio");
                    }else {
                        System.out.println("El televisor ya esta encendido");
                    }
                    break;

                case 3:
                    System.out.println("ingrese el nivel de volumen");
                    int nivel= scanner.nextInt();
                    tele1.modificadorVolumen(nivel);
                    System.out.println("Nivel de volumen: " + tele1.getVolumen());
                    break;
                
                case 4:
                    System.out.println("¿Que canal quiere cambiar");
                    int canal= scanner.nextInt();
                    tele1.modificadorCanal(canal);
                    System.out.println("Se cambio al canal: " + tele1.getCanal());
                    System.out.println("¿Desea volver al canal anterior?\n 1 Si\n 2 No");
                    int volver= scanner.nextInt();
                    if (volver == 1){
                        tele1.volverCanal(volver);
                        System.out.println("Se vuelve al canal: " + tele1.getCanal());
                    }
                    break;
                
                case 5:
                    System.out.println("Apagando televisor");
                    cond= false;
                    break;
                    
                default:
                    System.out.println("El valor ingresado no es valido");
                    break;
            }
        }while(cond == true);
        scanner.close();
    }
}
