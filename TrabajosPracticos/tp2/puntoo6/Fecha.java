package TrabajosPracticos.tp2.puntoo6;

/*6. Una fecha se compone de 3 elementos: día, mes y año. Codificar la clase Fecha con los siguientes métodos:
a) Cuando se crea el objeto de la clase Fecha, los valores de día, mes y año deben ser válidos (es decir, una
fecha correcta). Si alguno es inválido, generar la fecha 01/01/2013.
b) Devolver el día; devolver el mes; devolver el año.
c) Cambiar el día; cambiar el mes; cambiar el año.
d) Obtener el nombre del mes de la fecha (ejemplo: si el mes es 1, obtener Enero).
e) Mostrar la fecha de la siguiente forma: 1 de Setiembre de 2012.  */

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha (int dd, int mm, int aa){
        if (validarMeses(dd, mm) == true){
            this.dia= dd;
            this.mes= mm;
            this.año= aa;
        }else{
            this.dia= 1;
            this.mes= 1;
            this.año= 2013;
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
        this.mes= mes;
    }
    public void setAño(int año){
        this.año= año;
    }

    //otros metodos

    public boolean validarMeses(int dia, int mes){
        switch (mes) {
            case 2:
                return dia <=28 && dia >=1;

            case 4: case 6: case 9: case 11:
                return dia <=30 && dia >= 1;

            default:
            return dia <= 31 && dia >=1;
        }
    }

    public String devolverFecha(){
        return String.format("%02d/%02d/%02d", this.dia, this.mes, this.año);
    }


    public void meses(int mes){
        switch (mes) {
            case 1:
                System.out.println(this.dia + " de Enero del " + this.año );                
                break;
            
            case 2:
                System.out.println(this.dia + " de Febrero del "+ this.año);                
                break;
            
            case 3:
                System.out.println(this.dia + " de Marzo del " + this.año);                
                break;

            case 4:
                System.out.println(this.dia + " de Abril del " + this.año);                
                break;

            case 5:
                System.out.println(this.dia + " de Mayo del " + this.año);                
                break;

            case 6:
                System.out.println(this.dia + " de Junio del " + this.año);                
                break;

            case 7:
                System.out.println(this.dia + " de Julio del " + this.año);                
                break;

            case 8:
                System.out.println(this.dia + " de Agosto del " + this.año);                
                break;
            
            case 9:
                System.out.println(this.dia + " de Septiembre del " + this.año);                
                break;

            case 10:
                System.out.println(this.dia + " de Octubre del " + this.año);                
                break;

            case 11:
                System.out.println(this.dia + " de Noviembre del " + this.año);                
                break;
            
            case 12:
                System.out.println(this.dia + " de Diciembre del " + this.año);                
                break;
            default:
                System.out.println("El numero ingresado no es valido");
                break;
        }
    }

    //Punto 7
    public boolean fechaMayor(int año1, int año2){
        if (año1 > año2){
            return true;
        }else{
            return false;
        }
    }
}
