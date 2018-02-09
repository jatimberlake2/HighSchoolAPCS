package Spring;
import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		ArrayList<String> namelist = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String setter = "";
		while (setter != "STOP") {
			System.out.println("Enter the name you wish to find and press enter, or enter STOP to finish entering names:");
			setter = scan.next();
			if (setter.equals("STOP")) break;
			namelist.add(setter);
		}
		System.out.println("The current namelist is: \n" + namelist);
		namelist = SelectionSort(namelist);
		System.out.println("The sorted namelist is: \n" + namelist);
	}

	private static ArrayList<String> SelectionSort(ArrayList<String> namelist) {
		int holdposition = 0;
		for (int i = 0; i < namelist.size(); i++) {
			String nextsmallest = namelist.get(i);
			for (int j = i; j < namelist.size(); j++) {
				if (namelist.get(j).compareTo(nextsmallest) < 0)  {
					nextsmallest = namelist.get(j);
					holdposition = j;
				}
			}
			namelist.set(holdposition, namelist.get(i));
			namelist.set(i, nextsmallest);
			System.out.println(i + ": " + namelist);
		}
		return namelist;
	}
	
	
	

		
}	

			
	

