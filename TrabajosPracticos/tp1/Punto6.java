package TrabajosPracticos.tp1;
import java.util.Scanner;

/*Leer tres números enteros dentro de las variables NUM1, NUM2 y NUM3 respectivamente y calcular e
imprimir el producto y la suma de ellos. Repita la operación anterior, pero esta vez, para los tres valores utilizar
una sola variable (NUM).
*/

public class Punto6 {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       int producto= 1;
       int suma= 0;
       int cont= 1;
        System.out.println("Ingrese 3 numeros, se tiene ña suma y el producto de los 3 numeros");
       while (cont <= 3) {
        int num= scanner.nextInt();
        suma= suma + num;
        producto= producto * num;
        cont= cont + 1;
       }
       System.out.println("Suma de enteros " + suma);
       System.out.println("Producto de enteros " + producto);


    }
}
