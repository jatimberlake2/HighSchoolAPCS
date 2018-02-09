package Spring;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
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
		System.out.println("The current namelist is:  " + namelist);
		namelist = InsertionSort(namelist);
		System.out.println("The sorted namelist is:  " + namelist);
	}

	
	private static ArrayList<String> InsertionSort(ArrayList<String> namelist) {
	    
		for (int i = 1; i < namelist.size(); i++) {
	         String setter = namelist.get(i);
	         int j = i;
	         while (j > 0 && namelist.get(j - 1).compareTo(setter) > 0) {
	                  namelist.set(j, namelist.get(j - 1));
	                  j--;
	            }     
	            namelist.set(j, setter);
	            System.out.println(i +": " + namelist);
	      }
		
		return namelist;
	}
	
	
}
