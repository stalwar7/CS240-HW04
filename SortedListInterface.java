/*An Interface for ADT List * 
 * @author Sana Talwar
 * @version 1.0
 */
public interface SortedListInterface<T> {
	
	/**
	   * @return element at index
	   * @param int index 
	   */
	public T get(int index);
	
	/**
	   * adds a new entry to the list at index
	   * shifts other values
	   * @param T new Object 
	   * @param index - position to add at
	   */
	public void add(int index, T newEntry);
	
	/**
	   * adds a new entry to the list
	   * @return T/F
	   * @param T 
	   */
	public boolean add(T newEntry);
	  
	  /**
	   * @return int num of elements in list
	   */
	  public int size();

}
