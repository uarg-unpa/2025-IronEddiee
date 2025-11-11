package TrabajosPracticos.tp2.clasePracticas;

public class testPersona {
    public static void main(String[] args) {

        Domicilio dom1 = new Domicilio("Av. Rivadavia", 1234);
        Persona p1 = new Persona("Laura", 20, "12345678", 'M', 60.5, 1.65, dom1);
        System.out.println(p1);
        System.out.println(p1.infoDomicilio());
        
        if (p1.esMayorDeEdad() == true){    
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    }

