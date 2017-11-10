
public class FixedArrayList<T> extends PriorityQueueLinked implements ListInterface<T>{
	private T[] array;
	private static final int DEFAULT_SIZE = 10;
	int size;
	
	@SuppressWarnings("unchecked")			//eclipse recommended
	public FixedArrayList()
	{
		array = (T[]) new Object[DEFAULT_SIZE];;
		size = 0;
	}
	public void add(T item) {
		if (array.length > DEFAULT_SIZE)
        {
        throw new IllegalStateException ("The array is full");
        }
		else
		{
			array[size+1] = item;
			size++;
		}
	}
	
	public void add(int position, T item) {
		
		  if (position < 0 || position > size())
		  {
		      throw new IndexOutOfBoundsException();
		  }
		  for (int i = array.length; i > position; i--)
		  {
			  array[i] = array[i - 1];
		      array[position] = item;
		  }
		  size++;
	}

	public T remove(int position) {
		if (position < 0 || position > size())
		  {
		      throw new IndexOutOfBoundsException();
		  }
		T temp = array[position];
		for (int i = position; i < array.length - 1; i++)
		{
		      array[i] = array[i + 1];
		}   
		size--;
		return temp;
	}

	public T view(int position) {
		
		return array[position];
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void clear() {
		for(int i = 0; i < array.length; i++)
		{
			array[i] = null;
		}
		
	}

	public boolean contains(T item) {
		boolean res = false;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == item)
				res = true;
		}
		return res;		
	}
	
	public int size() {
		return size;
		}

}
