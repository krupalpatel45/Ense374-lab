
public class listElement {
	public listElement next;
	//private ListEl
	private int data;
	
	public listElement()
	{
		this.next = null;
		this.data = 0;
		
	}
	
	public void setNext(listElement le)
	{
		this.next=le;
	}
	public listElement getNext()
	{
		return this.next;
	}
	public void setData(int data)
	{
		this.data = data;
	}

	public int getData()
	{
		return this.data;
	}
}