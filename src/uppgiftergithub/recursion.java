package uppgiftergithub;

public class recursion {
	
	
	public static void main (String[] args){

		System.out.println(recur(5));
		
	}

	public static String recur(int num) {
		
		String Alphabet = "abcdefghijklmnopqrstuvtz";
		String str = "";
		
		if(num == 0) {
			return str;
		}
		
		else{
			return recur(num-1) + Alphabet.charAt(num-1) + recur(num-1);
		}
		
	}
	
	
}
