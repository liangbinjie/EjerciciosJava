package ejexamen;
import javax.swing.*;

public class Ejercicio3 {
    public float monto;
    
    public float leerMonto() {
        monto = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el monto comprado"));
        return monto;
    }
    
    public void montoFinal(float monto) {
        double precioFinal = 0;
        if (monto >= 5000 && monto <= 10000) {
            precioFinal = monto - 700;
        }
        if (monto >= 11000 && monto <= 20000) {
            precioFinal = monto - 1500;
        }
        if (monto >= 21000 && monto <= 350000) {
            precioFinal = monto * 0.9;
        }
        if (monto > 35000) {
            precioFinal = monto * 0.88;
        }
        precioFinal = precioFinal * 1.13;
        
        JOptionPane.showMessageDialog(null, "El monto original es de $" + monto + "\nEl monto final, con IVA sera de $" + precioFinal);
    }
}
