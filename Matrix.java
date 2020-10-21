package matrix;
import java.util.*;
import java.util.Scanner;
public class Matrix 
{
		public static void printMatrix (int n)
		{
			int a;
			int i;
			for ( i=0; i<n; i++ )
			{
                for ( a=0; a<n; a++ )
                {
                	System.out.printf("%d ",(int) (Math.random() * 2));
                }
						System.out.printf("\n");
			}
	
		 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
		Scanner input= new Scanner(System.in);
		n=input.nextInt();
		printMatrix(n);
    }

}
