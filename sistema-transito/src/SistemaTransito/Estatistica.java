package SistemaTransito;

class Estatistica 
{
    int CodigoCidade;
    String NomeCidade;
    int QtdAcidentes;
    
    //metodo construtor
    Estatistica()
    {
    	this("","", 0);
    }
    
    Estatistica(int CodigoCidadeEstatistica, String NomeCidadeEstatistica, int QtdAcidentesEstatistica){
    	CodigoCidade = CodigoCidadeEstatistica;
    	NomeCidade = NomeCidadeEstatistica;
    	QtdAcidentes = QtdAcidentesEstatistica;
    }

	public Estatistica(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
}

