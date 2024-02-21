package string_Variation;

public class GoodOrBadString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aeioua?";

		boolean b = secondMrthod(s);
		if(b) {
			System.out.println("good");
		}else
		{
			System.out.println("bad");
		}
	}

	private static boolean secondMrthod(String s) {
		int cCount=0;
		int vCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				
				vCount++;
			cCount=0;
			}
		
		else if(ch=='?')
		{
			cCount=0;
			vCount=0;
		}
		else
		{
			cCount++;
			vCount=0;
		}
			if(vCount>5 || cCount>3)
				return false;
		}
	
		return true;
}
}
