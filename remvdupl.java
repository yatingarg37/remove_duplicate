package assignments;

import java.util.Scanner;

public class removeadddupl {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		char ch[]=str.toCharArray();
		String str1="";
		if(ch[0]!=ch[1]) {
			str1=str1+ch[0];
		}
		int i=1;
		for(i=1;i<ch.length-1;i++) {
			if(ch[i]!=ch[i-1] && ch[i]!=ch[i+1]) {
				str1 = str1 + ch[i];
			}
		}
		if(ch[i]!=ch[i-1]) {
			str1=str1+ch[i];
		}
		System.out.println(str1);
	}
}
