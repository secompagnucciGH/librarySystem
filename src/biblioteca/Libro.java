package biblioteca;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

// se puede pasar el libro por parametros directamente, se puede mejorar eso.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int ID;
    private String titulo;
    private String autor;
    private Categoria categoria;
    private String ISBN;
    private Double precio;
    private int stock;

    public void registrarLibro(ListaLibros listarLibro) {

        // consulta sobre datos del libro.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el TÍTULO del libro: ");
        this.titulo = scanner.nextLine();
        System.out.println("Ingrese el AUTOR del libro: ");
        this.autor = scanner.nextLine();

        System.out.println("Ingrese la CATEGORÍA del libro (por ejemplo, FICCION, NO_FICCION, OTRO): ");
        try {
            this.categoria = Categoria.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Categoría no válida. Se establecerá a 'OTRO'.");
            this.categoria = Categoria.OTRO;
        }

        System.out.println("Ingrese el ISBN del libro: ");
        this.ISBN = scanner.nextLine();
        System.out.println("Ingrese el PRECIO del libro: ");
        this.precio = scanner.nextDouble();
        System.out.println("Ingrese la cantidad en STOCK del libro: ");
        this.stock = scanner.nextInt();

        // agregar libro a la lista.

        listarLibro.ingresarLibro(this);

    }

    @Override
    public String toString() {
        return "Libro(ID= " + this.getID() +
                ", titulo= " + this.getTitulo() +
                ", autor= " + this.getAutor() +
                ", categoria= " + this.getCategoria() +
                ", ISBN= " + this.getISBN() +
                ", precio= $ " + this.getPrecio() +
                ", stock= " + this.getStock() + ")";
    }
}
