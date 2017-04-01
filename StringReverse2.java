
import java.util.Arrays;

public class StringReverse2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[]{"a", "b", "c", "d", "e"};
		reverse(str);
		System.out.println(Arrays.toString(str));
	}
	
	public static void reverse(String[] str) {
		int i=0, j=str.length-1;
		
		while (i<j) {
			swap(str, i, j);
			i++;
			j--;
		}
		
	}

	public static void swap(String[] str, int i, int j) {
		String temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
}