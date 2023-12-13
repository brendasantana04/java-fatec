/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author HAINE
 */

import javax.swing.JOptionPane;

public class diferencaMaiorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primero valor"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor"));
                
        if (v1 > v2){
            int dif = (v1 - v2);
            JOptionPane.showMessageDialog(null,"A diferença entre esses valores é de " + dif +" números.");
        }else {
            int dif = (v2 - v1);
            JOptionPane.showMessageDialog(null,"A diferença entre esses valores é de "+ dif +" números.");
        }
    }
}
