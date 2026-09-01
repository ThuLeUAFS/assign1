package assignOne;

public class Problem1 {

	public static void main(String[] args) {
		System.out.printf("%d%n", stringToInt("12345"));

	}
	
	public static int stringToInt(String str) {
		int sign = 1;
		int start = 0;
		int result = 0;
		
		if (str.charAt(0) == '-') {
			sign = -1;
			start = 1;
		} else if (str.charAt(0)== '+') {
			start = 1;
		}
		
		for (int i = start; i < str.length(); i++) {
			char c = str.charAt(i);
			int digit = c - '0';
			result = result * 10 + digit;
		}
		
		
		return result * sign;
	}

}
