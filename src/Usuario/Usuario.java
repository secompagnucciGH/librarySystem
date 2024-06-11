package usuario;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Data

public abstract class Usuario {
    private Integer id;
    private String dni;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String contrasena;
    private Rol rol;


    public Usuario(Integer id, String dni, String nombre, String apellido, String correoElectronico, String contrasena) {
    }
}
