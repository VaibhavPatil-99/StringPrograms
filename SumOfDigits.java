package string;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="1v2b3c";
		int sum = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
				int num = s1.charAt(i)-48;
				sum = sum+num;
			}
		}
		System.out.println(sum);
	}

}
