package usuario;

import lombok.Data;

@Data

public abstract class Usuario {
    private Integer id;
    private String dni;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String contrasena;
    private Rol rol;


    public Usuario(Integer id, String dni, String nombre, String apellido, String correoElectronico, String contrasena, Rol rol) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.rol = rol;
    }
}