package ejexamen;
import javax.swing.JOptionPane;


public class Ejercicio1 {
    public float ancho;
    public float largo;
    
    public void leerDatos() {
        ancho = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el ancho"));
        largo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el largo del rectangulo"));
    }
    
    public void calcularAreaRectangulo() {
        double area;
        area = ancho*largo;
        JOptionPane.showMessageDialog(null, "El area del rectangulo de " + ancho + " cm de ancho y " + largo + " cm de largo\ntiene un area de " + area + " m2");
    }
    
}
