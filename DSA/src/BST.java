
public class BST {
	class Node{
		int key;
		Node left,right;
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;
	BST(){
		root = null;
	}
	
	void Insert(int key) {
		root = insertRec(root,key);
	}

	Node insertRec(Node root, int key) {
		// TODO Auto-generated method stub
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.key) {
			root.left = insertRec(root.left,key);
		}else if(key > root.key) {
			root.right = insertRec(root.right,key);
		}
		return root;
	}
	
	void inOrder() {
		inOrderRec(root);
	}

	void inOrderRec(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();
		tree.Insert(50);
		tree.Insert(30);
		tree.Insert(20);
		tree.Insert(40);
		tree.Insert(70);
		tree.Insert(60);
		tree.Insert(80);
		
		tree.inOrder();
	}
}
