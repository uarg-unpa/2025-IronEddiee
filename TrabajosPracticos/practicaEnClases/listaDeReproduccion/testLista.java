package TrabajosPracticos.practicaEnClases.listaDeReproduccion;
import java.util.Scanner;

public class testLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos temas quiere ingresar?");
        int cantidad= sc.nextInt();
        ListaReproduccion lista= new ListaReproduccion(cantidad);


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
                        System.out.println("quedan " + lista.cantidadDispo() + " lugares disponibles");

                    }else{
                        System.out.println("La lista ya esta llena");
                    }
                    break;

                case 2:
                    if (!lista.estaVacio()){
                        Musica reproducir= lista.sacar();
                        System.out.println("Se esta reproduciendo el tema " + reproducir + "...");
                        System.out.println("Terminó. El siguiente tema es " +  lista.peek());
                    }else{
                        System.out.println("La lista de reproduccion ya esta vacia");
                    }
                    break;
                
                case 3:
                    if(!lista.estaVacio()){
                        Musica saltear= lista.sacar();
                        System.out.println("Se salteó el tema " + saltear);
                        System.out.println("quedan " + lista.cantidadDispo() + " temas a reproducir.");
                    }else{
                        System.out.println("La lista de reproduccion ya esta vacia");
                    }
                    break;

                case 0:
                    System.out.println("Terminando proceso...");
                    break;
                
                default:
                    System.out.println("El valor ingresado no es valido, intente nuevamente");
                    break;
            }
        }while(opcion != 0);

        
        sc.close();
    }
}
