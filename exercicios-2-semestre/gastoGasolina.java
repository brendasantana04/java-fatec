/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author HAINE
 */

import javax.swing.JOptionPane;

public class gastoGasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int h = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas de viagem você fará?"));
        int v = Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade média?"));
        
        double l = ((h * v) / 12);
        
        JOptionPane.showMessageDialog(null, "Serão utilizados "+ l +" litros de gasolina");
    }
}
