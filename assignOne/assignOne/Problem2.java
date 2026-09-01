package assignOne;

public class Problem2 {

	public static void main(String[] args) {
		System.out.printf("%s%n", intToString(12345));

	}
	
	public static String intToString(int value) {
		if (value == 0) {
			return "0";
		}
		
		boolean negative = false;
		
		if (value < 0) {
			negative = true;
			value = -value;
		}
		
		String result = "";
		
		while (value > 0) {
			int digit = value % 10;
			
			if (digit == 0) {
				result = "0" + result;
				
			} else if (digit == 1) {
				result = "1" + result;
			} else if (digit == 2) {
				result = "2" + result;
			} else if (digit == 3) {
				result = "3" + result;
		    } else if (digit == 4) {
				result = "4" + result;
		    } else if (digit == 5) {
				result = "5" + result;
		    } else if (digit == 6) {
				result = "6" + result;
		    } else if (digit == 7) {
				result = "7" + result;
		    } else if (digit == 8) {
				result = "8" + result;
		    } else if (digit == 9) {
				result = "9" + result;
		    }
			
			value  = value / 10;
	}
		if (negative) {
			result = "-" + result;
		}
		
		return result;
	}

}
