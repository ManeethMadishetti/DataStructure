package javaa;

import java.util.Scanner;

public class linear {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" numbers:");
		for (int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		System.out.print("\nEnter element to search:");
		int ele=sc.nextInt();
		sc.close();
		linearSearch(arr,ele);
		
	}

	private static void linearSearch(int[] arr, int ele) {
		// TODO Auto-generated method stub
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println(ele+" found at "+(i+1)+" th position ");
				return;
			}
		}
		System.out.println("Element Not Found");
		
		
	}

}
