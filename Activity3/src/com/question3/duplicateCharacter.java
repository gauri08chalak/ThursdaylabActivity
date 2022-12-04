//Author is Gauri

package com.question3;

import java.util.Scanner;
public class duplicateCharacter {

		public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String sr="Hello I am Gauri";
		System.out.println(sr);
		
		System.out.println("enter the String");
		String sr2=sc.nextLine();
		
		System.out.println("after the removing the duplicate character");
		for(int i=0; i<sr.length(); i++) {
			
			boolean b=false;
			for(int j=0;j<sr2.length(); j++) {
				if(Character.toLowerCase(sr.charAt(i))==Character.toLowerCase(sr2.charAt(j))) {
					b=true;
					break;
				}
			}
			if(b==false)
				System.out.print(sr.charAt(i));
		}
		
		}
		


}
