//package repeatingdig;

import java.util.Scanner;
class Pattern { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n ");
		String num = scan.next();
		boolean flag = false;
		char ch[] = num.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			for(int j=i+1;j<=ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					flag = true;
					break;
					}
				}
			}
		System.out.println(flag);
		if(flag==true) {
			System.out.println("number has duplicate ");
			} 
		else
		{
			System.out.println("number does not have duplicate");
			}
		}
	}
