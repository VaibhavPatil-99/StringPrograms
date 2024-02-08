package string;

public class ContainsDigitOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="123456";
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				count++;
		}
		}
		if(count==s1.length()) {
			System.out.println(s1 + " contains only digits");
		}
		else {
			System.out.println(s1 + " does not contain only digits");
		}
	}

}
