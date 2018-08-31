package uppgiftergithub;

public class vecka35 {
	
	public static void main(String[] args) {
		
		System.out.println(okänttal(1,2,3,4,123,123,123));
		
	}

	public static int okänttal(int... n) {
		
		int sum = 0;
		
		for (int i = 0; i < n.length; i++) {
			
			sum = sum + n[i];
		}
		
		
		return sum;
		
	}
	
	
}
