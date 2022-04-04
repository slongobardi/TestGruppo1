
public class Impiegato extends Dipendente implements Comparable<Impiegato> {
    private int annoAssunzione;
    
    public int getAnnoAssunzione() {
    	return this.annoAssunzione;
    }
    
    public void setAnnoAssunzione(int annoAssunzione) {
    	this.annoAssunzione = annoAssunzione;
    }
	@Override
	public int compareTo(Impiegato daConfrontare) {
		
		return annoAssunzione - daConfrontare.getAnnoAssunzione();
	}

}
