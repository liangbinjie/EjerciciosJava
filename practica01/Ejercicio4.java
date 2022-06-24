package ejexamen;
import javax.swing.*;

public class Ejercicio4 {

    
    public static String EstadoEnCuotas() {
        char estado;
        String actual = "";
        estado = JOptionPane.showInputDialog(null, "Digite el estado de la persona\n(H)Honorario\n(E)Exento\n(A)Al dia\n(M)Moroso").toUpperCase().charAt(0);
        
        if (estado == "H".charAt(0)) {
            actual = "Honorario";
        }
        if (estado == "E".charAt(0)) {
            actual = "Exento";
        }
        if (estado == "A".charAt(0)) {
            actual = "Al dia";
        }
        if (estado == "M".charAt(0)) {
            actual = "Moroso";
        }
        
        return actual;
    }
}
