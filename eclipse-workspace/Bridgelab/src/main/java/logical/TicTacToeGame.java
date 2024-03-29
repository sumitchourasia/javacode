package main.java.logical;

import main.java.utility.*;

public class TicTacToeGame {
	
	
	public static void computerTurn(int[][] array) {
		int i=0;
		int j=0;
		while(true) {
			
			i=Utility.getRandomInt(3);
			//System.out.println("i= "+i);
			
			j=Utility.getRandomInt(3);
			//System.out.println("j= "+j);
			
			if(array[i][j]==0) 
			{
				array[i][j]=-1;
				return;
			}
			else
			{
				continue;
			}
		}
	}


	public static void userTurn(int[][] array)
	{
		int i=0;
	    int j=0;
		while(true) {
			System.out.println("enter the index i and j to place your mark : ");
			i=InputScanner.readInt();
			i=i%3;
			j=InputScanner.readInt();
			j=j%3;
		
			if(array[i][j]==0) 
			{
				array[i][j]=1;
				return;
			}
			else
			{
				System.out.println("already taken try again !!!");
				continue;
			}
		}	
	}

	public static int result(int[][]array) {
		int times=1;
		int sum=0;
		while(times<=2)
		{
			for(int i=0;i<3;i++)
			{
				sum=0;
				for(int j=0;j<3;j++)
				{
					if(times==1)
					{
						sum=sum+array[i][j];
					}
					else if(times==2)
					{
						sum=sum+array[j][i];
					}
				}
				if(sum==3||sum==-3)
				{
					return sum;
				}
			    }
			times++;
		 }
		
			 sum=0;
			 sum=array[0][0]+array[1][1]+array[2][2];
			 if(sum==3||sum==-3)
			 {
				 return sum;
			 }
			 else 
			 {
				sum=array[0][2]+array[1][1]+array[2][0];
				if(sum==3||sum==-3)
	  		 {
	  			 return sum;
	  		 }
			 }
			 
	return 0;
	}

	public static void checkStatus(int[][]array,int count)
	{
		int sum=result(array);
		if(sum==3||sum==-3)
		{
			if(sum==3)
				System.out.println("user won!!!");
			else
				System.out.println("computer won!!!");
			System.exit(0); 
		}
		else if(count==9) {
			System.out.println("draw!!!");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		
			int[][] array=new int[3][3];
			int count=0;
			System.out.println("game started !!! ");
			while(count<9)
			{
				System.out.println("user turn : ");
				userTurn(array);
				count++;
				Utility.print2DArray(array);
				checkStatus(array,count);
				System.out.println("computer turn :");
				computerTurn(array);
				count++;
				Utility.print2DArray(array);
				checkStatus(array,count);
			 }
		System.out.println("draw!!!");
	}

}


















