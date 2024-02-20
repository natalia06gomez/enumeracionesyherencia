package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario{
		
	
        public enum Camiseta
	{
		GEF, POLO,NAUTICA, NINGUNO
	}
        private Camiseta camiseta;
        
	
	public Camisa(Camiseta pCamiseta, Talla pTalla, double pPrecio)
	{
		super(pTalla, pPrecio);
                camiseta = pCamiseta;
	}
	
	public String toString()
	{
		return "Camisa "+camiseta.name() + " Talla "+talla + "($ "+precio + ")";
	}

}
