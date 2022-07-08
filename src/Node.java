
public class Node<T extends Comparable<T>> {
	
	T key;
	Node<T> leftChild;
	Node<T> rightChild;
	
	public Node() {}
	public Node(T key)
	{
		this.key = key;
		this.leftChild= null;
		this.rightChild = null;
	}
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public Node<T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}
	
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	
	
	public Node<T> insert(Node<T> node, T elem) 
	 {
		 if (node == null) 
		 {
			 node = new Node<T>(elem);
			 return node;
		 }
		 else if (node.getKey().compareTo(elem) == 1) {
		      
	        	node.setLeftChild(insert(node.getLeftChild(), elem));
	        } else if (node.getKey().compareTo(elem) == -1) {

	        	node.setRightChild(insert(node.getRightChild(), elem));
	        }
	        return node;
	}
	
	public T findFirst(Node<T> node)
	{
		if(node.getRightChild() == null)
			return (T)node.getKey();
		else 
			return findFirst(node.getRightChild());
		
	}
	
	public Node<T> Delete(Node<T> node, T key)
	{
		if(node == null)
			return null;
		if(key.compareTo((T)node.getKey()) == -1)
			node.setLeftChild(Delete(node.getLeftChild(), key));
		else if(key.compareTo((T)node.getKey()) == 1)
			node.setRightChild(Delete(node.getRightChild(), key));
		else
		{
			if(node.getLeftChild() == null)
				return node.getRightChild();
			else if(node.getRightChild() == null)
				return node.getLeftChild();
			else
			{
				node.setKey(MinKey(node.getRightChild()));
				node.setRightChild(Delete(node.getRightChild(), (T)node.getKey()));
			}
		}
		return node;
	}
	
	public T MinKey(Node<T> node)
	{
		T tmp = (T)node.getKey();
		while(node.getLeftChild() != null)
		{
			tmp = (T)node.getLeftChild().getKey();
			node = node.getLeftChild();
		}
		return tmp;
	}

}
