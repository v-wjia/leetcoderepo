
public class RemoveElementFromArray {
	public static void main(String[] args) {
		RemoveElementFromArray r = new RemoveElementFromArray();
		int[] list = new int[] {1,2,2,3,2,4,5};
		System.out.print(r.removeElement(list, 2));
	}
	
	public int removeElement(int[] list, int element) {
		if (list.length == 0 || list == null)
			return 0;
		int i = 0;
		int j = list.length;
		
		while (i<j) {
			if (element == list[i]) {
				list[i] = list[j-1];
				j--;
			} else {
				i++;
			}
		}
		return j;
	}
}
