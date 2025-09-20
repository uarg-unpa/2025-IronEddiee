package TrabajosPracticos.tp2part2.punto1;

public class tesPersona {
    public static void main(String[] args) {
        //Creamos el objeto persona con valores por defecto
        Persona persona1= new Persona();
        System.out.println(persona1);

        Persona persona2= new Persona("Mauro Leguizamon", 25, 42493571, 'l', 78.5, 1.68);

        //preguntamos si es mayor de edad
        if(persona2.esMayorDeEdad()== true){
            System.out.println(persona2.GetNombre() + " es mayor de edad.");
        }else{
            System.out.println(persona2.GetNombre() + "es menor de edad.");
        }

        //comprobamos el sexo
        if(persona2.comprobarSexo() == 'M'){
            System.out.println(persona2.GetNombre() + "Es masculino");
        }
        if(persona2.comprobarSexo() == 'F'){
            System.out.println(persona2.GetNombre() + "Es femenino");
        }
        if(persona2.comprobarSexo() != 'M' && persona2.comprobarSexo() != 'F'){
            System.out.println("Sexo Indefinido");
        }
        System.out.println(persona2);
    }
}
