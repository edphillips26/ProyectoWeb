
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */int sumatoria;
       int contador;
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio4 eje = new Ejercicio4();
        eje.sumatoria = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quiere sumar: "));
        int total = eje.Sumarnumeros(0);
        System.out.println(total);
    }
    public int Sumarnumeros(int num){
        if(sumatoria==++contador){
          num = (int)(Math.random()*10);
          System.out.println(num);
          return num;
        }
        num = (int)(Math.random()*10);
        System.out.println(num);
        return num + Sumarnumeros(num);
    }
}
