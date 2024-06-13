package usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Usuario {
    private Integer id;
    private String dni;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String contrasena;
    private Rol rol;
}