import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] numbers = {2,6,7,15};
		int target = 9;
		
		int[] res = t.twoSum(numbers, target);
		for (int i=0; i<res.length; i++) {
			System.out.print(i == res.length-1 ? res[i] : res[i] + ",");
		}
		
	}
	
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<numbers.length; map.put(numbers[i], ++i)) {
			if (map.containsKey(target-numbers[i])) {
				return new int[]{map.get(target-numbers[i]), i+1};
			}
		}
		
		return null;
	}
}
