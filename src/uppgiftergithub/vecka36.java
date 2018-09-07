package uppgiftergithub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class vecka36 {
 public static void main(String[] args){
	 
	 uppgift7();
	 
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
 	
 	
 		public class uppgift5{
 			
 			String name;
 			int age;
 			
 		public uppgift5(String name, int age){
 				
 				this.name = name;
 				this.age = age;
 				
 			}
 		
 
 		}
 		
 		public static void uppgift6(uppgift5 p1, uppgift5 p2) {
 			
 			if( p1.age > p2.age) {
 				System.out.println(p1.name);
 			}
 			
 			else if(p2.age > p1.age) {
 				System.out.println(p2.name);
 			}
 				
 			}
 		
 		public static int[] uppgift7(int... massa_tal){
 			
 			ArrayList<Integer> array = new ArrayList<Integer>();
 			
 			for (int i : massa_tal) {
 				array.add(i);
 			}
 			
 			Collections.sort(array);
 			
 			
 			for (int i = 0; i < massa_tal.length; i++) {
 				massa_tal[i] = array.get(i);
			}
 			
 			return massa_tal;
 		}
 			
 		}
 		
 		
 
 	



