import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] numbers = {2,7,11,15};
		int target = 9;
		
		int[] res = t.twoSum(numbers, target);
		for (int i=0; i<res.length; i++) {
			System.out.print(i == res.length-1 ? res[i] : res[i] + ",");
		}
		
	}
	
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<numbers.length; i++) {
			map.put(numbers[i], i);
		}
		
		for(int i=0; i<numbers.length; i++) {
			int newTarget = target - numbers[i];
			if(map.containsKey(newTarget) && i != map.get(newTarget)) {
				return new int[]{i+1, map.get(newTarget)+1};
			}
		}
		
		return null;
	}
}
