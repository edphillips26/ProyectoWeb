/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoengrupo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class RegistroDeProfesor{
     private Node<Profesor> root=null;
     private Node<Profesor> end=null;
     public int length = 0;
    
    public void insert(Profesor profesor){
        Node<Profesor> temporal = new Node<>(profesor);
        if(root == null){
            root = temporal;
            end = temporal;
            root.setNext(root);
        }
        else{
            Node<Profesor> actual = root;
            
            while(actual.getNext() != root){
                actual = actual.getNext();
            }
             actual.setNext(temporal);
             end = actual;
             actual.getNext().setNext(root);
        }
        length +=1;
    }
    public void iniciarSesion(int identificacion, String contraseña){
        int i = 0;
        Node<Profesor>actual = root;
        while(i<length){
            if(actual.getData().Identificacion==identificacion)
            {
               if(actual.getData().Contraseña.equals(contraseña)){
                  Profesor(identificacion);
                  return;
               }   
            }
            actual=actual.getNext();
            i++;
        }
      System.out.println("Usuario o contraseña incorrecto");
    }
    public void cambiarEstadoCivil(String nuevoestado, int identificacion){
        int i = 0;
        Node<Profesor>actual = root;
        while(i<length){
            if(actual.getData().Identificacion==identificacion)
            {
                actual.getData().Estado_Civil=nuevoestado;
                return;
            }
            actual=actual.getNext();
            i++;
        }
    }
    
    public void cambioDepartamento(String nuevodepartamento, int identificacion){
    Node<Profesor>actual = root;
        int i=0;
        while(i<length){
            if(actual.getData().Identificacion==identificacion)
            {
                actual.getData().Departamento=nuevodepartamento;
                return;
            }
            actual=actual.getNext();
            i++;
        }
    
}
    public void Imprimir(int identificacion){
       Node<Profesor>actual = root;
        int i=0;
        while(i<length){
            if(actual.getData().Identificacion==identificacion)
            {
                System.out.println("Nombre completo: "+actual.getData().Nombre+" "+actual.getData().Apellido+"\n"+
                                   "Identificacion: "+actual.getData().Identificacion+"\n"+
                                   "Estado Civil: "+actual.getData().Estado_Civil+"\n"+
                                   "Departamento: "+actual.getData().Departamento+"\n"+
                                   "Año de ingreso: "+actual.getData().Añodeingreso);
                return;
            }
            actual=actual.getNext();
            i++;
        } 
    }
    public void Profesor(int identificacion){
       boolean seguir = true;
       while(seguir){
           int eleccion=Integer.parseInt(JOptionPane.showInputDialog("Accion a realizar:\n"+
                                                                 "1) Cambiar estado civil\n"+
                                                                 "2) Cambiar departamento\n"+
                                                                 "3) Imprimir informacion\n"+
                                                                 "4) Cerrar sesion\n"));
       switch(eleccion){
           case(1):
               String nuevoestado = JOptionPane.showInputDialog("Ingrese su estado civil:");
               cambiarEstadoCivil(nuevoestado, identificacion);
               break;
           case(2):
               String nuevoDepartamento = JOptionPane.showInputDialog("Ingrese el nuevo departamento:");
               cambioDepartamento(nuevoDepartamento, identificacion);
               break;
           case(3):
               Imprimir(identificacion);
               break;
           case(4):
               seguir = false;
               break;
           default:
               System.out.println("Ingrese una opcion valida");
               break;
       }
       }
    }
}
