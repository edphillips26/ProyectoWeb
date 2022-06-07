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
public class RegistroDeEmpleado{
  private Node<Empleados> root=null;
     private Node<Empleados> end=null;
     public int length = 0;
    
    public void insert(Empleados empleados){
        Node<Empleados> temporal = new Node<>(empleados);
        if(root == null){
            root = temporal;
            end = temporal;
            root.setNext(root);
        }
        else{
            Node<Empleados> actual = root;
            
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
        Node<Empleados>actual = root;
        while(i<length){
            if(actual.getData().Identificacion==identificacion)
            {
               if(actual.getData().Contraseña.equals(contraseña)){
                  Empleado(identificacion);
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
        Node<Empleados>actual = root;
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
    
    public void cambioDespacho(int nuevodespacho, int identificacion){
    Node<Empleados>actual = root;
        int i=0;
        while(i<length){
            if(actual.getData().Identificacion==identificacion)
            {
                actual.getData().Numerodespacho=nuevodespacho;
                return;
            }
            actual=actual.getNext();
            i++;
        }
    
}
    public void cambioSeccion(String nuevaseccion, int identificacion){
    Node<Empleados>actual = root;
        int i=0;
        while(i<length){
            if(actual.getData().Identificacion==identificacion)
            {
                actual.getData().Seccion=nuevaseccion;
                return;
            }
            actual=actual.getNext();
            i++;
        }
    
}
    public void Imprimir(int identificacion){
       Node<Empleados>actual = root;
        int i=0;
        while(i<length){
            if(actual.getData().Identificacion==identificacion)
            {
                System.out.println("Nombre completo: "+actual.getData().Nombre+" "+actual.getData().Apellido+"\n"+
                                   "Identificacion: "+actual.getData().Identificacion+"\n"+
                                   "Estado Civil: "+actual.getData().Estado_Civil+"\n"+
                                   "Seccion: "+actual.getData().Seccion+"\n"+
                                   "Numero de despacho: "+actual.getData().Numerodespacho+"\n"+
                                   "Año de ingreso: "+actual.getData().Añodeingreso);
                return;
            }
            actual=actual.getNext();
            i++;
        } 
    }
    public void Empleado(int identificacion){
       boolean seguir = true;
       while(seguir){
           int eleccion=Integer.parseInt(JOptionPane.showInputDialog("Accion a realizar:\n"+
                                                                 "1) Cambiar estado civil\n"+
                                                                 "2) Cambiar de despacho\n"+
                                                                 "3) Cambiar de seccion\n"+
                                                                 "4) Imprimir informacion\n"+
                                                                 "5) Cerrar sesion\n"));
       switch(eleccion){
           case(1):
               String nuevoestado = JOptionPane.showInputDialog("Ingrese su estado civil:");
               cambiarEstadoCivil(nuevoestado, identificacion);
               break;
           case(2):
               int nuevoDespacho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de despacho:"));
               cambioDespacho(nuevoDespacho, identificacion);
               break;
           case(3):
               String nuevaseccion = JOptionPane.showInputDialog("Ingrese la nueva seccion en la que trabaja:");
               cambioSeccion(nuevaseccion, identificacion);
               break;
           case(4):
               Imprimir(identificacion);
               break;
           case(5):
               seguir = false;
               break;
           default:
               System.out.println("Ingrese una opcion valida");
               break;
       }
       }
    }
}
