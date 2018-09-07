package uppgiftergithub;

import java.util.Scanner;

public class vecka36 {

 public static void main(String[] args){
	 
	 uppgift4();
	 
 }
 	
 	public static int uppgift1(int... n){
 		
 		int sum = 0;
 		
 		for (int i = 0; i < n.length; i++) {
 			
 			sum = sum + n[i];
 			
		}
 		
		return sum;
 		
 	}
 	
 	public static String uppgift2(String string) {
 		
 		if(string.length() == 4) {
 			return string;
 		}
 		
 		else{
 			return uppgift2(string.substring(1)) + string.charAt(0);
 		}
 		
 	}
 
 	public static void uppgift3(){
 		
		Scanner input = new Scanner(System.in);
 		
 		double radie = 0;
 		double volym = 0;
 		
 		System.out.println("Vad är klottets radie?");
 		radie = input.nextDouble();
 		
 		volym = (4 * Math.PI * Math.pow(radie, 3)) / 3;
 		
 		System.out.println("Klottets volym är: " + volym + "cm^3");
 		
 	}
 	

 	
 	public static void uppgift4(){
 		
 		Scanner input = new Scanner(System.in);
 		
 		int första = input.nextInt();
 		int andra = input.nextInt();
 		
 		if( första < andra) {
 			System.out.println(första + " Är det minsta talet");
 		}
 		
 		else{
 			System.out.println(andra + " Är det minsta talet");
 			}
 		}
 	
 	
 		public class Person{
 			
 			String name;
 			int age;
 			
 		public Person(String name, int age){
 				
 				this.name = name;
 				this.age = age;
 				
 			}
 			
 		}
 		
 		
 	}
 	
 	



