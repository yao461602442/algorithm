package 编程之美;

public class 重建二叉树 {
	
	static class Node{
		Node left = null;
		Node right = null;
		char data;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String pre = "abcdef";
		String mid = "fedcba";
		System.out.println(pre.charAt(4));
		Node head = buildTree(pre, 0, pre.length()-1, mid, 0, mid.length()-1);
		System.out.println("sdfsdf");
	}
	
	public static Node buildTree(String pre, int preStart, int preEnd, 
			String middle, int midStart, int midEnd)
	{
		if(preStart <= preEnd)
		{
			Node root = new Node();
			root.data = pre.charAt(preStart);
			int index = middle.indexOf(root.data);
			int leftLen = index-midStart;
			int rightLen = midEnd-index;
			root.left = buildTree(pre, preStart+1, preStart+leftLen, middle, midStart, index-1);
			root.right = buildTree(pre, preStart+1+leftLen, preStart+leftLen+rightLen, middle, index+1, midEnd);
			return root;
		}
		return null;
	}
}
