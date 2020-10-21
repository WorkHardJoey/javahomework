package mini;

import java.util.Scanner;

public class Mini2 {
	
	public static int indexOfSmallestElement(double[] array)
	{

	double mini;
    int i;
	mini=array[0];
	for (i=0;i<10;i++)
	{
		if (mini >= array[i])
			mini=array[i];		
	}
	for (i=0;i<10;i++)
	{
	if(mini == array[i])
	System.out.println("最小值下标是："+i);
	}
	return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array=new double [10];
		int i;
		Scanner input= new Scanner(System.in);
		for ( i=0; i<10; i++ )
		array[i]=input.nextDouble();
		indexOfSmallestElement(array);
	}	
}
