package TrabajosPracticos.tp2.trabajoGrupal.trabajo2;
import java.util.Scanner;

public class tesProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Proveedor proveedor1= new Proveedor("Granja tomatil", 1234567890, "Zapiola 263", "Puré de tomate", 737264);
        //VALORES DEL PRIMER PRODUCTO
        System.out.println("Ingrese el primer producto");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la descripción");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese el precio");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese cuántas unidades tiene");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Producto producto1= new Producto(nombre, descripcion, precio, proveedor1, stock);
        System.out.println(producto1);
        
        if(producto1.esCaro() == true){
            System.out.println("El producto es caro $" + producto1.getPrecio());
        }else{
            System.out.println("Es barato $" + producto1.getPrecio());
        }

        System.out.println("Actualice el precio");
        double nuevoPrecio= scanner.nextDouble();
        scanner.nextLine();
        producto1.actualizarPrecio(nuevoPrecio);

        System.out.println("tiene descuento? 1 Si | 2 NO");
        char decision= scanner.next().charAt(0);
        if (decision == '1'){
            System.out.println("De cuanto es?");
            int descuento= scanner.nextInt();
            scanner.nextLine();
            double precioDescuento= producto1.calcularDescuento(descuento);
            producto1.setPrecio(precioDescuento);
            System.out.println("El descuento es del " + descuento + "%, el precio es: $" + producto1.getPrecio());
        }else{
            System.out.println("El producto no tiene descuento: " + producto1.getPrecio());
        }


        //VALORES DEL SEGUNDO PRODUCTO
        System.out.println("Ingrese el segundo producto");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la descripción");
        String descripcion2 = scanner.nextLine();
        System.out.println("Ingrese el precio");
        double precio2 = scanner.nextDouble();
        System.out.println("Ingrese cuántas unidades tiene");
        int stock2 = scanner.nextInt();
        Producto producto2= new Producto(nombre2, descripcion2, precio2, proveedor1, stock2);
        System.out.println(producto2);

        if(producto2.esCaro() == true){
            System.out.println("El producto es caro $" + producto2.getPrecio());
        }else{
            System.out.println("Es barato $" + producto2.getPrecio());
        }






        scanner.close();
    }
}
