package Examenes.examen1CyO;

public class Rectangulo {
    private double base;
    private double altura;


    //Constructor
    Rectangulo(double base, double altura){
        if (base > 0){
            this.base= base;
        }
        if (altura > 0){
            this.altura= altura;
        }
    }

    //metodos get
    public double getAltura(){
        return this.altura;
    }
    public double getBase(){
        return this.base;
    }

    //metodo set
    public void setBase(double base){
        this.base= base;
    }
    public void setAltura(double altura){
        this.altura= altura;
    }

    //otros metodos
    public double calcularArea(){
        return this.base * this.altura;
    }

    public double calcularPerimetro(){
        return (2 * this.base) + ( 2 * this.altura);
    }

    public boolean esMayorElArea(Rectangulo r){
        return this.calcularArea() > r.calcularArea();
    }

    public String toString(){
        return "Rectangulo [" + "Base " + this.base + ", Altura: " + this.altura; 
    }

    public String mostrarCalculos(){
        return "Perimero del rectangulo: " + this.calcularPerimetro() + "Area del rectangulo: " + this.calcularArea();
    }
    
}
