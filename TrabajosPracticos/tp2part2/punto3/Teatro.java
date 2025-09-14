package TrabajosPracticos.tp2part2.punto3;

/*3. Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. Implemente dichas clases. */

public class Teatro {
    private String nombre;
    private String direccion;
    private Obra funcion;

    public Teatro(String nombre, String direccion){
        this.nombre= nombre;
        this.direccion= direccion;
    }

    //metodo get
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }

    //metodo set
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }

    //otros metodos
    public double descuento(double porcentaje){
        return (funcion.getPrecio() * porcentaje) / 100;
    }

    public double cantidadDePersonas(double cantidad){
        return funcion.getPrecio() * cantidad;
    }
    

}
