
package SistemaTransito;

import javax.swing.JOptionPane;
import java.io.IOException;

public class ClassePrincipal {

	public static void main(String args[]) throws IOException {

		// chamando a ClasseMetodos pra ca (instancia)
		Metodos cm = new Metodos();
		Estatistica[] est = new Estatistica[10];
		int cod = 0;

		while (cod != 9) {
			cod = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATISTICA \n"
																+ "Estatísticas de acidentes em 2020 \n" 
																+ "1 - Cadastro Estatística \n"
																+ "2 - Consulta por quantidade de acidentes  \n" 
																+ "3 - Consulta por estatísticas de acidentes \n"
																+ "4 - Acidentes acima da média das 10 cidades\n" 
																+ "9 - Finaliza \n"));

			// redirecionando
			switch (cod) {
			case 1: JOptionPane.showMessageDialog(null, "Você selecionou: Cadastro Estatística");
				est = cm.fcadastrarestatistica(est);
				break;
			case 2: JOptionPane.showMessageDialog(null, "Você selecionou: Consulta por quantidade de acidentes");
				cm.pqtdacidentes(est);
				break; 
			case 3: JOptionPane.showMessageDialog(null, "Você selecionou: Consulta por estatísticas de acidentes");
				cm.pmaiormenor(est);
				break;
			case 4: JOptionPane.showMessageDialog(null, "Você selecionou: Acidentes acima da média das 10 cidades");
				cm.pacima(est);
				break;
			case 9: JOptionPane.showMessageDialog(null, "Você finalizou o programa"); break;
			default: JOptionPane.showMessageDialog(null, "Insira uma opção válida!"); break;
			}
		}
	}
}
