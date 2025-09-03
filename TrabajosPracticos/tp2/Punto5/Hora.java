package TrabajosPracticos.tp2.Punto5;

/*5. Una hora se compone de 3 elementos: hora, minutos y segundos. Codificar la clase Hora con los siguientes
métodos: 
a) Cuando se crea el objeto de la clase Hora, los valores de hora, minutos y segundos deben ser
válidos (es decir, una hora correcta en Argentina). Si alguno es inválido, generar la hora 00:00:00.
b) Permitir cambiar la hora, los minutos y los segundos por separado.
c) Devolver la hora en minutos.
d) Mostrar la hora de la siguiente forma: hh:mm:ss.
e) Crear dos objetos de la clase Hora, y probar los métodos correspondientes */

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    //Constructor
    public Hora(int hora, int minutos, int segundos){
        if (validacion(hora, minutos, segundos)){
            this.hora= hora;
            this.minutos= minutos;
            this.segundos=segundos;
        }else{
            this.hora= 0;
            this.minutos= 0;
            this.segundos=0;
        }
    }

    //metodo get
    public int getHora(){
        return this.hora;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public int getSegundos(){
        return this.segundos;
    }

    //metodo set
    public void setHora(int hora){
        this.hora= hora;
    }
    public void setMinutos(int minutos){
        this.minutos= minutos;
    }
    public void setSegundos(int segundos){
        this.segundos= segundos;
    }

    //otros metodos
    public boolean validacion (int hh, int mm, int ss){
        return (hh >= 0 && hh <= 23 ) && (mm >= 0 && mm <= 59) && (ss >= 0 && ss <= 59 );
    }  

     public String formatoHora() {
        return String.format("%02d:%02d:%02d", this.hora, this.minutos, this.segundos);
    }

    public int convertirEnMinutos(){
        return this.hora * 60 + this.minutos + (this.segundos / 60);
    }

}
