public class PriorityQueueLinked implements Comparable<PriorityQueueLinked>
{
	private Node head;
	private Node tail;
	private int size;
	
	public PriorityQueueLinked()
	{
		head = null;
		tail = null;
		size = -1;
	}

	public void add(Comparable newEntry) {
		Node node = new Node(newEntry);
		if(isEmpty())
		{
			node.next = head;
			head = node;
			tail = node;
			size++;
		}
		else
		{
			Node temp = head;
			head = node;
			temp.next =  node;
			size++;
		}		
	}

	public Comparable remove() {
		if(isEmpty())
		{
			return null;
		}
		Node highest = null;
		Node current = head;
		while(current != null)
		{
			if(current.compareTo(current.next) > 0)
			{
				highest = current;
				current = current.next;
			}
		}
		size--;
		tail = tail.next;
		return highest.data;
	}

	public Comparable peek() {
		
		if(isEmpty())
		{
			return null;
		}
		Node highest = null;
		Node current = head;
		while(current != null)
		{
			if(current.compareTo(current.next) > 0)
			{
				highest = current;
				current = current.next;
			}
		}
		return highest.data;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int getSize() {
		return size;
	}
	
	public void clear() {
		if(!isEmpty())
		{
			while(head != null)
			{
				head.next = null;
			}
		}
		
	}
	
	public int compareTo(PriorityQueueLinked node) {
		
		return 0;
	}
	public class Node<T extends Comparable<T>> {
		Node<T> next;
		T data;
		
		public Node(T newEntry)
		{
            this.data  = newEntry;
        }
		public int compareTo(Node next2) {
			
			return 0;
		}
		
	}

}
