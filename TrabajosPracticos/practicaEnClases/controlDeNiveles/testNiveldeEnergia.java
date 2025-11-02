package TrabajosPracticos.practicaEnClases.controlDeNiveles;

import java.util.Scanner;


public class testNiveldeEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PilaEnteros energias= new PilaEnteros();

        System.out.println("Contamos con 5 niveles para ingresar energia");

         int opcion;
        do{
            System.out.println("\n***MENU***");
            System.out.println("1 Ingresar valor de energia");
            System.out.println("2 Sacar Un Valor en especifico");
            System.out.println("3 sacar el ultimo valor");
            System.out.println("4 Verificar cuantas veces se repite un valor de energia");
            System.out.println("5 agregar un nivel de espacio");
            System.out.println("6 Consultar nivel actual");
            System.out.println("0 Terminar proceso");
            opcion= sc.nextInt();

            switch (opcion) {
                case 1:
                    if(!energias.estaLlena()){
                        System.out.println("Ingrese el el nivel de energia.");
                        int valor= sc.nextInt();
                        energias.meter(valor);
                    }else{
                        System.out.println("No se puede realizar esta operacion, la pila esta llena, elimine un valor o agregue un nivel");
                    }
                    break;
                
                case 2:
                    if(!energias.estaVacia()){
                        System.out.println("Que valor de energia quiere sacar? (si el valor se repite, los repetidos seran eliminados tambien)");
                        int sacar= sc.nextInt();
                        System.out.println("Se elimino el valor " + energias.sacarValor(sacar) + " de la cola de energias.");
                    }else{
                        System.out.println("No se puede realizar esta operacion, la pila esta vacia");

                    }
                    break;

                case 3:
                    if (!energias.estaVacia()){
                        System.out.println("se elimino el ultimo valor ingresado: " + energias.sacar());
                    }else{
                        System.out.println("No se puede realizar esta operacion, la pila esta vacia");
                    }
                    break;

                case 4:
                    if(!energias.estaVacia()){
                        System.out.println("Ingrese el valor a verificar");
                        int repetido= sc.nextInt();
                        int cantidad= energias.cantOcurrencias(repetido);
                        if (cantidad != 0){
                            System.out.println("EL valor " + repetido + " Se repite " + cantidad + " veces en la pila");
                        }else{
                            System.out.println("El numero " + repetido + " no se repite en la pila");
                        }
                    }else{
                        System.out.println("No se puede realizar esta operacion, la pila esta vacia");
                    }
                    break;
                
                case 5:
                    if(energias.estaLlena()){
                        System.out.println("cuantos niveles quiere agregar?");
                        int nivel= sc.nextInt();
                        energias.agregarNivel(nivel);
                        System.out.println("Se agregaron " + nivel + " a la pila, espacios disponibles: " + energias.nivelesDisponibles() + ", nivel actual " + energias.getNivelActual());
                    }else{
                        System.out.println("Aun tiene espacios disponibles para ocupa: " + energias.nivelesDisponibles() + " disponibles");
                    }
                    break;

                case 6:
                    int actual= energias.getNivelActual();
                    int disponibles= energias.nivelesDisponibles();
                    System.out.println("Nivel actual: " + actual + "\nNiveles disponibles: " + disponibles);
                    break;
                
                case 0:
                    System.out.println("Terminando proceso...");
                    break;

                default:
                    System.out.println("El valor ingresado no es valido, intente nuevamente");
                    break;
            }
        }while (opcion != 0);

        sc.close();
    }
}
