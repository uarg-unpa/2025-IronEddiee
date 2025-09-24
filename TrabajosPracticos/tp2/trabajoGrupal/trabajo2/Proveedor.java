package TrabajosPracticos.tp2.trabajoGrupal.trabajo2;

public class Proveedor {
    private String nombre;
    private int telefono;
    private String direccion;
    private int codigo;


    //Constructor
    public Proveedor (String nombre, int telefono, String direccion, String producto, int codigo){
        this.nombre= nombre;
        this.telefono= telefono;
        this.direccion= direccion;
        this.codigo= codigo;
    }

    //metodo get
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public int getCodigo(){
        return this.codigo;
    }


    //metodo set
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String toString(){
        return "[Nombre: " + this.nombre + " Telefono: " + this.telefono + " Direccion: " + this.direccion + " Codigo: " + this.codigo  + "]";
    }
}