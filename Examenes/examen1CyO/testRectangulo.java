package Examenes.examen1CyO;
import java.util.Scanner;

public class testRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //creacion del rectangulo1 y carga de datos
        System.out.println("Tenemos dos rectangulo \ningrese su medida de base del rectangulo 1");
        double base= scanner.nextDouble();
        System.out.println("Ingrese su medida de altura del rectangulo 1");
        double altura= scanner.nextDouble();
        Rectangulo rectangulo1= new Rectangulo(base, altura);

        //creacion del rectangulo2 y carga de datos
        System.out.println("ingrese su medida de base del rectangulo 2");
        double base2= scanner.nextDouble();
        System.out.println("Ingrese su medida de altura del rectangulo 2");
        double altura2= scanner.nextDouble();
        scanner.nextLine();
        Rectangulo rectangulo2= new Rectangulo(base2, altura2);


        //menu
        boolean condicion= true;
        do{
            System.out.println("***MENU*** \n1 Calcular el Area \n2 Calcular el perimetro \n3 Evaluar que rectangulo tiene mayor area \n4 Cambiar la altura \n5 Cambiar la base \n6 Mostrar informacion de los rectangulos \n7 Terminar el proceso");
            int opcion= scanner.nextInt();

            switch (opcion) {
                //Calcular el aera
                case 1:
                    System.out.println("Que rectangulo? 1 o 2?");
                    int elegir= scanner.nextInt();
                    if (elegir == 1 || elegir == 2){
                        if (elegir == 1 ){
                            System.out.println(rectangulo1.calcularArea());
                        }
                        if (elegir == 2){
                            System.out.println(rectangulo2.calcularArea());
                        }
                    }else{
                        System.out.println("El valor ingresado no es valido");
                    }
                    break;
                     
                //Calcular el perimetro
                case 2:
                    System.out.println("Que rectangulo? 1 o 2?");
                    int elegir2= scanner.nextInt();
                    if (elegir2 == 1 || elegir2 == 2){
                        if(elegir2 == 1){
                            System.out.println(rectangulo1.calcularPerimetro());
                        }
                        if(elegir2 == 2){
                            System.out.println(rectangulo2.calcularPerimetro());
                        }
                    }else{
                        System.out.println("El valor ingresado no es valido");
                    }
                    break;
                
                //evaluar que rectangulo tiene un area mayor
                case 3:
                    if (rectangulo1.esMayorElArea(rectangulo2)){
                        System.out.println("El rectangulo 1 tiene un area mayor, su area es" + rectangulo1.calcularArea());
                    }else{
                        System.out.println("El rectangulo 2 tiene un area mayor, su area es: " + rectangulo2.calcularArea());
                    }
                    break;
                
                //Cambiar la altura
                case 4:
                    System.out.println("Que rectangulo? 1 o 2?");
                    int elegir3= scanner.nextInt();
                    if (elegir3 == 1 || elegir3 == 2){
                        if (elegir3 == 1 ){
                            System.out.println("ingrese la nueva altura");
                            double nuevaAltura= scanner.nextInt();
                            rectangulo1.setAltura(nuevaAltura);
                            System.out.println("La altura del rectangulo 1 es: " + rectangulo1.getAltura());
                        } 
                         if (elegir3 == 2 ){
                            System.out.println("ingrese la nueva altura");
                            double nuevaAltura= scanner.nextInt();
                            rectangulo2.setAltura(nuevaAltura);
                            System.out.println("La altura del rectangulo 1 es: " + rectangulo2.getAltura());
                        }
                    }else{
                        System.out.println("El valor ingresado no es valido");
                    }
                    break;
                
                //Cambiar la base
                case 5:
                    System.out.println("Que rectangulo? 1 o 2?");
                    int elegir4= scanner.nextInt();
                    if (elegir4 == 1 || elegir4 == 2){
                        if (elegir4 == 1){
                            System.out.println("ingrese la nueva medida base");
                            double nuevaBase= scanner.nextInt();
                            rectangulo1.setAltura(nuevaBase);
                            System.out.println("La base del rectangulo 1 es: " + rectangulo1.getBase());
                        }
                          if (elegir4 == 2 ){
                            System.out.println("ingrese la nueva medida de base");
                            double nuevaBase= scanner.nextInt();
                            rectangulo2.setAltura(nuevaBase);
                            System.out.println("La altura del rectangulo 1 es: " + rectangulo2.getAltura());
                        }
                    }else{
                        System.out.println("El valor ingresado no es valido");
                    }
                    break;
                
                //Mostrar informacion
                case 6:
                    System.out.println(" Rectangulo 1: " + rectangulo1 + " " + rectangulo1.mostrarCalculos() + "\nRectangulo 2: " + rectangulo2 + " " + rectangulo2.mostrarCalculos());
                    break; 

                //terminar proceso
                case 7:
                    System.out.println("Se termino el proceso");
                    condicion= false;

                //si ingresa un valor invalido avisa
                default:
                    System.out.println("El valor ingresado no es valido, intente nuevamente");
                    break;
            }
        }while(condicion == true);


        scanner.close();
    }
}
