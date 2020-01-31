package javaa;

import java.util.Scanner;
public class test {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList head=null;
		sc = new Scanner(System.in);
		int ch,ele;
		do
		{
			System.out.print("\nenter 1.insert 2.reverse 3.display 4.middle 5.add2Numbers 6.palindrome 7exit:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.print("enter element:");
				   ele=sc.nextInt();
				   linkedList new_n=new linkedList(ele);
				   head=new_n.insert(head);
				   break;
			case 2:head=head.reverse(head);
					break;
			case 3:head.display(head);
					break;
			case 4:System.out.println("middle value:"+head.middle());
					break;
			case 5:String s=(String) head.add2numbers(head);
					System.out.println("the Numbers are:"+s);
					break;
			case 6:if(head.palindrome(head))
					   System.out.println("Is a Palindrom");
				   else
					   System.out.println("Not a palindrome");
			case 7:	System.exit(0);
			}
			
			
		}while(ch!=5);

	}

}
