package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	
	LLNode<E> head;
	LLNode<E> tail;

	int size;
	

	/** Create a new empty LinkedList */
	public MyLinkedList() {
    size = 0;
    head = new LLNode<E>(null);
    tail = new LLNode<E>(null);
    head.next = tail;
    tail.prev = head;
		
		// TODO: Implement this method
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		
		if (element == null ) {
			throw new IndexOutOfBoundsException("index is out of bounds");	
		}
		
		
		LLNode<E>newNode=new LLNode(element);
		newNode.prev = tail.prev;
		newNode.next = tail.prev.next;
		tail.prev.next = newNode;
		tail.prev = newNode;		
		size++;
		// TODO: Implement this method
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 	{
		
        int i = 0;
		
		LLNode<E> dummy;
		dummy = head;// test this is the orginal get
		//dummy=head;
		System.out.println(dummy.data);		
		
		if ( size == 0 ) {
						
			System.out.println("it failed at 1st gate");		
			throw new IndexOutOfBoundsException("index is out of bounds");					
		}	
		
		
		if ( index < 0 || index >= size ) {
			System.out.println("it failed at 2nd gate");		
			throw new IndexOutOfBoundsException("index is out of bounds");
			
		}	
		
		
		
		if (index == 0) {		
			System.out.println(dummy.next.data + "this is when index is at 0");	
			return dummy.next.data;
			
		}
		
		dummy = head.next;
		
			while (i < index ) {
			
	       dummy = dummy.next;
			System.out.println(dummy.data);	
			i++;
		}
	    System.out.println(dummy.data);		
		return dummy.data;	
	
		// TODO: Implement this method.
		
		}
    	
	

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		
		
		if (element == null ) {
			throw new IndexOutOfBoundsException("index is out of bounds");	
		}
		
		LLNode<E> dummy;
		
		dummy = head.next;
		int i = 0;
		while (i < index + 1 ) {
		
       dummy = dummy.next;
		System.out.println(dummy.data);	
		i++;
	}
    System.out.println(dummy.data);		
		
				
		LLNode<E>newNode=new LLNode(element);
		newNode.prev = dummy.prev;
		newNode.next = dummy.prev.next;
		dummy.prev.next = newNode;
		dummy.prev = newNode;		
		size++;
		
		// TODO: Implement this method
	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		LLNode<E> deleting;
		LLNode<E> placeholder;
		
		placeholder = head;
		deleting = head;

		int i = 0;
		int d = index + 2;
		int N = 0;
		LLNode<E> holder = placeholder;
		 if (index == 0) 
	        { 
			    
	            head = placeholder.next.next; 
	            holder = placeholder.next;
	            size--;
	            System.out.println(head.data + " this is the new value for the start of the linked list");// Change head 
	            System.out.println(holder.data + " this is the value thats being removed");
	            return holder.data; 
	        } 
		 
		while (i <= index - 1) {
			placeholder = placeholder.next;
			holder = holder.next;
			System.out.println(placeholder.data + " this is the value 1 before the deleted value");
			i++;
		}
		
		while (N < d) {
			deleting = deleting.next;
		
			System.out.println(deleting.data + " this is the value 1 after the deleted value");
			N++;
		}
		
		
		holder = holder.next;
		placeholder.prev = deleting.prev.prev;
		placeholder.next = deleting;
		System.out.println(holder.data + " this is the value getting deleted");
		System.out.println(placeholder.data +  " this is the value before the value that got deleted");
		size--;
//		deleting.prev.next = placeholder;
//		deleting.prev = placeholder;	
			
	
		// TODO: Implement this method
		return holder.data;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		return null;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
