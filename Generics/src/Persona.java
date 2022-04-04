import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

class Persona
{
	private String nome;
	private String cognome;
	private String matricola;
	
	Persona(String nome, String cognome, String matricola)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
	}
	
	void setMatricola(String matricola)
	{
		this.matricola=matricola;
	}
	
	String getMatricola()
	{
		return matricola;
	}
	
	@Override
	public String toString() {
		return cognome+" "+nome+" - "+matricola;
	}

	public static void main(String[] args) {
		PriorityQueue<String> coda=new PriorityQueue<>();
		coda.add("Carlo");
		coda.add("Silvio");
		coda.add("Ada");
		coda.add("Beatrice");
		
		
		/*System.out.println(coda.element());
		System.out.println(coda.element());
		System.out.println(coda.element());
		System.out.println(coda.element());*/
		
		System.out.println(coda.remove());
		System.out.println(coda.remove());
		System.out.println(coda.remove());
		System.out.println(coda.remove());
		System.out.println(coda.peek());
		
	}
}
