package TrabajosPracticos.tp2.Punto4;

/* En base a las propiedades obtenidas en el ejercicio 2, implementar la clase Televisor. Con el constructor,
los set y get que sean necesarios, y con los métodos para encender, apagar, subir y bajar el canal, subir y bajar
el volumen, y volver al canal antes seleccionado */

public class Televisor{
    private String marca;
    private String modelo;
    private String estado;
    private int volumen;
    private int canal;
    private int historialCanal;
    

    //constructor
    public Televisor (String marca, String modelo, String estado, int volumen, int canal){
        this.marca = marca;
        this.modelo= modelo;
        this.estado= estado;
        this.volumen= volumen;
        this.canal= canal;
        this.historialCanal= canal;
    }

    //metodo get
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getEstado(){
        return this.estado;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public int getCanal(){
        return this.canal;
    }

    //metodos set
    public void setMarca(String marca){
        this.marca= marca;
    }
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    public void setEstado(String estado){
        this.estado= estado;
    }
    public void setVolumen(int volumen){
        this.volumen= volumen;
    }
    public void setCanal(int canal){
        this.canal= canal;
    }
    //Otros metodos
    /* 
    public void subirCanal(){
        this.canal= canal + 1;
    }

    public void bajarCanal(){
        this.canal= canal - 1;
    }

    public void subirVolumen(){
        this.volumen= volumen + 1;
    }

    public void bajarVolumen(){
        this.volumen= volumen - 1;
    } 
*/

    public void modificadorVolumen(int cambio){
        //limitar nivel de 0 a 10
        if (cambio < 0){
            this.volumen= 0;
        }else if (cambio > 10){
            this.volumen= 10;
        }else{
            this.volumen= cambio;
        }
    }

    public void modificadorCanal(int cambio){
        //limitar el canal de 1 a 100
        if (cambio < 0){
            this.canal= 1;
        }else if (cambio > 100){
            this.canal= 100;
        }else{
            this.canal= cambio;
        }
    }

    public void volverCanal(int condicion){
        if (condicion ==1){
            this.canal= this.historialCanal;
        }
    }

    public String getInformacion(){
        return "Marca: " + this.getMarca() + " " + this.getModelo() + "\n Estado: " + this.getEstado() + "\n Volumen: " + this.getVolumen() + "\n Canal: " + this.getCanal();
    }
    
}
