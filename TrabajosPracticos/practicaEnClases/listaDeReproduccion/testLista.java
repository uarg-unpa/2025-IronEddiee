package TrabajosPracticos.practicaEnClases.listaDeReproduccion;
import java.util.Scanner;

public class testLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaReproduccion lista= new ListaReproduccion();


        int opcion;
        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Ingresar un tema a la lista");
            System.out.println("2 reproducir");
            System.out.println("3 saltear tema");
            System.out.println("0 Terminar proceso");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (!lista.estaLleno()){
                        System.out.println("Ingrese el interprete");
                        String interprete= sc.nextLine();
                        System.out.println("Ingrese el genero");
                        String genero = sc.nextLine();
                        System.out.println("Ingrese el Titulo");
                        String titulo= sc.nextLine();
                        System.out.println("Ingrese su año de lanzamiento");
                        int año= sc.nextInt();
                        Musica tema= new Musica(titulo, interprete, genero, año);
                        lista.insertar(tema);

                    }else{
                        System.out.println("La lista ya esta llena");
                    }
                    break;

                case 2:
                    if (!lista.estaVacio()){
                        Musica reproducir= lista.borrar();
                        System.out.println("Se esta reproduciendo el tema " + reproducir + "...");
                        System.out.println("Terminó. El siguiente tema es " +  lista.peek());
                    }else{
                        System.out.println("La lista de reproduccion ya esta vacia");
                    }
                    break;
                
                case 3:
                    if(!lista.estaVacio()){
                        Musica saltear= lista.borrar();
                        System.out.println("Se salteó el tema " + saltear);

                    }else{
                        System.out.println("La lista de reproduccion ya esta vacia");
                    }
                    break;

                
                default:
                    System.out.println("El valor ingresado no es valido, intente nuevamente");
                    break;
            }
        }while(opcion != 0);

        
        sc.close();
    }
}
