
public class PlusOne {
	public static void main(String[] args) {
		int[] digits = new int[]{2,4,5,3,8,9};
		int[] res = generateNewDigits(digits);
		for (int k=0; k<digits.length; k++) {
			
			System.out.println(res[k]);
		}
	}
	
	public static int[] generateNewDigits(int[] digits) {
		if (digits.length == 0 || digits == null) 
			return null;
		
		int count = digits.length;
		
		while (count>0) {
			digits[count-1] = digits[count-1] +1;
			if(digits[count-1]>9) {
				digits[count-1] = 0;
			} else {
				return digits;
			}
			
			count--;
		}
		
		int[] result = new int[digits.length+1];
		result[0] = 1;
		for (int i=1; i<digits.length; i++) {
			result[i] = digits[i-1];
		}
		return result;
	}
}
