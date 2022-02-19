/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoengrupo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante X1 = new Estudiante("Marlon", "Moncrieffe", 117960947, "UFide", "Soltero/a", "Servidor/Cliente");
        Estudiante X2 = new Estudiante("Daniela", "Carreño", 123456789, "UFide", "Soltero/a", "Servidor/Cliente");
        Estudiante X3 = new Estudiante("Maria", "Gonzalez", 987654321, "UFide", "Soltero/a", "Servidor/Cliente");
        Estudiante X4 = new Estudiante("Edmond", "Phillips", 111111111, "UFide", "Soltero/a", "Servidor/Cliente");
        Profesor X5 = new Profesor("Roberto", "Alvarado", 222222222, "AdminFide", "Soltero/a", "Ingenierias", 2000);
        Profesor X6 = new Profesor("Alejandro", "Dominguez", 333333333, "AdminFide", "Soltero/a", "Ingenierias", 2000);
        Empleados X7 = new Empleados("Carlos", "Moreira", 444444444, "AdminFide2", "Soltero/a", "Biblioteca", 2345, 2000);
        RegistroDeUsuarios lista1 = new RegistroDeUsuarios();
        RegistroDeProfesor lista2 = new RegistroDeProfesor();
        RegistroDeEmpleado lista3 = new RegistroDeEmpleado();
        
        lista1.insert(X1);
        lista1.insert(X2);
        lista1.insert(X3);
        lista1.insert(X4);
        lista2.insert(X5);
        lista2.insert(X6);
        lista3.insert(X7);
        
        lista1.iniciarSesion(117960947, "UFide");
        lista2.iniciarSesion(222222222, "AdminFide");
        lista3.iniciarSesion(444444444, "AdminFide2");
        
    }
}
