import java.util.ArrayList;
import java.util.List;
/**
 * Shell for a bianry search tree class.
 * @author scottm
 *
 */

public class BinarySearchTree<E extends Comparable<E>> {

	private BSTNode<E> root;
	private int size;

	public BinarySearchTree() {
		size = 0;
		root = null;
	}

	/**
	 *  Add the specified item to this Binary Search Tree if it is not already present.
	 *  <br>
	 *  pre: <tt>value</tt> != null<br>
	 *  post: Add value to this tree if not already present. Return true if this tree
	 *  changed as a result of this method call, false otherwise.
	 *  @param value the value to add to the tree
	 *  @return false if an item equivalent to value is already present
	 *  in the tree, return true if value is added to the tree and size() = old size() + 1
	 *  
	 *  Given in class
	 */
	public boolean add(E value) {
		if (value == null)
			throw new IllegalArgumentException("The given value is null.");
		int oldSize = size;
		root = addHelper(root, value);
		assert root != null;
		assert size == oldSize || size == oldSize + 1;
		return size != oldSize;
	}

	// Given in class
	private BSTNode<E> addHelper(BSTNode<E> n, E item) {
		if (n == null) {
			return treeIsEmpty(item);
		}
		else {
			int dir = item.compareTo(n.data);
			if (dir < 0)
				n.left = addHelper(n.left, item);
			else if (dir > 0)
				n.right = addHelper(n.right, item);
			return n;
		}
	}

	private BSTNode<E> treeIsEmpty(E item) {
		size++;
		return new BSTNode<E>(item);
	}

	/**
	 *  Remove a specified item from this Binaray Search Tree if it is present.
	 *  <br>
	 *  pre: <tt>value</tt> != null<br>
	 *  post: Remove value from the tree if present, return true if this tree
	 *  changed as a result of this method call, false otherwise.
	 *  @param value the value to remove from the tree if present
	 *  @return false if value was not present
	 *  returns true if value was present and size() = old size() - 1
	 *  
	 *  Given in class
	 */
	public boolean remove(E value) {
		if (value == null)
			throw new IllegalArgumentException("The given value is null.");
		int oldSize = size;
		root = removeHelp(root, value);
		assert oldSize == size || oldSize - 1 == size;
		return oldSize != size;
	}

	// Given in class
	private BSTNode<E> removeHelp(BSTNode<E> n, E item) {
		if (n !=  null) {
			int dir = item.compareTo(n.data);
			if (dir < 0)
				n.left = removeHelp(n.left, item);
			else if (dir > 0)
				n.right = removeHelp(n.right, item);
			else {
				size--;
				if (n.left == null && n.right == null)
					n = null;
				else if (n.right == null)
					n = n.left;
				else if (n.left == null)
					n = n.right;
				else {
					E minRightSubTree = getMin(n.right);
					n.data = minRightSubTree;
					n.right = removeHelp(n.right, minRightSubTree);
					size++;
				}
			}
		}
		return n;
	}

	// Given in class
	private E getMin(BSTNode<E> n) {
		while (n.left != null)
			n = n.left;
		return n.data;
	}

	/**
	 *  Check to see if the specified element is in this Binary Search Tree.
	 *  <br>
	 *  pre: <tt>value</tt> != null<br>
	 *  post: return true if value is present in tree, false otherwise
	 *  @param value the value to look for in the tree
	 *  @returns true if value is present in this tree, false otherwise
	 *  
	 *  Given in class
	 */
	public boolean isPresent(E value) {
		if (value == null)
			throw new IllegalArgumentException("The given value is null.");
		BSTNode<E> n = root;
		boolean found = false;
		while (n != null && !found) {
			int dir = value.compareTo(n.data);
			if (dir == 0)
				found = true;
			else if (dir < 0)
				n = n.left;
			else
				n = n.right;
		}
		return found;
	}


	/**
	 *  Return how many elements are in this Binary Search Tree.
	 *  <br>
	 *  pre: none<br>
	 *  post: return the number of items in this tree
	 *  @returns the number of items in this Binary Search Tree
	 */
	public int size() {
		return this.size;
	}

