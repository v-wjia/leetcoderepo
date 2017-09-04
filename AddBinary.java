
public class AddBinary {
	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		String result = addBinary(a, b);
		System.out.println(result);
	}
	
	public static String addBinary(String a, String b) {
		int m = a.length();
		int n = b.length();
		int carry = 0;
		String res =  "";
		int i = 0;
		while(i < m || i<n) {
			int p = i<m ? a.charAt(m-1-i) - '0': 0;
			int q = i<n ? b.charAt(n-1-i) - '0': 0;
			int temp = p + q + carry;
			carry = temp /2;
			res = temp % 2 + res;
			i++;
		}
		return carry == 0 ? res : "1" +res;
		
	}

}
