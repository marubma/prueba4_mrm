public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 28;
        cliente.nombre = "Marta";
        cliente.telefono = 0;
        cliente.credito = "True";
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 40;
        trabajador.nombre = "Paco";
        trabajador.telefono = 0;
        trabajador.salario = 40000;
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    String credito;
}

class Trabajador extends Persona {
    int salario;
}