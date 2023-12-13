/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author BRENDA
 * 
 * Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
duração (minutos). Calcule e mostre a velocidade média em km/h
 */
import javax.swing.JOptionPane;

public class velocidadeMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
         float ext = Float.parseFloat(JOptionPane.showInputDialog("Insira o tamanho do circuito (em metros)"));
         float tmp = Float.parseFloat(JOptionPane.showInputDialog("Insira o tempo em minutos que durou a corrida"));
         float vol = Float.parseFloat(JOptionPane.showInputDialog("Insira o número de voltas"));
         
        /** vm = s / t **/
        
        float vm = ((vol * ext) / tmp);
        
        JOptionPane.showMessageDialog(null, "A velocidade média equivale a "+ vm +"KM/H");
    }
}
