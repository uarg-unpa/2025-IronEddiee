package TrabajosPracticos.tp3.clasepractica.actividadPilaLibro;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private Libro[] libros;
    private int cima;
    private int librosMax;

    Biblioteca( String nombre, String direccion){
        this.nombre= nombre;
        this.direccion= direccion;
        this.libros= new Libro[this.librosMax];
        this.cima= -1;
    }

    //metodos set y get
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setDireccion(String dire){
        this.direccion= dire;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }

    //Metodos para la pila
    public boolean estaVacia(){
        return this.cima == -1;
    }
    public boolean estaLLena(){
        return this.cima == this.librosMax -1;
    }

    //agregar
    public void agregar(Libro r){
        cima ++;
        this.libros[cima]= r;
    }

    //sacar
    public Libro sacar(){
        Libro aux= libros[cima];
        cima --;
        return aux;
    }

    //toString
    public String toString(){
        return "[Biblioteca: " + this.nombre + ", Direccion" + this.direccion + "]\n" + libros.toString();
    }
}
