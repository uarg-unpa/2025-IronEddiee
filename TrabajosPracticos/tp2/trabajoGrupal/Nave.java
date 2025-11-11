package TrabajosPracticos.tp2.trabajoGrupal;

/*una simulacion espacial registra naves con nombre, velocidad máxima(en km/h), combustible restante (en litros) y destino.
Los jugadores quieren verificar si una nave puede llegar a su destino (combustible >1000), acelerar
(aumentar velocidad) y mostrar un informe de la misión.
10 km = 1L
 */

public class Nave {
    private String nombre;
    private double combustible;
    private int velocidadM;
    private int rendimiento;

    //constructor
    public Nave(String nombre, int velocidadM, int rendimiento,  double combustible){
        this.nombre= nombre;
        this.combustible= combustible;
        this.velocidadM= velocidadM;
        this.rendimiento= rendimiento ;
    }

    //metodo get 

    public String getnombre(){
        return this.nombre;
    }
    public double getcombustible(){
        return this.combustible;
    }
    public int getvelocidadM(){
        return this.velocidadM;
    }


    //metodo set

    public void setNombre(String name){
        this.nombre= name;
    }
    public void setCombustible(double combustible){
        this.combustible= combustible;
    }
    public void setVelocidadM(int velocidad){
        this.velocidadM= velocidad;
    }
  

    //otros metodos
    public double calculoCombustible(double km){
        return this.combustible - (km / this.rendimiento);
    } //cuanto gasta de combustible por x kilometro

    public boolean esMayor(double km){
        return this.combustible > this.calculoCombustible(km);
    } //pregunta si llega a destino con el combustible que le queda

    public String toString(){
    return "Nave [Nombre="+ this.nombre+", velocidad:"+ this.velocidadM + "Km/h , combustible:" + this.combustible + " L, rendimiento:" + this.rendimiento + " Km/L ]";
}
}
