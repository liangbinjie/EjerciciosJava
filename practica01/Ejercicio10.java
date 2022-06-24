package ejexamen;
import javax.swing.*;


public class Ejercicio10 {
    public int par = 0;
    public int impar = 0;
    public int mayor = 0;
    public int menor;
    
    public void leerNumeros() {
        int numero;
        for (int i=1; i<=10;i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "(" + i + ") " + "Digite un numero"));
            
            if (numero%2==0) {
                par += 1;
            } else {
                impar += 1;
            }
            
            if (numero>=mayor) {
                mayor = numero;
            }
            
            if (numero<=menor || i == 1) {
                menor = numero;
            }
            
        }
    }
    
    public void resultados() {
        JOptionPane.showMessageDialog(null, "Cantidad de pares: " + par
            + "\nCantidad de impares: " + impar 
            + "\nNumero mayor: " + mayor + "\nNumero menor: " + menor);
    }
}
