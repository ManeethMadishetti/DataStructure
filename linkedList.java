package javaa;

import java.util.ArrayList;

public class linkedList{
	int data;
	linkedList next;
	linkedList(int data){
		this.data=data;
		this.next=null;
	}
	public linkedList insert(linkedList head)
	{
		linkedList temp=head;
		if(head==null)
			{head=this;
				return head;
			}
		while (temp.next!=null)
			temp=temp.next;
		temp.next=this;
		return head;
		
	}
	
	public linkedList reverse(linkedList head)
	{
		linkedList temp;
		if (head==null|| head.next==null)
			return head;
		temp=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return temp;
	}
	public void display(linkedList head)
	{
		linkedList temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp=temp.next;
			
		}
	}
	public void findnth(linkedList head,int k)
	{
		if(head==null)
			
		for(int i=0;i<n-k+1;i++)
		{
			if(head==null)
			{
				System.out.println("Not posssible");
				return;
			}
			head=head.next;
		}
		System.out.println(k+" element is:"+head.data);
	}
	public linkedList reverse_Pairs(linkedList head)
	{
		//linkedList temp=head,t1=head;
		return null;
		
		
	}
	public boolean palindrome(linkedList head)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		linkedList temp=head;
		while(temp!=null)
		{
			al.add(temp.data);
			temp=temp.next;
		}
		int n=al.size();
		temp=head;
		for (int i=n-1;i>=n/2;i--)
		{
			if(temp.data!=al.get(i))
				return false;
			//System.out.println(al.get(i));
			temp=temp.next;
		}
		
		return true;
		
	}
	public String add2numbers(linkedList head)
	{
		String sum="";
		while(head!=null)
		{
			sum=sum+head.data+"";
			head=head.next;
		}
		return sum;
	}
	public int middle()
	{
		linkedList t1=this;
		linkedList t2=this;
		while(t1!=null)
		{
			if(t1.next!=null)
			{
				t1=t1.next.next;
				t2=t2.next;
			}
			if(t1!=null && t1.next==null)
				break;
		}
		return t2.data;
	}
	public boolean cycle()
	{
		linkedList t1=this;
		linkedList t2=this.next;
		while(t1!=null && t2!=null)
		{
			if(t1==t2)
				return true;
			t1=t1.next;
			t2=t2.next.next;
		}
		return false;
		
	}
}