	/**
	 *  return the height of this Binary Search Tree.
	 *  <br>
	 *  pre: none<br>
	 *  post: return the height of this tree.
	 *  If the tree is empty return -1, otherwise return the
	 *  height of the tree
	 *  @returns the height of this tree or -1 if the tree is empty
	 *  
	 *  Given in class
	 */
	public int height() {
		return heightHelper(root);
	}

	// Given in class
	private int heightHelper(BSTNode<E> n) {
		if (n == null)
			return -1;
		else return 1 + Math.max(heightHelper(n.left), heightHelper(n.right));
	}

	/**
	 *  Return a list of all the elements in this Binary Search Tree.
	 *  <br>
	 *  pre: none<br>
	 *  post: return a List object with all data from the tree in ascending order. 
	 *  If the tree is empty return an empty List
	 *  @returns a List object with all data from the tree in sorted order
	 *  if the tree is empty return an empty List
	 */
	public List<E> getAll() {
		List<E> result = new ArrayList<E>();
		getAllHelp(result, root);
		return result;
	}

	private void getAllHelp(List<E> result, BSTNode<E> n) {
		if (n != null) { // Must be in this order: left, the current node, right
			getAllHelp(result, n.left);
			result.add(n.data);
			getAllHelp(result, n.right);
		}
	}

	/**
	 * return the maximum value in this binary search tree.
	 * <br>
	 * pre: <tt>size()</tt> > 0<br>
	 * post: return the largest value in this Binary Search Tree
	 * @return the maximum value in this tree
	 */
	public E max() {
		if (size <= 0)
			throw new IllegalStateException("The size of the tree is 0");
		return getMax(root);
	}

	private E getMax(BSTNode<E> n) { // Almost exactly like getMin, except use right
		while (n.right != null)
			n = n.right;
		return n.data;
	}

	/**
	 * return the minimum value in this binary search tree.
	 * <br>
	 * pre: <tt>size()</tt> > 0<br>
	 * post: return the smallest value in this Binary Search Tree
	 * @return the minimum value in this tree
	 */
	public E min() {
		if (size <= 0)
			throw new IllegalStateException("The size of the tree is 0");
		return getMin(root); // Uses method written for the remove method
	}

	/**
	 * An add method that implements the add algorithm iteratively instead of recursively.
	 * <br>pre: data != null
	 * <br>post: if data is not present add it to the tree, otherwise do nothing.
	 * @param data the item to be added to this tree
	 * @return true if data was not present before this call to add, false otherwise.
	 */

	public boolean iterativeAdd(E data) {
		if (data == null)
			throw new IllegalArgumentException("The given data is null.");
		if (this.isPresent(data))
			return false;
		if (root == null) {
			root = new BSTNode<E>(data);
			size++;
			return true;
		}
		boolean check = false;
		BSTNode<E> n = root;
		while (!check) {
			if (data.compareTo(n.data) < 0) {
				if (n.left == null) {
					n.setLeft(new BSTNode<E>(data));
					size++;
					check = true;
				}
				else
					n = n.getLeft();
			}
			else if (data.compareTo(n.data) > 0) {
				if (n.right == null) {
					n.setRight(new BSTNode<E>(data));
					size++;
					check = true;
				}
				else
					n = n.getRight();
			}
		}
		return true;
	}

	/**
	 * Return the "kth" element in this Binary Search Tree. If kth = 0 the 
	 * smallest value (minimum) is returned. If kth = 1 the second smallest value is
	 * returned, and so forth.
	 * <br>pre: 0 <= kth < size()
	 * @param kth indicates the rank of the element to get
	 * @return the kth value in this Bianry Search Tree
	 */

	//Gacky solution incoming:

	public E get(int kth) {
		if (kth < 0 || kth >= this.size)
			throw new IllegalArgumentException("The given number is not in bounds.");
		return traversal(kth, root, new int[] {0});
	}

	private E traversal(int kth, BSTNode<E> n, int[] count) {
		E result = null;
		if (n != null) {
			result = traversal(kth, n.left, count);
			if (result == null) {
				if(count[0] == kth)
					return n.data;
				else {
					count[0]++;
					result = traversal(kth, n.right, count);
				}
			}
		}
		return result;
	}


