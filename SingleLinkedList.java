
public class SingleLinkedList<T> implements ListInterface<T>{

	private Node head;
	private Node tail;
	private int size;
	
	public SingleLinkedList()
	{
		head = null;
		tail = null;
		size = -1;
	}
	public void add(T item) {
		if (isEmpty()) 
		{
			 head = new Node(item, head);

		} 
		else {
		      Node last = tail;
		      last.next = new Node(item, null);
		    }
	}

	
	public void add(int position, T item) {
		if (position == 0) 
		{
			head = new Node(item, head);
		    }
		else 
		{
		     Node prev = tail;
		      Node newNode = new Node(item, prev.next);
		      prev.next = newNode;
		    }
	}

	
	public T remove(int position) {
		T result = null;
	    if (position != -1) 
	    {
	    	if (position == 0) 
	    	{
	    	      result = head.data;
	    	      head = head.next;
	    	    } 
	    	else 
	    	{
	    	      Node prev = tail;
	    	      result = prev.next.data;
	    	      prev.next = prev.next.next;
	    	    }		
		}
	    return result;
}

	
	public T view(int position) {
		int index = 0;
	    Node result = head;
	    while (index < position) {
	      index++;
	      result = result.next;
	    }
	    return result.data;
	}

	
	public boolean isEmpty() {
		return size() == 0;
	}

	
	public void clear() {
		Node node= head;
	    while (node != null) {
	      node.data = null;
	      node = node.next;
	    }
	    head = null;		
	}
	
	public boolean contains(T item) {
		int index = 0;       
	    Node node = head;
	    while (node != null) {
	      if (node.data.equals(item)) {
	        return (index == 0);
	      }
	      node = node.next;
	      index++;
	    }
	    return false;
	  }
	

	
	public int size() {
		int numItems = 0;
	    Node node = head;
	    while (node != null) {
	      numItems++;
	      node = node.next;
	    }
	    numItems = size;
	    return numItems;
	}
	public class Node {
		Node next;
		T data;
		
		public Node(T newEntry, Node next)
		{
            this.data  = newEntry;
            this.next = next;
        }
		
	}

}
