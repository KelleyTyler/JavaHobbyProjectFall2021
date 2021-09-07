package test00;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.*;
public class TestProg {
	public static void main(String[] args) {
		int num=0;
		boolean bean=true;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Hello World");
		System.out.println("scanning things..");
		scnr.next();
		while(bean)
		{
			try {
				System.out.println("please type a number between 1 and 10:");
				num=scnr.nextInt();
				if(num>0&&num<10)
				{
					bean=false;
					System.out.println("very good");
				}
				else
					System.out.println("try again");
			}
			catch(InputMismatchException e)
			{
				System.out.println("\nNOT VALID INPUT\n TRY AGAIN\n\n");
				scnr.nextLine();
			}
		}
	}

}
