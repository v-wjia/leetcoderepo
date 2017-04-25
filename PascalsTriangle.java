import java.util.*;

public class PascalsTriangle {
	public static void main(String[] args) {
		System.out.println(generateTriangle(5));
	}
	
	public static List<List<Integer>> generateTriangle(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		if (numRows <=0) return triangle;
		
		List<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		triangle.add(firstRow);
		
		for (int i=1; i<numRows; i++) {
			List<Integer> lastRow = triangle.get(i-1);
			List<Integer> row = new ArrayList<Integer>();
			
			for (int j=0; j<i+1; j++) {
				if (j==0 || j==i) {
					row.add(1);
				} else {
					row.add(lastRow.get(j-1) + lastRow.get(j));
				}
			}
			triangle.add(row);
		}
		
		return triangle;
	}
}
