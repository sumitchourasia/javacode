package divideandConquer;

import java.util.Scanner;

public class MaxMin {
	int max;
	int min;
	static int[] arr;
	
	public int getMax(int m,int n) {
		if(m>n)
			return m;
		else
			return n;
	}
	
	public int getMin(int m,int n) {
		if(m<n)
			return m;
		else
			return n;
	}
	
	
	
	public int[] maxMin(int[] arr,int i,int j) {
	    int mid;
	    int result[] = new int[2];
	    
	    if (i==j) 
	    {
		    	max = min = arr[i];
	    }
	    else if (i==j-1) 
	    { 

		        if (arr[i] < arr[j]) 
		        {
		            this.max = getMax(this.max,arr[j]);
		            this.min = getMin(this.min,arr[i]); 
		        }
		        else 
		        {
			            this.max = getMax(this.max,arr[i]); 
			            this.min = getMin(this.min,arr[j]);
		        }
	     } 
	     else
	     {
	    	 	//divide
				mid = (i + j) / 2;
				//conquer
	            maxMin( arr, i, mid);    
	            maxMin( arr, mid+1, j);
	            //combine
	            result[0] = this.max;
	            result[1] = this.min;
	            System.out.println("max"+result[0]+  "and min "+result[1]+"this.max= "+this.max+"this.min="+this.min );
	           
	      }
	    return result;
        
	     }
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MaxMin obj=new MaxMin();
		System.out.println("enter the size of the array : ");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter the elements of the array : ");
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		obj.max=arr[0];
		obj.min=arr[0];
		System.out.println("max"+arr[0]+  "and min "+arr[0] );
		int[] result=obj.maxMin(arr,0,size-1);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
	

