	/**
	 * Return a List with all values in this Binary Search Tree that are less than
	 * the parameter <tt>value</tt>.
	 * <tt>value</tt> != null<br>
	 * @param value the cutoff value
	 * @return a List with all values in this tree that are less than the parameter value. If there are
	 * no values in this tree less than value return an empty list. The elements of the list are in ascending order.
	 */
	public List<E> getAllLessThan(E value) {
		if (value == null)
			throw new IllegalArgumentException("The given value is null.");
		List<E> result = new ArrayList<E>();
		getLessHelper(result, root, value);
		return result;
	}

	private void getLessHelper(List<E> result, BSTNode<E> n, E value) {
		if (n != null) {
			getLessHelper(result, n.left, value);
			if (n.data.compareTo(value) < 0)
				result.add(n.data);
			getLessHelper(result, n.right, value);    		
		}
	}


	/**
	 * Return a List with all values in this Binary Search Tree that are greater than
	 * the parameter <tt>value</tt>.
	 * <tt>value</tt> != null<br>
	 * @param value the cutoff value
	 * @return a List with all values in this tree that are greater than the parameter value. If there are
	 * no values in this tree greater than value return an empty list. The elements of the list are in ascending order.
	 */
	public List<E> getAllGreaterThan(E value) {
		if (value == null)
			throw new IllegalArgumentException("The given value is null.");
		List<E> result = new ArrayList<E>();
		getGreaterHelper(result, root, value);
		return result;
	}

	private void getGreaterHelper(List<E> result, BSTNode<E> n, E value) {
		if (n != null) {
			getGreaterHelper(result, n.left, value);
			if (n.data.compareTo(value) > 0)
				result.add(n.data);
			getGreaterHelper(result, n.right, value);    		
		}
	}



	/**
	 * Find the number of nodes in this tree at the specified depth.
	 * <br>pre: none
	 * @param d The target depth.
	 * @return The number of nodes in this tree at a depth equal to
	 * the parameter d.
	 */
	public int numNodesAtDepth(int d) {
		return numNodesAtDepthHelper(root, d);
	}

	private int numNodesAtDepthHelper(BSTNode<E> n, int d) {
		if (d == 0) {
			if (n == null)
				return 0;
			else
				return 1;
		}
		int result = 0;
		if (n != null) {
			result += numNodesAtDepthHelper(n.left, d-1);
			result += numNodesAtDepthHelper(n.right, d-1);
		}
		return result;
	}

	/**
	 * Prints a vertical representation of this tree.
	 * The tree has been rotated counter clockwise 90
	 * degrees. The root is on the left. Each node is printed
	 * out on its own row. A node's children wil not necessarily
	 * be at the rows directly above and below a row. They will
	 * be indented three spaces from the parent. Nodes indented the
	 * same amount are at the same depth.
	 * pre: none
	 */
	public void printTree() {
		printTree(root, "");
	}

	private void printTree(BSTNode<E> n, String spaces) {
		if(n != null){
			printTree(n.getRight(), spaces + "  ");
			System.out.println(spaces + n.getData());
			printTree(n.getLeft(), spaces + "  ");
		}
	}

	private static class BSTNode<E extends Comparable<E>> {
		private E data;
		private BSTNode<E> left;
		private BSTNode<E> right;

		public BSTNode() {
			this(null);
		}

		public E getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		public BSTNode(E initValue) {
			this(null, initValue, null); 
		}

		public BSTNode(BSTNode<E> initLeft,
				E initValue,        
				BSTNode<E> initRight) {
			data = initValue; 
			left = initLeft; 
			right = initRight; 
		}

		public E getData() { 
			return data; 
		}

		public BSTNode<E> getLeft() { 
			return left;
		}

		public BSTNode<E> getRight() { 
			return right; 
		}

		public void setData(E theNewValue) { 
			data = theNewValue; 
		}

		public void setLeft(BSTNode<E> theNewLeft) { 
			left = theNewLeft; 
		}

		public void setRight(BSTNode<E> theNewRight) { 
			right = theNewRight; 
		}    
	}
}
