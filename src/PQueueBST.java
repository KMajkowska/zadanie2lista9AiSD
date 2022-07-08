
public class PQueueBST <T extends Comparable<T>> {
	
	Node<T> root;
	public PQueueBST()
	{
		root = null;
	}
	
	public void Reset()
	{
		root = null;
	}
	
	void inorder()
	 { 
		 inorderRec(root); 
	 }
	 
	void inorderRec(Node<T> node)
	{
	   if (node != null)
	   {
		   inorderRec(node.getLeftChild());
		   System.out.print(node.getKey()+ " ");
		   inorderRec(node.getRightChild());
	   }
	}
	public void put(T elem)
	{
		if(root == null)
				root = new Node<T>(elem);
		this.root = root.insert(root, elem);
	}
	
	
	public T getFirst()
	{
		return root.findFirst(root);
	}
	
	
	public Node<T> deleteFirst()
	{
		T maxValue = root.findFirst(root);
		return  root = root.Delete(root, maxValue);
	}
	
	
	
}
