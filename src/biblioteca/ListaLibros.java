package biblioteca;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaLibros {
    private ArrayList<Libro> libros = new ArrayList<>();

    // recibe el libro por parametro y confirma la adicion del mismo, si no es nulo ni tiene stock 0.

    @NonNull
    public void ingresarLibro(Libro libro) {
        if (libro.getStock() != 0) {
            System.out.println("Está a punto de agregar el libro: " + libro + " ¿Está seguro? Y/N");
            Scanner scanner = new Scanner(System.in);
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("Y")) {
                libros.add(libro);
                System.out.println("Se agregó el libro: " + libro + " correctamente a la lista de libros!");
            } else {
                System.out.println("El libro no fue agregado a la lista.");
            }
        } else {
            System.out.println("No se puede agregar un libro con stock 0.");
        }
    }

    // devuelve la lista de libros.

    public void getLista() {
        if (libros.isEmpty()) {
            System.out.println("La lista de libros está vacía.");
        } else {
            for (Libro libro : libros) {
                System.out.println("### " + libro.toString());
            }
        }
    }
}
