
public class ContainWithMostWater {
	public static void main(String[] args) {
		int[] height = new int[]{2,5,7,1,9,11,8,16};
		int currentArea = getArea(height);
		System.out.print(currentArea);
		
	}
	
	public static int getArea(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}
		int low = 0;
		int high = height.length-1;
		int area = Math.abs(height[high] - height[low])*(high-low);
		int ans = 0;
		
		while (low < high) {
			ans = Math.max(ans, area);
			
			if (height[low] < height[high]) {
				low++;
			} else {
				high--;
			}
			
		}
		
		return ans;
	}
}
