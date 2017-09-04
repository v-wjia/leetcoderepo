
public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbstairs(6));
	}
	
	public static int climbstairs(int n) {
		if ( n ==1 ) return 1;
		int[] cache = new int[n+1];		 
		cache[1] = 1;
		cache[2] = 2;
		for (int i=3; i<=n; i++) {
			cache[i] = cache[i-1] + cache[i-2];
		}
		return cache[n];
	}
}
