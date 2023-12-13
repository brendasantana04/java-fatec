/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author HAINE
 * 
 * Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
do menor
 */

import javax.swing.JOptionPane;

public class verificaMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
       int val1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
       int val2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
      
       if (val1 > val2){
           
           int mul = (val1 % val2);
           
           if (mul == 0){
            JOptionPane.showMessageDialog(null, "O número "+ val1 +" é multiplo do "+ val2);
           } else {
            JOptionPane.showMessageDialog(null, "O número "+ val1 +" não é multiplo do "+ val2);
           }
       } else if (val2 > val1){
           
           int mul2 = (val2 % val1);
           
           if(mul2 == 0){
            JOptionPane.showMessageDialog(null, "O número "+ val2 +" é multiplo do "+ val1);
  
           } else {
            JOptionPane.showMessageDialog(null, "O número "+ val2 +" não é multiplo do "+ val1);
           }
       }
    }
}
