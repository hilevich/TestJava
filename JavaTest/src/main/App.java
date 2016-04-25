package main;


import java.util.ArrayList;
import java.util.Scanner;



public class App {


	
	public static void main(String[] args) {
		
		ArrayList<FactoryAddNew> arraylistfactory = new ArrayList<>(); 
		
		Factory fa1 = new Factory(3232, 4343, 54);
		
		Factory2 fa2 =new Factory2(3232, 4343, 54, 54, 32);
		
		arraylistfactory.add(new FactoryAddNew(fa1, null));
		
		
		arraylistfactory.add(new FactoryAddNew(null, fa2));
		
		DoSomething ds = new DoSomething();
		
		System.out.println("enter what you want");
		System.out.println("1 - add new robot ");
		System.out.println("2 - see the list");
		System.out.println("3 - exit");
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag){
			String vale = sc.nextLine();
		switch (vale) {
		case "1":{
			System.out.println("you selected add new robot");
			System.out.println("enter what type u want create 1 or 2 ");
			
			String tip = sc.nextLine();
			
			
			if(tip.equalsIgnoreCase("1")){
			
			arraylistfactory.add(new FactoryAddNew(ds.getRobot(),null));
			System.out.println("selected next choise");
			}
			if(tip.equalsIgnoreCase("2")){
				arraylistfactory.add(new FactoryAddNew(ds.getRobot(),null));
				System.out.println("selected next choise");
			}
			break;
		}
		
		case "2":{
			System.out.println("you selected remove robot");
			
			arraylistfactory.remove(ds.getRobot());
			System.out.println("selected next choise");
			break;
		}
		
		case "3":{
			flag =false;
			break;
		}
		

		
		}
		}
		
		
		
		
		
		
	}
	
	
}
