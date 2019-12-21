package divideandConquer;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	static int[] arr;
	static int count=0;
	public static int[] mergeSort(int[] arr,int i,int j)
	{
		if(j-i<=1)
		{
			return arr;
		}
		else
		{
			count++;
			System.out.println("in merge sort");
			int mid = i+(j-i)/2;
			System.out.println(count+" time "+" mid :"+mid);
			
			mergeSort(arr,i,mid);
			
			mergeSort(arr,mid+1,j);
			
			merge(arr,i,mid,j);
		return arr;	
		}
		
	}
	
	public static int[] merge(int[] arr,int i,int mid,int j)
	{
		System.out.println("i = "+i +" mid= "+mid+" j = "+j);
		
		int[] left=new int[mid-i+1];
		int[] right=new int[j-mid+1];
		System.out.println("left size :"+left.length);
		System.out.println("right size :"+right.length);
		int m=i;
		int n=mid+1;
		int k=i;
		
		while(m<=mid)
		{
			left[m]=arr[k];
			k++;
			m++;
		}
		
		n=mid+1;
		m=0;
		while(n<=j) 
		{
			right[m]=arr[k];
			k++;
			n++;
			m++;
		}
		System.out.println("left :"+Arrays.toString(left));
		System.out.println("right :"+Arrays.toString(right));
		System.out.println("arr :"+Arrays.toString(arr));
		k=0;
		m=0;
		n=0;
		
		while( m<left.length && n<right.length ) 
		{
		  if(left[m]<right[n])
		  {
			  System.out.println("left of "+m+" = "+left[n]);
			  System.out.println("arr of "+k+" = "+arr[k]);
			  arr[k]=left[m];
			  k++;
			  m++;
			  System.out.println("right :"+Arrays.toString(arr));
		  }
		  else
		  {
			  System.out.println("right of "+n+" = "+right[n]);
			  System.out.println("arr of "+k+" = "+arr[k]);
			  arr[k]=right[n];
			  n++;
			  k++;
			  System.out.println("right :"+Arrays.toString(arr));
		  }
		  System.out.println("k = "+k+" n = "+n+" m ="+m);
		}
		
		System.out.println("arr :"+Arrays.toString(arr));
		System.out.println("k ="+k);
		while(m<left.length) 
		{
			arr[k]=left[m];
			k++;
			m++;
		}
		while(n<right.length)
		{
			arr[k]=right[n];
			n++;
			k++;
		}
		
		//System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter the array : ");
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		mergeSort(arr,0,size-1);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
