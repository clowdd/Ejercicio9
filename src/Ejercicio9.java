public class Ejercicio9 {
    public static void main (String [] args) {

        //Propiedades Cliente
        Cliente cliente = new Cliente();
        cliente.edad = 26;
        cliente.nombre = "Alberto";
        cliente.telefono = 667889977;
        cliente.credito = 1000;

        System.out.println("Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito + "€");

        //Propiedades trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 23;
        trabajador.nombre = "Juan";
        trabajador.telefono = 675831167;
        trabajador.salario = 1300;

        System.out.println();
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario + "€");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}