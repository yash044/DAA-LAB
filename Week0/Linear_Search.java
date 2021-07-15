import java.util.*;
public class Linear_Search
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search: ");
		int key_element=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key_element)
			{
				flag=1;
				System.out.println("Yes! The key element is found.");
				System.out.println("Number of comparisons are: "+(i+1));
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("The key element is not found.");
		}
	}
}