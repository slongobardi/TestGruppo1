import java.util.Arrays;

public class EsempioGenerics01 {

	public static void main(String[] args) {
		
		Progetto<Impiegato> progetto=new Progetto<>();
		//Progetto<Dirigente> progetto1=new Progetto<>();
	//	Progetto<DirigenteCapo> progetto2=new Progetto<>();
		
		progetto.assegnaRisorsa(new Impiegato());
		
		progetto.avviaAttivita();
		
		ProgettoGrande<Impiegato, Dirigente> progettoGrande=new ProgettoGrande<>();
		progettoGrande.assegnaRisorsa(new Impiegato());
		progettoGrande.affidaProgetto(new Dirigente());
		progettoGrande.avviaAttivita();
		
		Impiegato imp1 = new Impiegato();
		imp1.setAnnoAssunzione(1999);
		
		Impiegato imp2 = new Impiegato();
		imp2.setAnnoAssunzione(2004);
		
		int confronto = imp1.compareTo(imp2);
				if(confronto ==0)
					System.out.println("Gli impiegati sono pari");
				else if(confronto < 0)
					System.out.println("Impiegato1 ha fatto più carriera di Impiegato2");
				else
					System.out.println("Impiegato2 ha fatto più carriera");
		
				Impiegato[] ufficio = {imp1,imp2};
				
				Arrays.sort(ufficio);
				for(Impiegato i:ufficio)
					System.out.println("Impiegato assunto nell'anno: "+i.getAnnoAssunzione());
				
				Dirigente d1 = new Dirigente();
				d1.setLivello(2);
				Dirigente d2 = new Dirigente()
;
				d2.setLivello(5);
				
				ConfrontoDirigenti confrontoDirigenti = new ConfrontoDirigenti();
				int risultato = confrontoDirigenti.compare(d1, d2);
				if(risultato == 0)
					System.out.println("I dirigenti hanno lo stesso livello");
				else if(risultato>0)
					System.out.println("Dirigente 1 ha il livello maggiore");
				else
					System.out.println("Dirigente 2 ha il livello maggiore");
	}

}
