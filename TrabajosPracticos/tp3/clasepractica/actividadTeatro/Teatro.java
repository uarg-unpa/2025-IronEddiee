package TrabajosPracticos.tp3.clasepractica.actividadTeatro;

/*3. Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. Implemente dichas clases. */

public class Teatro {
    private String nombre;
    private String direccion; 
    private Obra [] obras;
    private int obasMax= 3;
    private int cima;


    public Teatro(String nombre, String direccion){
        this.nombre= nombre;
        this.direccion= direccion;
        this.obras= new Obra[this.obasMax];
        this.cima= -1;
    }

    //metodos set y get
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setDireccion(String dire){
        this.direccion= dire;
    }

    //metodos para la pila
    public boolean estaVacia(){
        return this.cima== -1;
    }

    public boolean estaLlena(){
        return this.cima== this.obasMax - 1;
    }

    //agregar
    public void agregar(Obra r){
        this.cima ++;
        this.obras[cima]= r;
    }

    //sacar
    public Obra sacar(){
        Obra aux= this.obras[cima];
        cima --;
        return aux;
    }

    //mostrar obras
    public String mostrarObras(){
        String resultado= "";
        for (int cont= 0; cont < obasMax; cont ++ ){
            if (obras [cont] != null){
                resultado= resultado + "Obra: " + obras[cont].getNombre() + ", Duracion: " + obras[cont].getDuracion() + "min, Precio: $" + obras[cont].getPrecio() + "\n";
            }else{
                resultado= resultado + "Obra" + (cont + 1) + "no asignado\n";
            }
        }
        return resultado;
    }

    public String toString(){
        return "[Teatro: " + this.nombre + ", Direccion: " + this.direccion;
    }

} 
