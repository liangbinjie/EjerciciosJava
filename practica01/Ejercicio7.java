package ejexamen;
import javax.swing.*;


public class Ejercicio7 {
    public String nombre;
    public String apellido;
    public String correo;
    
    public String leerDatos() {
        char primeraLetra;
        char segundaLetra;
        int largoApellido;
        
        
        nombre = JOptionPane.showInputDialog("Digite su nombre").toLowerCase();
        apellido = JOptionPane.showInputDialog(null, "Digite su apellido").toLowerCase();
        
        primeraLetra = nombre.charAt(0);
        segundaLetra = nombre.charAt(1);
        largoApellido = apellido.length();
        
        correo = primeraLetra+""+segundaLetra+""+largoApellido+apellido;
        System.out.println(primeraLetra+segundaLetra);
        return correo;
    }
}
