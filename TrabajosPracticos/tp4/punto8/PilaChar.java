package TrabajosPracticos.tp4.punto8;

public class PilaChar {
    private char [] letras;
    private int cima;
    private int cantMaxima;


    public PilaChar(int cantidad){
        this.cantMaxima= cantidad;
        this.cima= -1;
        this.letras= new char[cantMaxima];
    }

    public boolean estaVacia(){
        return this.cima== -1;
    }

    public boolean estaLlena(){
        return this.cima== this.cantMaxima -1;
    }

     public void meter( char letra){
        this.cima ++;
        this.letras[cima]=  letra;
    }

     public int sacar(){
        char aux= letras[cima];
        cima --;
        return aux;
    }

    public int elementoCima(){
        return letras[cima];
    }
}
