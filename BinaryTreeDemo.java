import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class BinaryTreeDemo {
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		
		System.out.println(getNodeNumRec(n1));
		System.out.println(getNodeNum(n1));
		
		System.out.println(getDepthRec(n1));
		System.out.println(getDepth(n1));
		
		System.out.println(" - - - - - - -");
		preorderTraversalRec(n1);
		preorderTraversal(n1);
	}
	
	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val = x;	
		}
	}
	
	public static int getNodeNumRec(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return getNodeNumRec(root.left) + getNodeNumRec(root.right) + 1;
		}
	}
	
	public static int getNodeNum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int count = 1;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode cur = q.remove();
			if (cur.left != null) {
				q.add(cur.left);
				count++;
			}
			
			if (cur.right != null) {
				q.add(cur.right);
				count++;
			}
		}
		
		return count;
	}
	
	
	public static int getDepthRec(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		return Math.max(getDepthRec(root.left), getDepthRec(root.right)) + 1;
	}
	
	
	public static int getDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int depth = 0;
		int currentLevelNodes = 1;
		int nextLevelNodes = 0;
		
		LinkedList<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		while (!q.isEmpty()) {
			TreeNode cur = q.remove();
			currentLevelNodes--;
			if (cur.left != null) {
				q.add(cur.left);
				nextLevelNodes++;
			}
			
			if (cur.right != null) {
				q.add(cur.right);
				nextLevelNodes++;
			}
			
			if (currentLevelNodes == 0) {
				depth++;
				currentLevelNodes = nextLevelNodes;
				nextLevelNodes = 0;
			}
		}
		
		return depth;
	}
	
	public static void preorderTraversalRec(TreeNode root) {
		if (root == null) {
			return;
		}
		
		System.out.println(root.val);
		preorderTraversalRec(root.left);
		preorderTraversalRec(root.right);
	}
	
	public static void preorderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		
		while(!s.isEmpty()) {
			TreeNode cur = s.pop();
			System.out.print(cur.val + " ");
			
			if (cur.right != null) {
				s.push(cur.right);
			}
			
			if (cur.left != null) {
				s.push(cur.left);
			}
		}
	}
	
	
	
}
