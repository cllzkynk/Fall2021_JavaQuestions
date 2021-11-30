package studentPractise;

import java.util.Scanner;

public class YonuBul {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int n1=sc.nextInt();
	        int t=n1%4;
	        if(t==0)
	        System.out.println("North");
	        else if(t==1)
	        System.out.println("East");
	        else if(t==2)
	        System.out.println("South");
	        else if(t==3)
	        System.out.println("West");
	    }
		// your code goes here
	}
}