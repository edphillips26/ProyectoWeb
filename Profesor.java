/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoengrupo;

/**
 *
 * @author usuario
 */
public class Profesor {
    String Nombre;
    String Apellido;
    int Identificacion;
    String Contraseña;
    String Estado_Civil;
    String Departamento;
    int Añodeingreso;
    
    
    public Profesor (String Nombre, String Apellido, int Identificacion,
            String Contraseña, String Estado_Civil, String Departamento, int Añodeingreso) {
        this.Nombre= Nombre;
        this.Apellido= Apellido;
        this.Identificacion= Identificacion;
        this.Contraseña= Contraseña;
        this.Estado_Civil= Estado_Civil;
        this.Departamento= Departamento;
        this.Añodeingreso= Añodeingreso;
    }
}
