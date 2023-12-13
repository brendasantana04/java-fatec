/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author HAINE
 */

import javax.swing.JOptionPane;

public class calculoHipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int cat1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do primeiro cateto?"));
        int cat2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do segundo cateto?"));
        
        // hipotenusa igual a raiz quadrada da soma do quadrado dos catetos
        
        double hip = Math.sqrt((cat1 * cat1) + (cat2 * cat2));
        
        JOptionPane.showMessageDialog(null, "A hipotenusa tem o valor de "+ hip);
    }
}
