package ejexamen;
import javax.swing.*;


public class Ejercicio2 {

    public float a;
    public float b;
    
    public void leerDatos() {
        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el valor de a"));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el valor de b"));
    }
    
    public void calcularX() {
        double x;
        x = (a+b*b)/5;
        
        JOptionPane.showMessageDialog(null, "El valor de x es: " + x);
    }
}
