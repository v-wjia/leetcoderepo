
public class RemoveDuplicateElementFromSortedArray {
	public static void main(String[] args) {
		int[] list = new int[]{1,2,2,5,6,7,7,9,18};
		System.out.println(removeElement(list));
		
		int[] list2 = new int[]{1,2,2,2,5,6,7,7,9,9,9,18};
		System.out.println(removeElement2(list2));
	}
	
	public static int removeElement(int[] list) {
		if (list ==null || list.length == 0) return 0;
		int j=0;
		
		for (int i=1; i<list.length; i++) {
			if (list[j] != list[i]) {
				list[++j] = list[i];
			}
		}
		
		return j+1;
	}
	
	public static int removeElement2(int[] list) {
		if (list ==null || list.length == 0) return 0;
		int j=0;
		int num=0;
		
		for (int i=1; i<list.length; i++) {
			if (list[j] == list[i]) {
				num++;
				if(num<2) {
					list[++j] = list[i];
				}
				
			} else {
				list[++j] = list[i];
				num=0;
			}
		}
		return j+1;
	}
}
