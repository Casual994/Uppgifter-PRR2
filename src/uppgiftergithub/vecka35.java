package uppgiftergithub;

public class vecka35 {
	
	public static void main(String[] args) {
		
		System.out.println(baklänges("LOL"));
		
	}

	public static int okänttal(int... n) {
		
		int sum = 0;
		
		for (int i = 0; i < n.length; i++) {
			
			sum = sum + n[i];
		}
		
		
		return sum;
		
	}
	
	public static String baklänges(String string) {
		
		if(string.length() == 0){
			
			return string;
		}
		
		else{
			return baklänges(string.substring(1)) + string.charAt(0);
				
			}
	
	}
	
 
	
	
}
