/**
 * 
 */

/**
 * @author v-wjia
 *
 */
class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'a', 'b', 'c', 'd'};
		reverse(str);
		System.out.print(str);
	}
	
	public static void reverse(char[] str) {
		int i=0, j=str.length-1;
		
		while (i<j) {
			swap(str, i, j);
			i++;
			j--;
		}
		
	}

	public static void swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
}
