package stack;

public class BinarySearchTree {
	public TreeNode addRecursive(TreeNode current, int value) {
	    if (current == null) {
	        return new TreeNode(value);
	    }
	 
	    if (value < current.value) {
	        current.left=addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right=addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	    return current;
	}
	
	public int height(TreeNode node) {

		int ln = 0,lr =0;
		if(node == null)
			return 0;
		if(node.left == null && node.right== null) 
			return 1;
		if(node.left != null) 
			ln = height(node.left) + 1;
		if(node.right != null) 
			lr = height(node.right) + 1;
		if(ln>lr)
			return ln;
		else
			return lr;
	}
	
	public boolean isbst(TreeNode node) {
		boolean lef=false,righ=false;
		if(node == null)
			return true;
		if(node.left != null && node.value < node.left.value)
			return false;
		if(node.right!= null && node.value > node.right.value )
			return false;
		if(node.left == null || (node.value>node.left.value)) 
			lef = isbst(node.left);
		if(node.right == null || (node.value<node.right.value))
			righ = isbst(node.right);
		 if((lef==true) && (righ==true))
			 return true;
		 else
			 return false;
	}
	
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		 
		TreeNode t1 = new TreeNode(6);
		t1.left = new TreeNode(4);
		t1.right = new TreeNode(18);
		t1.left.left = new TreeNode(2);
		t1.left.right = new TreeNode(5);
		
		/*TreeNode t1 = bt.addRecursive(null, 6);
		TreeNode t2 = bt.addRecursive(t1, 4);
		TreeNode t3 = bt.addRecursive(t1, 8);
		TreeNode t4 = bt.addRecursive(t1, 3);
		TreeNode t5 = bt.addRecursive(t1, 5);
		TreeNode t6 = bt.addRecursive(t1, 7);
		TreeNode t7 = bt.addRecursive(t1, 9);
		TreeNode t8 = bt.addRecursive(t1, 1);*/
		int height = bt.height(t1);
		System.out.println(height);
		boolean isbnst = bt.isbst(t1);
		System.out.println(isbnst);
	}
}
