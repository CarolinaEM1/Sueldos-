/*
 Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000.
 */
package ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldo, suma=0;
        int contador=0;
        
        for (int i=1; i<=10;i++){
            sueldo= Float.parseFloat(JOptionPane.showInputDialog("Digite su sueldo:"));
            
            if (sueldo > 1000) { // Si el sueldo supera a 1000
                contador++; // Aumentamos uno a contador
            }
            
            suma += sueldo; //Suma iterativa de sueldos 
        }
        
        System.out.println("La suma de todos los sueldos es: $"+suma);
        System.out.println("Cantidad de sueldos mayores a 1000: "+contador);
                
    }
    
}
