package trabajoengrupo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edten
 */
public class Estudiante {
    String Nombre;
    String Apellido;
    int Identificacion;
    String Contraseña;
    String Estado_Civil;
    String Cursos;
    
    public Estudiante(String Nombre, String Apellido, int Identificacion,
            String Contraseña, String Estado_Civil, String Cursos) {
        this.Nombre= Nombre;
        this.Apellido= Apellido;
        this.Identificacion= Identificacion;
        this.Contraseña= Contraseña;
        this.Estado_Civil= Estado_Civil;
        this.Cursos= Cursos;

    }
}
