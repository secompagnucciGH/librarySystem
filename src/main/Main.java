package main;

import biblioteca.Categoria;
import biblioteca.Libro;
import usuario.Administrador;
import usuario.Empleado;
import usuario.Cliente;
import usuario.Rol;

public class Main {

    public static void main(String[] args) {
        //  testeo inicial sobre usuarios y campos.

        System.out.println("\n" + "testeo inicial sobre usuarios y campos. ##################################################################" + "\n");

            Administrador administrador1 = new Administrador(
                1,
                "43234111",
                "Sebastian",
                "Compagnucci",
                "secomp@gmail.com",
                "pass",
                    Rol.ADMINISTRADOR);
        System.out.println("PRUEBA ADMIN #1: " + administrador1.toString());

            Empleado empleado1 = new Empleado(
                2,
                "4444444",
                "Roberto",
                "Empleado",
                "empleado@gmail.com",
                "pass2",
                    Rol.EMPLEADO);

        System.out.println("PRUEBA EMPLEADO #1: " + empleado1.toString());

            Cliente cliente1 = new Cliente(
                3,
                "00000000",
                "Juan",
                "Cliente",
                "cliente@gmail.com",
                "PASS3",
                    Rol.CLIENTE);
        System.out.println("PRUEBA CLIENTE #1: " + cliente1.toString() + "\n");

        //  testeo inicial sobre libros y campos

        System.out.println("testeo inicial sobre libros y campos. ##################################################################" + "\n");
            Libro libro1 = new Libro(
                1,
                "LibroFicticio1",
                "SebaComp",
                    Categoria.SinCategoria,
                "10#E20",
                2000.00,
                20);
        System.out.println("PRUEBA LIBRO #1: " + libro1.toString());
    }
}
