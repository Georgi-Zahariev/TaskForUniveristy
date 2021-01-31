import java.util.ArrayList;
import java.util.Comparator;
import java.io.File;
import java.util.Scanner;

public class test {
	public static final boolean FILEINPUT = true;
	private static ArrayList<Client> Lst = new ArrayList<Client>();
	private static ArrayList<Client> LstHelp = new ArrayList<Client>();

	public static void main(String[] args) {
		Client c;
		Scanner inp;
		File file;

		if (FILEINPUT)
			file = new File("Client.txt");
		else
			file = null;
		try {
			if (FILEINPUT)
				inp = new Scanner(file);
			else
				inp = new Scanner(System.in);

			byte n = inp.nextByte(); // за последната задача
						
			
			inp.nextLine();

			do {
				c = new Client(inp);
				Lst.add(c);
				n--;
			} while (n > 0);
			int p = inp.nextInt(); // Posledno chislo za poslednata zadacha
			inp.close();

			System.out.println("Task 2");
			System.out.println();

			int br = 0;

			for (Client t : Lst) {
				br++;
				System.out.println("  " + br + ". " + t.toString());
			}

			System.out.println();
			System.out.println("Task 3");
			System.out.println();

			for (int i = 0; i < Lst.size(); i++) {
				if (Lst.get(i).setRating() == 2)
					LstHelp.add(Lst.get(i));
			}

			LstHelp.sort(new Cmp1());
			br = 0;
			for (Client t : LstHelp) {
				br++;
				System.out.println("  " + br + ". " + t.toString());
			}
          
		
			
		} catch (Exception e) {
			System.out.println("File not found");
		}

	}
	
}
