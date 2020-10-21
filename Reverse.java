package reverse;
import java.util.*;
import java.util.Scanner;
public class Reverse {
	

	public static void printReversenum(int num){
		int a = num;
		int b = num;
		int reversenum = 0;
		while (a != 0)
		{
			b = a % 10;
			reversenum = reversenum * 10 + b;
			a /= 10;
		}
	System.out.println(reversenum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input= new Scanner(System.in);
		num=input.nextInt();
		printReversenum(num);
		
	}

}