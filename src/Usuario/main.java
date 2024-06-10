package Usuario;

public class main {

    public static void main(String[] args) {
        Administrador administrador1 = new Administrador(1, "43234194", "Sebastian", "Compagnucci", "secomp@gmail.com", "pass");

        System.out.println("PRUEBA ADMIN #1: " + administrador1.toString());

        Empleado empleado1 = new Empleado(2, "4444444", "Roberto", "Empleado", "empleado@gmail.com", "pass2");

        System.out.println("PRUEBA EMPLEADO #1: " + empleado1.toString());

         Cliente cliente1 = new Cliente (3, "00000000", "Juan", "Cliente", "cliente@gmail.com", "PASS3");

        System.out.println("PRUEBA CLIENTE #1: " + cliente1.toString());


    }
}
