package string_Variation;

import java.util.Arrays;

public class MaxFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "100klh564abc365bg";
		
		String s1 = "";
		String sa []= {null,null,null,null,null,null,null};
		
		int a[] = {0,0,0,0,0,0,0};
		int index =0;
		for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			s1 = s1+s.charAt(i);
		}
		else {
			if(s1.length()>0)
			{
				sa[index++] = s1;
				s1 ="";
			}
			else {
				
			}
		}
			
		}
		for(int i=0;i<sa.length;i++)
		{
		 if(sa[i]==null)
			 break;
		 
		}
		
	}

}
