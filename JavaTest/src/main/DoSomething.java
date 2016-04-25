package main;

import java.util.Scanner;



public class DoSomething {

	public Factory getRobot(){
		Scanner sc = new Scanner(System.in);
		double height = 0;
		double weight = 0;
		double speed = 0;
		try {
			System.out.println("enter new robot");
		System.out.println("enter weight");
		
		 weight = sc.nextDouble();
		
		System.out.println("enter speed");
		
		 speed =  sc.nextDouble();
		
		System.out.println("enter height");
		
		height = sc.nextDouble();
		}catch(Exception e){
			System.out.println("invalid input");
		}
		return new Factory( weight, speed,  height);
		
	}

	

	
	
}

