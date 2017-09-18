
public class ValidPalindome {
	public static void main(String[] args) {
		System.out.println(isPalindome("A man, a plan, a canal; Panama"));
	}
	
	public static boolean isPalindome(String s) {
		//validation
		if (s.length() ==0 || s == null) return false;
		
		//function main body
		int start = 0;
		int end = s.length()-1;
		s = s.toLowerCase();
		while(start<end) {
			//move start
			while(start<=end && !isValid(s.charAt(start))) {
				start++;
			}
			
			if (start > end ) {
				return true;
			}
			
			while(start<=end && !isValid(s.charAt(end))) {
				end--;
			}
			
			if (s.charAt(start) != s.charAt(end)) {
				break;
			}
			start++;
			end--;
		}
		return end <=start;
	}
	
	private static boolean isValid(char c) {
		return Character.isLetterOrDigit(c);
	}
}
