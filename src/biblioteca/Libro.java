package biblioteca;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Libro {
    private int ID;
    private String titulo;
    private String autor;
    private Categoria categoria;
    private String ISBN;
    private Double precio;
    private int stock;



        @Override
    public String toString() {
        long var10000 = this.getID();
        return "Libro(ID= " + var10000 + ", titulo= " + this.getTitulo() + ", autor= " + this.getAutor() + ", categoria= " + this.getCategoria() + ", ISBN= " + this.getISBN() + ", precio= $ " + this.getPrecio() + ", stock= " + this.getStock() + ")";
    }
}
