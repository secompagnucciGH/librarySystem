package Usuario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public abstract class Usuario {
    private Integer id;
    private String dni;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String contrasena;
    private Rol rol;
}