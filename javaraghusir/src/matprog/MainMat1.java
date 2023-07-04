package matprog;

public class MainMat1 
{
public static void main(String[] args) 
{
	int[][] mat= {{23,45,67,89},{65,87,98,28},{11,22,33,44}};
	for (int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
}
}
