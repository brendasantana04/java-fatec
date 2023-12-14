package SistemaTransito;

//imports
import javax.swing.JOptionPane;
import java.io.*;

public class Metodos {
	
    //metodos redirecionados
	
		//opção 1 - cadastrar estatisticas
    	public Estatistica[ ] fcadastrarestatistica (Estatistica[ ] est) throws IOException {
    		
    		int i;
    		
    		String fileName = "ArquivoEstatistica.txt";
    		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
    		
    		for (i = 0; i < 10 ; i++){est[i] = new Estatistica();}

    		for (i = 0; i < 10; i++)
    		{
    			//gravando codigo da cidade
    			est[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da cidade?"));
        		gravar.write(Integer.toString(est[i].CodigoCidade));
        		gravar.newLine();
        		
        		//gravando nome da cidade
    			est[i].NomeCidade = JOptionPane.showInputDialog("Qual o nome da cidade?");
    			gravar.write(est[i].NomeCidade);
    			gravar.newLine();
    			
    			//gravando numero de acidentes
        		est[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Qual foi a quantidade de acidentes?"));
        		gravar.write(Integer.toString(est[i].QtdAcidentes));
        		gravar.newLine();
        	}
    		
    		//finalizando gravações
    		System.out.println("Gravação feita com sucesso");
    		gravar.close();
    		return est;
    	}
    		
		//opção 2 - consultar por quantidade de acidentes (maior que 100 e menor que 500)
		public void pqtdacidentes (Estatistica [ ] est) throws IOException{
			
			int i;
			
			//lendo o arquivo
			String fileName = "ArquivoEstatistica.txt";
			BufferedReader ler = new BufferedReader(new FileReader(fileName));
			
			for (i = 0; i < 10; i++) {est[i] = new Estatistica();}
			
			for (i = 0; i < 10; i++)
			{
				est[i].CodigoCidade = Integer.parseInt(ler.readLine());
				est[i].NomeCidade = ler.readLine();
				est[i].QtdAcidentes = Integer.parseInt(ler.readLine());
				
			}
			
			//verificando condição 100 < qtd acidentes < 500 e imprimindo no console
			for (i = 0; i < 10; i++) {
				if (est[i].QtdAcidentes > 100 && est[i].QtdAcidentes < 500)
				{
					System.out.println("Cidade: " + est[i].NomeCidade + ";\nQuantidade de acidentes: " + est[i].QtdAcidentes);
					System.out.println("");
				}
			}
			
			//imprimindo no console
			//for (i = 0; i < 3; i++)
			//{
			//	System.out.println("Cidade: " + est[i].NomeCidade + ";\nQuantidade de acidentes: " + est[i].QtdAcidentes);
			//	System.out.println("");
			//}
			
			ler.close();
			
		}
		
		//opção 3 - consultar por maior e menor numero de acidentes
		public void pmaiormenor (Estatistica [ ] est) throws IOException{
			
			int i;
			int maior = 0;
			int menor = 0;
			
			//lendo o arquivo
			String fileName = "ArquivoEstatistica.txt";
			BufferedReader ler = new BufferedReader(new FileReader(fileName));
			
			for (i = 0; i < 10; i++) {est[i] = new Estatistica();}
			
			for (i = 0; i < 10; i++)
			{
				est[i].CodigoCidade = Integer.parseInt(ler.readLine());
				est[i].NomeCidade = ler.readLine();
				est[i].QtdAcidentes = Integer.parseInt(ler.readLine());
			}	
			
			//achando a cidade com maior e menor numero de acidentes a partir de um loop
			for (i = 0; i < 10; i++)
			{
				if (maior == 0){
					maior = i;
				} else if (est[i].QtdAcidentes > est[maior].QtdAcidentes){
					maior = i;
				}
				
				if (menor == 0){
					menor = i;
				} else if (est[i].QtdAcidentes < est[menor].QtdAcidentes){
					menor = i;
				}
			}
			
			System.out.println("A cidade com o maior número de acidentes é " + est[maior].NomeCidade +", "
					+ "com " + est[maior].QtdAcidentes + " acidentes, e a com o menor número de acidentes "
					+ "é " + est[menor].NomeCidade + ", com " + est[menor].QtdAcidentes + " acidentes.");
			
			ler.close();
		}
		
		//opção 4 - as 10 cidades com quantidade de acidentes acima da media
		public void pacima (Estatistica [ ] est) throws IOException{
			
			int media = 0;
			int media2 = 0;
			int i;
			
			//lendo o arquivo
			String fileName = "ArquivoEstatistica.txt";
			BufferedReader ler = new BufferedReader(new FileReader(fileName));
			
			for (i =0; i < 10; i++) {est[i] = new Estatistica();}
			for (i = 0; i < 10; i++)
			{
				est[i].CodigoCidade = Integer.parseInt(ler.readLine());
				est[i].NomeCidade = ler.readLine();
				est[i].QtdAcidentes = Integer.parseInt(ler.readLine());
			}
			
			//calculando media de acidentes de todas as cidades
			for (i = 0; i < 10; i++)
			{
				media = media + est[i].QtdAcidentes;
				media2 = media / 10;
			}
			
			System.out.println("A média é " + media2);
			System.out.println("As cidades que estão acima da média são:");
			System.out.println(" ");
			
			//exibindo as cidades que são acima da media
			for (i = 0; i < 10; i ++) 
			{
				if (est[i].QtdAcidentes > media2)
				{
					System.out.println(est[i].NomeCidade + "; " + est[i].QtdAcidentes);
					System.out.println("");
				}
			}
			ler.close();
		}
}
