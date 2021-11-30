package studentPractise;

import java.util.Arrays;
import java.util.Scanner;

public class covid {

	public static void main(String[] args)
	{
		

Scanner in=new Scanner(System.in);
int ti=in.nextInt();
for(int ki=0;ki<ti;ki++) {
int n=in.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int count=1;
int p=0;
for(int i=0;i<n;i++) {
	a[i]=in.nextInt();
}
for(int t=0;t<n;t++) {
	for(int k=t;k>0;k--) {
		if(a[k]-a[k-1]<=2) {
			count++;
			System.out.println(t+"  "+count);
			}
		else 
			break;
		}	
for(int i=t;i<n;i++) {

if(i!=n-1&&a[i+1]-a[i]<=2) {
	count++;
	//System.out.println(t+"            "+count);
	 }

else {
	b[p]=count;
	p++;
	count=1;
	break;
}
}}
Arrays.sort(b);

System.out.println(b[0]+" "+b[n-1]);
	}
	}}