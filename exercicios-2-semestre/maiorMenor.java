/**
 *
 * @author BRENDA
 * 
 * Receba 100 números inteiros reais. Verifique e mostre o maior e o menor 
valor. Obs.: somente valores positivos.
 */

import javax.swing.JOptionPane;

public class maiorMenor {

    public static void main(String args[]) {
        
        int maior = 0, menor = 0, i, v;
        
        for (i = 1; i <= 10; i++){
            v = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
            if (maior == 0 && menor == 0){
                maior = v;
                menor = v;
            } else if (v >= maior){
                maior = v;
            }else if (v <= menor){
                menor = v;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O menor valor é "+ menor +" e o maior número é "+ maior);
    }
}
