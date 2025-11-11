package TrabajosPracticos.tp3.punto3;

/*3. Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla
en forma inversa. */

public class Palabra {
    private char [] palabra;
    private int cima;
    private int letrasMax;

    Palabra(int letrasMax){
        this.cima= -1;
        this.letrasMax= letrasMax;
        this.palabra= new char[letrasMax];
    }


    //metodos para la pila

    public boolean estaVacia(){
        return this.cima== -1;
    }
    public boolean estaLlena(){
        return this.cima == this.letrasMax -1;
    }

    public void meter(String palabra ){
        for(int cont= 0 ; cont < palabra.length(); cont++){
            this.cima++;
            this.palabra [cima]= palabra.charAt(cont);
        }
    }

    public char sacar(){
        char aux= this.palabra[this.cima];
        cima--;
        return aux;
    }

}
