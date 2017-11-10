

public class Node<T extends Comparable<T>> {
		Node<T> next;
		T data;
		
		public Node(T newEntry)
		{
            this.data  = newEntry;
        }
		
	}
