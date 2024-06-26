package usuario;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Administrador extends Usuario {

    public Administrador(Integer id, String dni, String nombre, String apellido, String correoElectronico, String contrasena) {
        super(id, dni, nombre, apellido, correoElectronico, contrasena, Rol.ADMINISTRADOR);
    }
}
