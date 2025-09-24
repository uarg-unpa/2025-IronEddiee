package TrabajosPracticos.tp2part2.punto2;


/*2. Una estación de servicio cuenta con una capacidad máxima de 10000 litros. En la estación es posible cargar
o reponer combustible. Cuando la capacidad de la estación está por debajo de los 10 litros se debe informar de
tal situación. Implemente la clase.
 */

public class Estacion {
    private String nombre;
    private String direccion;
    private double capacidad;
    private double litros;


    public Estacion(String nombre, String direccion, double capacidad, double litros){
        this.nombre= nombre;
        this.direccion= direccion;
        this.capacidad= capacidad;
        this.litros= litros;
    }

    //metodos get
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public double getCapacidad(){
        return this.capacidad;
    }
    public double getLitros(){
        return this.litros;
    }


    public boolean controlDeLitros(){
        return this.litros <= 10;
    }

    public void cargarVehiculo(double cantidad){
        if(this.litros >= cantidad){
            this.litros= this.litros - cantidad;
        }else{
            System.out.println("No se puede cargar, niveles de combustible: " + this.litros);
        }
    }
    
    public boolean cargaEstacion(double litros){
        if (litros < 1000){
            this.litros= this.litros + litros;
            return true;
        }else{
            this.litros= 1000;
            return false;
        }
    }

    public String toString(){
        return "Estacion [" + this.nombre + "Direccion: " + this.direccion + ", Capacidad de la estacion: " + this.capacidad + "L, niveles actuales: " + this.litros  + "L";
    }


}
