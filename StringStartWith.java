package string;

public class StringStartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcde";
		String s2 = "ab";
		
		//System.out.println(s1.startsWith(s2));
		
		if(s2.length()<=s1.length()) {
			int count=0;
			int i=0;
			
			while(i<s2.length()) {
				if(s1.charAt(i) == s2.charAt(i)) 
				{
					count++;
				}
				i++;
			}
			if(count == s2.length()) {
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println(false);
		}
	}

}
