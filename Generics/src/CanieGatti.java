import java.util.*;
public class CanieGatti {
 public static void main(String[] args)
{
 ArrayList gatti = new ArrayList();
 for(int i = 0; i < 7; i++)
 gatti.add(new Gatto("nome"+i));
 gatti.add(new Cane(i));
 /* Eccezione rilevata a run time */
 for(int i = 0; i < gatti.size(); i++)
 ((Gatto)gatti.get(i)).id();
}
}