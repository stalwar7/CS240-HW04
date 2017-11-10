
public class SortedList<T> extends SingleLinkedList<T> implements SortedListInterface<T>{
	
	private Node head;
	private int size;
	
	public SortedList()
	{
		head = null;
		size = -1;
	}
	public boolean isEmpty()
	{ 
		return (size == -1); 
	}
	public void add(int index, T newEntry)
	{
		Node newNode = new Node(newEntry);

		if (head == null)
		{
			head = newNode;
		}
		else
		{
			Node after = head.next;
			Node before = head;
			while (after != null)
			{
				before = after;
				after = after.next;
			}
			newNode.next = before.next;
			before.next = newNode;
		}

	}
		
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	public int size()
	{
		return size;
	}
	
	
	
	
	public class Node
	{
		public T data;
		public Node next;
		
		public Node(T d)
		{
			data = d;
			next = null;
		}
	}

}
