package TrabajosPracticos.tp2.trabajoGrupal;

/*una simulacion espacial registra naves con nombre, velocidad máxima(en km/h), combustible restante (en litros) y destino.
Los jugadores quieren verificar si una nave puede llegar a su destino (combustible >1000), acelerar
(aumentar velocidad) y mostrar un informe de la misión.
 */

public class Nave {
    private String nombre;
    private int combustible;
    private int velocidadM;
    private int aceleracion;

    //constructor
    public Nave(String nombre, int combustible, int velocidadM, int aceleracion){
        this.nombre= nombre;
        this.combustible= combustible;
        this.velocidadM= velocidadM;
        this.aceleracion= aceleracion;
    }

    //metodo get 

    public String getnombre(){
        return this.nombre;
    }
    public int getcombustible(){
        return this.combustible;
    }
    public int getvelocidadM(){
        return this.velocidadM;
    }
    public int getaceleracion(){
        return this.aceleracion;
    }

    //metodo set

    public void setNombre(String name){
        this.nombre= name;
    }
    public void setCombustible(int combustible){
        this.combustible= combustible;
    }
    public void setVelocidadM(int velocidad){
        this.velocidadM= velocidad;
    }
    public void setAceleracion(int aceleracion){
        this.aceleracion= aceleracion;
    }

    //otros metodos
    

}
