package TrabajosPracticos.tp3.punto3;

import java.util.Scanner;


public class testPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese La palabra");
        String palabra= sc.nextLine();  
         
        int cantLetras= palabra.length();

        Palabra palabra1= new Palabra(cantLetras);

        palabra1.meter(palabra);

        for (int cont= 0; cont < cantLetras; cont ++){
            
            System.out.println(palabra1.sacar());
        }



        sc.close();
    }
}
