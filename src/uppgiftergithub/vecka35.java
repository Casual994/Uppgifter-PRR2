package uppgiftergithub;

public class vecka35 {
	
	public static void main(String[] args) {
		
		System.out.println(bakl�nges("LOL"));
		
	}

	public static int ok�nttal(int... n) {
		
		int sum = 0;
		
		for (int i = 0; i < n.length; i++) {
			
			sum = sum + n[i];
		}
		
		
		return sum;
		
	}
	
	public static String bakl�nges(String string) {
		
		if(string.length() == 0){
			
			return string;
		}
		
		else{
			return bakl�nges(string.substring(1)) + string.charAt(0);
				
			}
	
	}
	
 
	
	
}
