package javaa;

import java.util.Scanner;

public class testBST {

	private static Scanner sc;

	public static void main(String[] args) {
		BST head=null;
		sc = new Scanner(System.in);
		int ch,ele;
		do
		{
			System.out.print("\nenter 1.insert 2.delete 3.display 4.isBSST 5.min max 6.exit:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.print("enter element:");
				   ele=sc.nextInt();
				   BST new_n=new BST(ele);
				   head=new_n.insert(head);
				   break;
			case 2:System.out.print("enter element to delete:");
					ele=sc.nextInt();
					head=head.delete(head,ele);
					break;
			case 3:System.out.println("Inorder:");
					head.inorder(head);
					System.out.println("\npreorder:");
					head.preorder(head);
					System.out.println("\nPostorder:");
					head.postorder(head);
					System.out.println("\nLevel Order Traversal:");
					head.levelOrder(head);
					break;
			case 4://System.out.println("middle value:"+head.middle());
					if(head.isBST(head))
						System.out.println("is BST");
					else
						System.out.println("is Not BST");
						
				break;
			case 5:int arr[]=head.max_min(head);
					System.out.println("Maximum value of BST is:"+arr[1]);
					System.out.println("Minimum value of BST is:"+arr[0]);
					break;
			case 6:System.exit(0);
			}
			
			
		}while(ch!=5);

	}

}
