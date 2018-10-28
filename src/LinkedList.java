
import java.util.Scanner;

public class LinkedList{
	private listElement leHead;
	private listElement leTail;
	private listElement le;
	int counter;

	public static void main(String[] args)
	// TODO Auto-generated method stub
	{

		LinkedList single=new LinkedList();	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Linked List program:");
		System.out.println("If you want to exit enter: yes ");
		System.out.println("yes");
		String action=" ";

		while(!action.equals("yes"))
		{
			
			System.out.println(" ");
			System.out.println("Function to Perform");
			System.out.println("Add");
			System.out.println("Delete");
			System.out.println("Retrieve");
			System.out.println("Print From :");
			System.out.println("Head");
			System.out.println("Tail");
			action = input.nextLine();

			if (action.equals("add"))
			{
				System.out.println("Enter number: ");
				
				int val = Integer.parseInt(input.nextLine());
				listElement leNew= new listElement();
				leNew.setData(val);
				single.addElement(leNew);
			}
			else if (action.equals("delete"))//delete a node 
			{
				System.out.println("Delete at Position? ");
				int index = Integer.parseInt(input.nextLine());
				single.deleteElement(index);
			}
			else if (action.equals("retrieve"))
			{
				System.out.println("Position: ");
				int index = Integer.parseInt(input.nextLine());
				System.out.println(single.getElement(index).getData());
			}
			else if (action.equals("print"))
			{
					single.print_head();
			}
			else if (action.equals("yes"))
			{
				break;
			}
		}
	}
	
	public void addElement(listElement leAdd)
	{
		if (leHead==null){
		leHead=leAdd;
		leTail=leAdd;
		}else 
		{
			leTail.setNext(leAdd);
			leTail=leAdd;
		} 
	}
	public listElement getElement(int index) // find the element one by one using for loop and return it
	{
		if (index!= 0)
		{
			le=leHead;
			for(int i = 1;le!=null && i<=index; i++ )
			{
				le=le.getNext();
			}
			return le;
		}
		else
		{
			return null;
		}
	}

	public listElement deleteElement(int index) 
	{
		listElement lePrev= new listElement();
		if (index>0 && leHead!=null)
		{
			le=leHead;
			for(int i = 1; le!=null && i<index;i++)
			{
				lePrev=le;
				le=le.getNext();	
			}
			if (lePrev==null)//if the previous element or the element was null
			{
				leHead=leHead.getNext();
				le=leHead;
			}
			else if (le!=null)
			{
				if (le.getNext()==null) 
				{
					lePrev.setNext(null);
				} 
				else 
				{
					lePrev.setNext(le.getNext());
				}
				le=leHead;
			}
		}
		return lePrev;
	}
	
	public void print_tail()
	{
		if(leHead!=null)
		{
			printTail(leHead);
		}
	}

	public void printTail(listElement element)
	{
		if(element.getNext()!=null)
		{
			printTail(element.getNext());
		}
		System.out.println(element.getData());
	}

	
	 public void print_head()
	 {
		 le=leHead;
		 while (le!=null) 
		 {
			 System.out.println(le.getData());
			 le=le.getNext();
		}
	 }
}