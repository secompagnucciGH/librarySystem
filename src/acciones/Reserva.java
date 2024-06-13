package acciones;

import biblioteca.Libro;
import lombok.Data;
import usuario.Usuario;
import java.util.Date;
import java.util.Scanner;

@Data
public class Reserva {
    private int id;
    private Libro libro;
    private Usuario usuario;
    private Date fechaRes;
    private Date fechaExp;
    private Estado estado;


    public void gestionarReserva() {
        System.out.println("Ingrese el nombre del libro que desea reservar: ");
        Scanner scanner = new Scanner(System.in);
        String libroGestionado = scanner.next();
    }

    private void gestionarDisponibilidad(String libro) {
        // verificar si el libro está disponible con el Estado del libro especifico.
    }
}