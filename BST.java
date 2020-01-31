package javaa;

import java.util.LinkedList;

public class BST {
	int data;
	BST left,right;

	public BST(int ele) {
		this.data=ele;
		left=right=null;
		}
	public BST insert(BST head)
	{
		if(head==null)
		{
			return this;
		}
		if(head.data > this.data)
		{
			head.left = insert(head.left);
		}
		else if(head.data < this.data)
		{
			head.right = insert(head.right);
		}
		return head;
		
	}
	public void inorder(BST head)
	{
		if(head!=null)
		{
			inorder(head.left);
			System.out.print(head.data+"\t");
			inorder(head.right);
		}
	}
	public void preorder(BST head)
	{
		if(head!=null)
		{
			
			System.out.print(head.data+"\t");
			preorder(head.left);
			preorder(head.right);
		}
	}
	public void postorder(BST head)
	{
		
		if(head!=null)
		{
			
			postorder(head.left);
			postorder(head.right);
			System.out.print(head.data+"\t");
		}
	}
	public void levelOrder(BST root){
        LinkedList<BST> arr=new LinkedList<BST>();
        arr.add(root);
        BST c=arr.get(0);
        while(c!=null)
        {
                System.out.print(c.data+" ");
                if(c.left!=null)
                    arr.add(c.left);
                if(c.right!=null)
                    arr.add(c.right);
                arr.removeFirst();
                if(arr.size()==0)
                    break;
                c=arr.get(0);
        }
    }

	public boolean isBST(BST head)
	{
		if(head.left==null || head.right==null)
		{
			return true;
			
		}
		else if(   (head.data > head.left.data ) && (head.right.data > head.data) )
		{
				return true && this.isBST(head.left) && this.isBST(head.right);
		}
		else {
			System.out.println("not BST.");
			return false;
		}
	}

	public BST delete(BST head,int data)
	{
		if(head==null)
		{
			return null;
		}
		if(head.data>data)
		{
			head.left=delete(head.left,data);
		}
		else if(head.data<data)
		{
			head.right=delete(head.right,data);
		}
		else
		{
			if(head.left==null)
			{
				System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
						BST temp= head.right;
						head=null;
						System.gc();
						return temp;
			}
			if(head.right==null)
			{
				System.out.println("bbbbbbbbbbbbbbbbbbbbbb");
				BST temp= head.left;
				head=null;
				System.gc();
				return temp;
			}
			if(head.right!=null &&head.left!=null)
			{
				BST temp=head.left;//old = null;
				while(temp.right!=null)
				{
					System.out.println("mammmmmm");
					//old=temp;
					temp=temp.right;
				}
						
				head.data=temp.data;
				System.out.println("minvalue:"+temp.data);
				head.left=delete(head.left,temp.data);
			}
			
		}
		return head;	
	}
	public int[] max_min(BST head)
	{
		int  arr[]=new int[2];
		BST temp=head;
		while(temp.left!=null)
			temp=temp.left;
		arr[0]=temp.data;
		temp=head;
		while(temp.right!=null)
			temp=temp.right;
		arr[1]=temp.data;
		return arr;
	}
	public void allPaths(BST head)
	{
		allPaths(head.left);
		allPaths(head.right);
	}
}