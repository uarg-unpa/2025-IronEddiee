package TrabajosPracticos.tp2part2.punto3;

/*3. Un teatro se caracteriza por su nombre y su dirección y en él se realizan 3 obras teatrales al día. Cada obra
tiene un nombre y un precio. Realice el diseño de clases e indique qué métodos tendría cada clase, teniendo en
cuenta que se pueda cambiar el nombre del teatro y el nombre y precio de las obras. Implemente dichas clases. */

public class Obra {
    private String nombre;
    private String director;
    private double precio;
    private int hora;
    private int minutos;

    public Obra(String nombre,String director, double precio, int hora, int minutos){
        this.nombre= nombre;
        this.director= director;
        this.precio= precio;
        this.hora= hora;
        this.minutos= minutos;
    }

    //metodo get
    public String getNombre(){
        return this.nombre;
    }
    public String getDirector(){
        return this.director;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getHora(){
        return this.hora;
    }
    public int getMinutos(){
        return this.minutos;
    }

    //metodos set
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setDirector(String director){
        this.director= director;
    }
    public void setPrecio(double precio){
        this.precio= precio;
    }
    public void setHora(int hora){
        this.hora= hora;
    }
    public void setMinutos(int minutos){
        this.minutos= minutos;
    }

    //otros metodos 
    public String mostrarDuracion(){
        return String.format("%02d:%02d" + this.hora + this.minutos);
    }

    public String toString(){
        return "Obra [ " + this.nombre + ", Director: " + this.director + ", Precio: " + this.precio  + "]";
    }
}
