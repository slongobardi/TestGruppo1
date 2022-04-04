import java.util.Comparator;

public class ConfrontoDirigenti implements Comparator<Dirigente>{

	@Override
	public int compare(Dirigente d1, Dirigente d2) {
		
		return d1.getLivello() - d2.getLivello();
	}

}
