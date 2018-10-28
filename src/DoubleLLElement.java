
public class DoubleLLElement { //Making of A double linked list node 
	private DoubleLLElement previous;
	private DoubleLLElement next;
	
	private int data;
	
	public DoubleLLElement() //initializing 
	{
		this.data=0;
		this.next=null;
		this.previous=null;
	}
	public void setData(int data) //set node = data
	{
		this.data=data;
	}
	public int getData()
	{
		return this.data;
	}
	public void setNext(DoubleLLElement le) // element pointer next
	{
		this.next=le;
	}
	public DoubleLLElement getNext() //returns the next pointer
	{
		return this.next;
	}
	public void setPrevious(DoubleLLElement le) // assigning value to previous 
	{
		this.previous=le;
	}
	public DoubleLLElement getPrevious() // returns the previous pointer
	{
		return this.previous;
	}
}

