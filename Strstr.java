
public class Strstr {
	public static void main(String[] args) {
		Strstr newstrstr = new Strstr();
		System.out.println(newstrstr.strstr("iamaboymama", "ma"));
	}
	
	public static String strstr(String haystack, String needle) {
		if (haystack == null || needle == null) {
			return null;
		}
		
		int lengthOfStack = haystack.length();
		int lengthOfNeedle = needle.length();
		
		if (lengthOfStack < lengthOfNeedle) {
			return null;
		}
		
		for (int i=0; i<=lengthOfStack-lengthOfNeedle; i++) {
			if (haystack.substring(i, i+lengthOfNeedle).equals(needle)) {
				return haystack.substring(i); 
			}
		}
		
		return null;
	}
}
