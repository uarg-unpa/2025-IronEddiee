package TrabajosPracticos.tp2.Punto6;

/*6. Una fecha se compone de 3 elementos: día, mes y año. Codificar la clase Fecha con los siguientes métodos:
a) Cuando se crea el objeto de la clase Fecha, los valores de día, mes y año deben ser válidos (es decir, una
fecha correcta). Si alguno es inválido, generar la fecha 01/01/2013.
b) Devolver el día; devolver el mes; devolver el año.
c) Cambiar el día; cambiar el mes; cambiar el año.
d) Obtener el nombre del mes de la fecha (ejemplo: si el mes es 1, obtener Enero).
e) Mostrar la fecha de la siguiente forma: 1 de Setiembre de 2012. */

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    //Constructor
    public Fecha(int dia, int mes, int año){
        if (control()== true){
            this.dia= dia;
            this.mes= mes;
            this.año= año;
        }else{
            this.dia= 1;
            this.mes= 1;
            this.año=2013;
        }
        }

    //metodo get
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAño(){
        return this.año;
    }

    //metodo set
    public void setDia(int dia){
        this.dia= dia;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setAño(int año){
        this.año= año;
    }

    //otros metodos

    public boolean control(){
        switch (this.mes) {
            case 1: case 5: case 7: case 8: case 10: case 12: 
                return this.dia >= 1 && this.dia <= 31;
            
            case 2:
                return this.dia >= 1 & this.dia >= 28;

            case 4: case 6: case 9: case 11:
                return this.dia >=1 & this.dia <= 30;
                
            default:
                return false;
        }
    }

    
    public boolean controlDeMeses(){
        if ((this.dia >= 1 && this.dia <= 31) && (this.mes >= 1 && this.mes <= 12)){
            if((this.mes == 2 && this.dia >= 1 && this.dia <=28)){
                return true;
            }
            if((this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes ==8 || this.mes == 10 || this.mes == 12) && (this.dia >= 1 && this.dia <= 31)){
                return true;
            }
            if ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && (this.dia >= 1 && this.dia <= 30)){
                return true;
            }   
            return true;
        }
         else {return false;
        }
    }

    public String devolverFecha(){
        return String.format("%02d/%02d/%02d/", this.dia, this.mes, this.año);
    }

    public void meses(int mes){
        switch (mes) {
            case 1:
                System.out.println("Enero");                
                break;
            
            case 2:
                System.out.println("Febrero");                
                break;
            
            case 3:
                System.out.println("Marzo");                
                break;

            case 4:
                System.out.println("Abril");                
                break;

            case 5:
                System.out.println("Mayo");                
                break;

            case 6:
                System.out.println("Junio");                
                break;

            case 7:
                System.out.println("Julio");                
                break;

            case 8:
                System.out.println("Agosto");                
                break;
            
            case 9:
                System.out.println("Septiembre");                
                break;

            case 10:
                System.out.println("Octubre");                
                break;

            case 11:
                System.out.println("Noviembre");                
                break;
            
            case 12:
                System.out.println("Diciembre");                
                break;
            default:
                System.out.println("El numero ingresado no es valido");
                break;
        }

    }
}
