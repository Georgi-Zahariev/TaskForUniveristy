import java.util.Comparator;

public class Cmp1 implements Comparator<Client> {

	@Override
	public int compare(Client a, Client b) {
		if( a.getCount() > b.getCount()) return -1;
		if( a.getCount() < b.getCount()) return 1;
		return a.getName().compareTo(b.getName());
		
	}

}
