package eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class fourQuestion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Task 1 - Find the minimum price in 'Xyz Travels'
		
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		double minpriceinXyz =busList.stream()
				.filter(e -> e.getProviderName().equals("Xyz Travels"))
				.map(e -> e.getCost()).min(Double::compare).get();
		System.out.println(minpriceinXyz);
		
		
		//Task 2 - Calculate total and print bill.
				//          Item Name          Price    Qty.    Line Total
				//          Line Total = Price * Qty.
				//          Bill Total = Total of Line Total + 5% tax;
				//          Items needs to be sorted based on Item Name.
				System.out.println("Enter Quantity for bus: ");
				int Qty1=Integer.parseInt(sc.nextLine());
				int Qty2=Integer.parseInt(sc.nextLine());
				int Qty3=Integer.parseInt(sc.nextLine());
				int Qty4=Integer.parseInt(sc.nextLine());
				int Qty5=Integer.parseInt(sc.nextLine());
				int Qty6=Integer.parseInt(sc.nextLine());
				System.out.println("------------------------------------------------");
				System.out.println("  Item Name       Price     Qty      Line Total ");
				System.out.println("------------------------------------------------");
				
				busList.stream()
				.map(e -> e.getId())
				.collect(Collectors.toList())
		         .forEach(e->System.out.println("   "+e));
		busList.stream()
		        .map(e->e.getCost()).collect(Collectors.toList())
		        .forEach(e->System.out.println("                 "+e));
		
		System.out.println("------------------------------------------------");
		
		
		//Task 3 - allMatch(), anyMatch(), distinct()
		
		boolean answer=busList.stream()
				.map(e ->e.getId())
				.allMatch(n -> n % 5==0); //.map(e->e.getProviderName()).allMatch(str->Character.isUpperCase(str.charAt(0)));
		System.out.println(answer);
				
		boolean answer1 = busList.stream()
		        .map(e->e.getId())
		        .anyMatch(n -> n % 5==0);
		System.out.println(answer1);
				
	    busList.stream().map(e ->e.getRating()).distinct().forEach(System.out::println);
				
		// Task 4 - Convert the Stream to Map.  
	   // Map<Integer,busList> userstreamtomap =
	   //		Arrays.asList(1,2,3,4,5,6)
		//	.stream().collect(Collectors.toMap());
		    


	}

}
