package java第二次作业;

public class Countrandom {
	public static void countRandom(int []b) {
		int i;
		int j;
		int num=0;
		int []counts=new int[10];
			for (j=0;j<10;j++)
			{
				for ( i=0; i<100; i++)
				{
					if (b[i]==j)
					num=num+1;
				}	
			        counts[j]=num;
		            System.out.println(counts[j]);
		            num=0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int []a=new int[100];
		int count=0;
		for ( i=0; i<100; i++)
		{
			a[i]=(int) (Math.random() * 10);	
			System.out.println(a[i]);
		}
		countRandom(a);
	}
}