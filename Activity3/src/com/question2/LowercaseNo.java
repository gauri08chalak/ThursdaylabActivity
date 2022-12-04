//Author is Gauri

package com.question2;

public class LowercaseNo {


		public static void main(String[] args) {
			
			String s="gauri_chalak";
			boolean b=false;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='_')
				{
					char c=s.charAt(i+1);
					if(Character.isLowerCase(c))
					{
						b=true;
						break;
					}
				}
			}
			
			if(b)
			System.out.println("Matched");
			else
				System.out.println("Not Matched");
		}

	}

