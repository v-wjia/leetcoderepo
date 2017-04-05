
public class IntReverse {
	public static void main(String[] args) {
		IntReverse ir = new IntReverse();
		System.out.println(ir.reverse(123));
		System.out.println(ir.reverse(-123));
	}
	
	public int reverse(int x) {
		int out = 0;
		while(x != 0) {
			out = out*10 + x%10;
			x = x/10;
		}
		if(out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) {
			return 0;
		}
		return out;
	}
}
