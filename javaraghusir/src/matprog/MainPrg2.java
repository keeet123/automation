package matprog;
import java.util.Scanner;
public class MainPrg2 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the order of the matrix: ");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] mat=new int[row][col];
	System.out.println("enter "+row*col+" integer values row wise ");
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			mat[i][j]=sc.nextInt();
		}
	}
	System.out.println("user entered matrix: ");
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
}
}
