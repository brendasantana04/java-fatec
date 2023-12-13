/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author HAINE
 */

import javax.swing.JOptionPane;

public class salarioLiquido {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int ht = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas você trabalha?"));
        int vh = Integer.parseInt(JOptionPane.showInputDialog("Quanto você ganha por hora?"));
        int pd = Integer.parseInt(JOptionPane.showInputDialog("Qual o percentual de desconto?"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Quantos descendentes?"));
        
        double sb = (ht * vh);
        double sl = ((sb - pd) + (d * 100));
        
        JOptionPane.showMessageDialog(null, "O salário líquido é de "+ sl +" reais diários");
    }
}
