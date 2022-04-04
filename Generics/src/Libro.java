
public class Libro {
	
	private String titolo;
	private String autore;
	
	public Libro(String titolo, String autore)
	{
		this.titolo=titolo;
		this.autore=autore;
	}
	
	@Override
	public String toString() {
		return titolo+" scritto da "+autore;
	}

}
