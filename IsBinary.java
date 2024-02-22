package string_Variation;

public class IsBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="1010101010";
		int result = isBinary(s);
		System.out.println(result);
	}

	private static int isBinary(String s) 
	{
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
		if(ch=='0' || ch=='1') {
			
		}
		else
			return 0;
		
		}
		return 1;
	}

}
