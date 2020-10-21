package sumMajorDiagonal;

import java.util.Scanner;

public class SumMajorDiagonal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int n;
		double sumMajor;
		Scanner input= new Scanner(System.in);
		n=input.nextInt();
        double [][]m=new double [n][n];
        for (i=0;i<n;i++)
        {
        for (j=0;j<n;j++)
        {
    		m[i][j]=input.nextDouble();
        }
        }
        sumMajor=sumMajorDiagonal(m);
        System.out.println("该矩阵主对角线之和为："+sumMajor);
	}
	public static double sumMajorDiagonal(double [][]m)
	{
		double sum=0;
		int i;
	for (i=0;i<m.length;i++)
	{
				sum=sum+m[i][i];
	}
	return sum;
	}
	
}
