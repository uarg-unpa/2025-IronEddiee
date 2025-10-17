package TrabajosPracticos.tp2part2.punto4;
import java.util.Scanner;

public class testArticulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Ingrese el articulo");
        String producto= scanner.nextLine();

        System.out.println("Que marca es?");
        String marca= scanner.nextLine();

        System.out.println("Ingrese una descripcion");
        String descripcion= scanner.nextLine();

        System.out.println("Cuanto cuesta?");
        int precio= scanner.nextInt();

        System.out.println("Ingrese el codigo");
        int codigo= scanner.nextInt();

        System.out.println("Cuantas unidades tiene");
        int stock= scanner.nextInt();

        Articulo articulo1= new Articulo(producto, marca, descripcion, precio, codigo, stock);

        boolean bandera= true;

        do{
            System.out.println("***MENU***\n1 Informacion \n2 Incrementar Stock \n3 Decrementar Stock \n4 vender \n5 Terminar Proceso");
            int opcion= scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(articulo1);
                    break;
                case 2:
                    System.out.println("Cuantas unidades quiere agregar?");
                    int sumarArticulos= scanner.nextInt();
                    articulo1.incrementarStock(sumarArticulos);
                    System.out.println("se agregaron " + sumarArticulos + ". Stock total: " + articulo1.getStock());
                    break;

                case 3:
                    System.out.println("Cuantas unidades quiere descontar?");
                    int restarArticulos= scanner.nextInt();
                    articulo1.decrementarStock(restarArticulos);
                    System.out.println("Se restaron "+ restarArticulos + ". Stock total: " + articulo1.getStock());
                    break;

                case 4:
                    System.out.println("Cuantos articulos se venderan?");
                    int venta= scanner.nextInt();
                    if(articulo1.vender(venta) != 0){
                        System.out.println("por la cantidad de: "+ venta + "tiene un valor de: " + articulo1.vender(venta));
                        articulo1.decrementarStock(venta);
                    }else{
                        System.out.println("No tenemos el stock suficiente para venderle. stock total: " + articulo1.getStock());
                    }
                    break;
                case 5:
                    System.out.println("Se termino el proceso");
                    bandera= false;
                    break;
                default:
                    System.out.println("numero invalido, ingrese nuevamente");
                    break;
            }
        }while(bandera == true);

        scanner.close();
    }
}

