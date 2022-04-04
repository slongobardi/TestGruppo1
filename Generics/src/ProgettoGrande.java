
public class ProgettoGrande<T, K> {
	
	private T risorsa;
	private K coordinatore;
	
	public void assegnaRisorsa(T risorsa)
	{
		this.risorsa=risorsa;
	}
	
	public void affidaProgetto(K coordinatore)
	{
		this.coordinatore=coordinatore;
	}
	
	public void avviaAttivita()
	{
		System.out.println("Attività avviata con la risorsa di tipo "+risorsa.getClass().getName()+" e coordinato da un "+coordinatore.getClass().getName());
	}

}
