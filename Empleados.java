package trabajoengrupo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Empleados {
    String Nombre;
    String Apellido;
    int Identificacion;
    String Contraseña;
    String Estado_Civil;
    String Seccion;
    int Numerodespacho;
    int Añodeingreso;
    
    
    public Empleados (String Nombre, String Apellido, int Identificacion,
            String Contraseña, String Estado_Civil, String Seccion, int Numerodespacho, int Añodeingreso) {
        this.Nombre= Nombre;
        this.Apellido= Apellido;
        this.Identificacion= Identificacion;
        this.Contraseña= Contraseña;
        this.Estado_Civil= Estado_Civil;
        this.Seccion=Seccion;
        this.Numerodespacho= Numerodespacho;
        this.Añodeingreso= Añodeingreso;
    }
}
