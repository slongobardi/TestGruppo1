
public class EsempioGenericsJolly {

	private static void usaContenitore(Progetto<?> contenitore)
	{
		System.out.println(contenitore);
	}
	
	public static void main(String[] args) {
		
		Progetto<Impiegato> progetto=new Progetto<>();
		
		usaContenitore(progetto);
		
		Progetto<Dipendente> progetto2=new Progetto<>();
		
		usaContenitore(progetto2);
		
		usaContenitore(new Progetto<Dirigente>());
		usaContenitore(new Progetto<Impiegato>());
		
		
	}

}
