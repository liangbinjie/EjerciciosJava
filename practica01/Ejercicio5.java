package ejexamen;
import javax.swing.*;

public class Ejercicio5 {
    public String nombre;
    public float salarioBruto;
    
    public void leerDatos() {
        nombre = JOptionPane.showInputDialog(null, "Digite su nombre");
        salarioBruto = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite su salario"));
    }
    
    public void Calcular() {
        double cDeduc = salarioBruto * 0.08;
        double bDeduc = salarioBruto * 0.01;
        double tDeduc = cDeduc + bDeduc;
        double sNeto = salarioBruto - tDeduc;
        
        JOptionPane.showMessageDialog(null, "Estimado empleado: " + nombre + ". En este mes su salario se desglosa asi:" + "\n\nSalario bruto: $" + salarioBruto
            + "\n8% CCSS: $" + cDeduc + "\n1% Banco Popular: $" + bDeduc
            + "\nTotal de deducciones: $" + tDeduc + "\nSalario neto: $" + sNeto);
        
    }
}
