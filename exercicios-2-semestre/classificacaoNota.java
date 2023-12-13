/**
 *
 * @author BRENDA
 * 
 * Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”
b. Se a média for >= 3,0 ou menor que 6,0 exibir “EXAME”
c. Se a média for menor que 3,0 exibir “RETIDO” 
 */

import javax.swing.JOptionPane;

public class classificacaoNota {

    public static void main(String args[]) {
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a primeira nota do aluno"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a segunda nota do aluno"));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Insira a terceira nota do aluno"));
        float n4 = Float.parseFloat(JOptionPane.showInputDialog("Insira a quarta nota do aluno"));
                
        float media = (n1 + n2 + n3 + n4) / 4;
        
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "APROVADO");
        } else if(media >= 3){
            JOptionPane.showMessageDialog(null, "EXAME");
        } else{
            JOptionPane.showMessageDialog(null, "RETIDO");
        }
    }
}
