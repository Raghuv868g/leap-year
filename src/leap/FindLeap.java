package leap;

import java.util.Scanner;

public class FindLeap {
	static int xq=0;

	public static void main(String[] args) {
		do {
		
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		if(x%4==0 && x%400==0&& x%100!=0)
		{
			System.out.println("its a prime no");
			xq++;
		}else {
			System.out.println("no"+"enter th e number again");}}
while(xq==0);}}