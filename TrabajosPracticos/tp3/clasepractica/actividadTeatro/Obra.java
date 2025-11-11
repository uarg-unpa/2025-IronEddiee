package TrabajosPracticos.tp3.clasepractica.actividadTeatro;
/*3. Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. Implemente dichas clases. */

public class Obra {
    private String nombre;
    private int precio;
    private int duracion;

    public Obra(String nombre, int precio, int duracion){
        this.nombre= nombre;
        this.precio= precio;
        this.duracion= duracion;
    }

    //metodos get
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getDuracion(){
        return this.duracion;
    }

    //metodos set
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setPrecio(int precio){
        this.precio= precio;
    }
    public void setDuracion(int duracion){
        this.duracion= duracion;
    }

    //otros metodos
    public String motrarInfo(){
        return this.nombre + "Precio: " + this.precio + "Duracion: " + this.duracion + " min";
    }
}
